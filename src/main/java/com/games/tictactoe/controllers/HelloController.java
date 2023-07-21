package com.games.tictactoe.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * HelloController is the class that controls the list of players
 * @FXML tag connects the class parameter to the appropriate element on the GUI
 * */
public class HelloController implements Initializable {

    @FXML
    private ListView<String> testListView;

    @FXML
    private Label testLabel;

    String[] playersData = { "Player 1: 2", "Player 4: 212", "Player 7: 2", "Player 11: 52",};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        testListView.getItems().addAll(playersData);

        testListView.getSelectionModel().selectedItemProperty().addListener(e-> {
            String selectedPlayer = testListView.getSelectionModel().getSelectedItem();
            testLabel.setText(selectedPlayer);
        });

    }
}
