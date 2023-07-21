package com.games.tictactoe.player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Player {
    public long id;
    public String name;
    public int score;


    // save the data on the csv file
    public void savePlayer() {

    }



    // return the specified player by name
    public Player getPlayer(String name) {
        File file = new File("PlayersData.csv");
        try {
            Scanner scanner = new Scanner(file);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    // Get all players
    public List<Player> getAllPlayers() {


        return null;
    }


}
