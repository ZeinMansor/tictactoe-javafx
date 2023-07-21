package com.games.tictactoe.helpers;

import com.games.tictactoe.HelloApplication;
import javafx.geometry.Pos;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Tile extends StackPane {

    private boolean playable = true;
    private Text text = new Text();
    public Tile() {
        Rectangle border = new Rectangle(200, 200);
        border.setFill(null);
        border.setStroke(Color.BLACK);
        setAlignment(Pos.CENTER);
        text.setFont(Font.font(72));
        getChildren().addAll(border, text);


        // VARIABLE_NAME -> {  }
        setOnMouseClicked(e -> {
            if(HelloApplication.endOfGame || !playable)
                return;

            if(e.getButton() == MouseButton.PRIMARY) {
                if(!HelloApplication.turnX)
                    return;
                drawX();
                HelloApplication.turnX = false;
                playable = false;
                HelloApplication.checkState();
            } else if(e.getButton() == MouseButton.SECONDARY) {
                if(HelloApplication.turnX)
                    return;
                drawO();
                HelloApplication.turnX = true;
                playable = false;

                HelloApplication.checkState();
            }
        });
    }

    public String getValue() {
        return this.text.getText();
    }

    public double getCenterX() {
        return getTranslateX() + 100;
    }
    public double getCenterY() {
        return getTranslateY() + 100;
    }


    private void drawX() {
        text.setText("X");
    }

    private void drawO() {
        text.setText("O");
    }


}
