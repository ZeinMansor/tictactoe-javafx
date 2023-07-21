package com.games.tictactoe.player;


import java.util.List;

/**
 * Implement this interface in your player class
 * */

public interface PlayerInterface {



    /**
     * Save the player to the CSV file, if exist update the info
     * @param player
     * */
    public void savePlayer(Player player);



    /**
     * Read the player data from the CSV file, get the player
     * @return Player the player we are looking for, null if does not exist in the file
     * @param id the player id
     * */
    public Player getPlayerByID(long id);

    /**
     * Get a list of all the players data from the CSV file
     * @return List<Player> all saved players
     *
     * */
    public List<Player> getPlayers();


}
