package de.uniks.pmws2223.tictactoe;

import de.uniks.pmws2223.tictactoe.controller.Controller;
import de.uniks.pmws2223.tictactoe.controller.SetupController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private Stage stage;
    private Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        primaryStage.setScene(new Scene(new Label("Loading...")));
        primaryStage.setTitle("Tic-Tac-Toe");

        show(new SetupController(this));
        primaryStage.show();

        primaryStage.setOnCloseRequest(e -> controller.destroy());
    }

    public void show(Controller controller) {
        controller.init();
        try {
            stage.getScene().setRoot(controller.render());
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }

        if (this.controller != null) {
            this.controller.destroy();
        }
        this.controller = controller;
        stage.setTitle(controller.getTitle());
    }
}