package co.simplon.gamebotsback.unit.presentation.controllers.user;

import co.simplon.gamebotsback.business.service.user.Iuserservice;
import co.simplon.gamebotsback.presentation.controller.user.DeleteUserAccountController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class DeleteUserAccountControllerTest {

  @InjectMocks
  private DeleteUserAccountController controller;

  @Mock
  private Iuserservice userService;

  @Test
  void deleteUserAccount() {
    doNothing().when(userService).deleteAccount(anyInt());
    controller.deleteuseraccountbyid(anyInt());
    verify(userService, times(1)).deleteAccount(anyInt());
  }
}