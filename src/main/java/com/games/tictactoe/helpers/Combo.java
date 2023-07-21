package com.games.tictactoe.helpers;

public class Combo {
    public Tile[] tiles;


    // combo(Tile t1, Tile t2)
    public Combo(Tile... _tiles) {
        this.tiles = _tiles;
    }

    public boolean isComplete() {
        if(tiles[0].getValue().isEmpty())
            return false;

        // String

        return tiles[0].getValue().equals(tiles[1].getValue())
                && tiles[0].getValue().equals(tiles[2].getValue());

    }
}
