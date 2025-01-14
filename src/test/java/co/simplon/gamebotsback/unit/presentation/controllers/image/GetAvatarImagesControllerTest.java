package co.simplon.gamebotsback.unit.presentation.controllers.image;

import co.simplon.gamebotsback.business.dto.Imagedto;
import co.simplon.gamebotsback.business.service.image.Iimageservice;
import co.simplon.gamebotsback.presentation.controller.image.GetAvatarImagesController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GetAvatarImagesControllerTest {

  @InjectMocks
  private GetAvatarImagesController getAvatarImagesController;

  @Mock
  private Iimageservice imageService;

  @Test
  @DisplayName("Test de récupération de tous les avatars depuis le controller")
  void getAvatarImages() {
    when(imageService.getImagesByAvatarType()).thenReturn(List.of(new Imagedto()));
    getAvatarImagesController.getAvatarImages();
    verify(imageService, times(1)).getImagesByAvatarType();
  }
}
