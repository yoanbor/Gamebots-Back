/**
 * Controller class for retrieving all images in the presentation layer.
 * This controller handles HTTP GET requests to fetch all images and return them as a list of ImageDTO objects.
 */
package co.simplon.gamebotsback.presentation.controller.image;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.gamebotsback.business.dto.Imagedto;
import co.simplon.gamebotsback.business.service.image.Iimageservice;

@RestController
public class GetAllImagesController {

  private final Iimageservice imageService;

  /**
   * Constructs a new GetAllImagesController with the specified image service.
   *
   * @param imageService The image service used to retrieve all images.
   */
  @Autowired
  public GetAllImagesController(Iimageservice imageService) {
    this.imageService = imageService;
  }

  /**
   * Handles HTTP GET requests to fetch all images.
   *
   * @return A list of ImageDTO objects representing all images.
   */
  @GetMapping("/images")
  public List<Imagedto> findAllImages() {
    return imageService.getAll();
  }

}
