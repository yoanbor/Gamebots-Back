package co.simplon.gamebotsback.unit.business.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtEncoder;

import co.simplon.gamebotsback.business.service.token.CustomUserDetailsService;
import co.simplon.gamebotsback.business.service.token.TokenService;

class TokenServiceTest {

  @Mock
  Jwt jwt;

  String username = "username";

  String password = "password";

  int userId = 1;

  String hashedPassword = "hashedPassword";

  @Mock
  private CustomUserDetailsService userDetailsService;

  @Mock
  private JwtEncoder encoder;

  @Mock
  private PasswordEncoder passwordEncoder;

  private TokenService tokenService;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    tokenService = new TokenService(encoder, userDetailsService, passwordEncoder);
    UserDetails userDetails = User.withUsername(username)
        .password(hashedPassword)
        .build();

    when(userDetailsService.loadUserByUsername(username)).thenReturn(userDetails);
    when(encoder.encode(any())).thenReturn(jwt);
    when(jwt.getTokenValue()).thenReturn("encodedToken");
  }

  @Test
  @DisplayName("Generate Token with Valid Credentials Should Return Token")
  void generateToken_ValidCredentials_ReturnsToken() {
    when(passwordEncoder.matches(password, hashedPassword)).thenReturn(true);

    String token = tokenService.generateToken(username, password, userId);

    assertEquals("encodedToken", token);

    verify(userDetailsService).loadUserByUsername(username);
    verify(passwordEncoder).matches(password, hashedPassword);
    verify(encoder).encode(any());
  }

  @Test
  @DisplayName("Generate Token with Invalid Credentials Should Throw Exception")
  void generateToken_InvalidCredentials_ThrowsException() {

    when(passwordEncoder.matches(password, hashedPassword)).thenReturn(false);

    assertThrows(RuntimeException.class, () -> tokenService.generateToken(username, password, userId));
  }
}
