package co.simplon.gamebotsback.unit.presentation.controllers.game;

import co.simplon.gamebotsback.business.dto.Gamedto;
import co.simplon.gamebotsback.business.service.game.Igameservice;
import co.simplon.gamebotsback.presentation.controller.game.GetGameByIdController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GetGameByIdControllerTest {

  @InjectMocks
  private GetGameByIdController controller;

  @Mock
  private Igameservice gameService;

  @Test
  void getGameById() {
    when(gameService.getById(anyInt())).thenReturn(new Gamedto());
    Gamedto gamedto = controller.findGameById(anyInt());
    verify(gameService, times(1)).getById(anyInt());
    assertEquals(Gamedto.class, gamedto.getClass());
  }
}