package com.Auto7zip.GUI;

import java.util.ArrayList;

import com.Auto7zip.config.button_config;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class win_main extends Application {
    private ArrayList<newButton> buttons = new ArrayList<>();

    public win_main(String[] args) {
        launch(args);
    }

    public win_main() {
        ;
    }

    @Override
    public void start(Stage stage) {

        initWindow(stage);
        initButton(stage);
        configButton();
        stage.show();
    }

    private void initWindow(Stage stage) {
        stage.setTitle("Auto7zipCompress");
        stage.setWidth(800);
        stage.setHeight(400);
    }

    private void initButton(Stage stage) {

        for (int i = 0; i < 4; i++) {
            buttons.add(new newButton("Uninit Button"));
        }
        FlowPane flowpane = new FlowPane();
        flowpane.setVgap(10);
        flowpane.setHgap(10);
        flowpane.setPadding(new Insets(10));
        flowpane.getChildren().addAll(buttons);
        Scene scene = new Scene(flowpane, 0, 0);
        stage.setScene(scene);
    }

    private void configButton() {
        button_config.getButtonNames().forEach((name) -> {
            buttons.get(button_config.getButtonNames().indexOf(name)).setText(name);
        });
    }

}
