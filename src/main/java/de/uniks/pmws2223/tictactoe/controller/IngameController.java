package de.uniks.pmws2223.tictactoe.controller;

import de.uniks.pmws2223.tictactoe.App;
import javafx.scene.Parent;

import java.io.IOException;

public class IngameController implements Controller {
    private final App app;

    public IngameController(App app) {
        this.app = app;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void init() {
    }

    @Override
    public Parent render() throws IOException {
        return null;
    }

    @Override
    public void destroy() {
    }
}