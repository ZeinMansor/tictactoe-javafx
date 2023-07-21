package com.games.tictactoe;

import com.games.tictactoe.helpers.Combo;
import com.games.tictactoe.helpers.Tile;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    public static boolean turnX = true;
    public static boolean endOfGame = false;
    private Tile[][] board = new Tile[3][3];
    private static List<Combo> combos = new ArrayList<Combo>();
    private static Pane root = new Pane();

    private Parent createContent() {
        root.setPrefSize(600, 600);

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                Tile tile = new Tile();
                tile.setTranslateX(j * 200);
                tile.setTranslateY(i * 200);

                root.getChildren().add(tile);
                board[j][i] = tile;
            }
        }

        // Horizontal checking
        for (int y = 0; y < 3; y++) {
            combos.add(new Combo(board[0][y], board[1][y], board[2][y]));
        }

        // Vertical checking
        for (int x = 0; x < 3; x++) {
            combos.add(new Combo(board[x][0], board[x][1], board[x][2]));
        }

        // Diagonal
        combos.add(new Combo(board[0][0], board[1][1], board[2][2]));
        combos.add(new Combo(board[2][0], board[1][1], board[0][2]));

        return root;
    }

    public static void checkState() {

        for(Combo combo: combos){
            if(combo.isComplete()) {
                endOfGame = true;
                playWinAnimation(combo);
                return;
            }
        }
    }

    private static void playWinAnimation(Combo combo) {
        Line line = new Line();
        line.setStartX(combo.tiles[0].getCenterX());
        line.setStartY(combo.tiles[0].getCenterY());
        line.setEndX(combo.tiles[0].getCenterX());
        line.setEndY(combo.tiles[0].getCenterY());

        root.getChildren().add(line);

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
                new KeyValue(line.endXProperty(), combo.tiles[2].getCenterX()),
                new KeyValue(line.endYProperty(), combo.tiles[2].getCenterY())));

        timeline.play();
    }


    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(createContent()));

        /*
          to display the players dashboard, add a button to change the window to our new window,
          in development, you can comment line 91, and un-comment line 98 -> 100 to display  the dashboard
        * **/

        // Parent element = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        // Scene scene = new Scene(element);
        // primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}