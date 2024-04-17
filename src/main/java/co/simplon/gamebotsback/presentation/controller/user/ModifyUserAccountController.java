/**
 * Controller class responsible for handling HTTP requests related to modifying user accounts.
 * This controller receives a PUT request with the user ID and updated user data in JSON format,
 * and delegates the modification of the user account to the UserService.
 */
package co.simplon.gamebotsback.presentation.controller.user;

import co.simplon.gamebotsback.business.dto.UserDTO;
import co.simplon.gamebotsback.business.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyUserAccountController {

    private final IUserService userService;

    /**
     * Constructor for the ModifyUserAccountController.
     *
     * @param userService The UserService used to modify user accounts.
     */
    @Autowired
    public ModifyUserAccountController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Handles a PUT request to modify a user account.
     *
     * @param id       The ID of the user account to be modified.
     * @param userDTO  The UserDTO object containing the updated user data.
     */
    @PutMapping("/users/{id}")
    public void modifyUserAccount(@PathVariable int id, @RequestBody UserDTO userDTO) {
        userService.modifyAccount(id, userDTO);
    }
}
