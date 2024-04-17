/**
 * The <code>IGameService</code> interface defines operations available for managing games.
 */
package co.simplon.gamebotsback.business.service.game;

import java.util.List;

import co.simplon.gamebotsback.business.dto.GameDTO;

/**
 * The <code>IGameService</code> interface defines operations available for managing games.
 */
public interface IGameService {

    /**
     * Retrieves all available games.
     *
     * @return A list of available games.
     */
    List<GameDTO> getAll();

    /**
     * Retrieves information about a game based on its ID.
     *
     * @param id The ID of the game.
     * @return Information about the game corresponding to the given ID.
     */
    GameDTO getById(final int id);

}
