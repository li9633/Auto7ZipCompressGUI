package com.Auto7zip.view;

import java.util.ArrayList;

import com.Auto7zip.config.style.ButtonStyleConfig;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Win_Main extends Application {
    private ArrayList<StyledButton> buttons = new ArrayList<>();

    public Win_Main(String[] args) {
        launch(args);
    }

    public Win_Main() {
        ;
    }

    @Override
    public void start(Stage stage) {

        initWindow(stage);
        initButton(stage);
        configButton(stage);
        stage.show();
    }

    private void initWindow(Stage stage) {
        stage.setTitle("Auto7zipCompress");
        stage.setWidth(800);
        stage.setHeight(400);
    }

    private void initButton(Stage stage) {

        for (int i = 0; i < 4; i++) {
            buttons.add(new StyledButton());
        }
        FlowPane flowpane = new FlowPane();
        flowpane.setVgap(10);
        flowpane.setHgap(10);
        flowpane.setPadding(new Insets(10));
        flowpane.getChildren().addAll(buttons);
        Scene scene = new Scene(flowpane, 0, 0);
        stage.setScene(scene);
    }

    private void configButton(Stage stage) {
        StyledButton button = new StyledButton();
        button.setButtonText("Test Button");
        button.setOnAction(_ -> {
            button.setbgColor("#8130c4");
            button.setTextColor("#943636");
        });
    }

}
