module com.games.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.games.tictactoe to javafx.fxml;
    exports com.games.tictactoe;
    exports com.games.tictactoe.controllers to javafx.fxml;
    opens com.games.tictactoe.controllers to javafx.fxml;
}