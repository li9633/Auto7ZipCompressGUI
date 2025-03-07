package com.auto7zip.view;

import java.util.ArrayList;

import com.auto7zip.config.content.ButtonContent;
import com.auto7zip.services.FileServices;

import com.auto7zip.services.ProgramServices;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Win_Main extends Application {
    private ArrayList<StyledButton> buttons = new ArrayList<>();
    private Stage MainWindow;
    private Scene primaryWidget;

    public Win_Main(String[] args) {
        launch(args);
    }

    public Win_Main() {
        ;
    }

    @Override
    public void start(Stage stage) {
        this.MainWindow = stage;
        initWindow();
        initButton();
        configButton();
        stage.show();
    }

    private void initWindow() {
        MainWindow.setTitle("Auto7zipCompress");
        MainWindow.setWidth(800);
        MainWindow.setHeight(400);
    }

    private void initButton() {

        for (int i = 0; i < 4; i++) {
            buttons.add(new StyledButton());
        }
        FlowPane flowpane = new FlowPane();
        flowpane.setVgap(10);
        flowpane.setHgap(10);
        flowpane.setPadding(new Insets(10));
        flowpane.getChildren().addAll(buttons);
        this.primaryWidget = new Scene(flowpane, 0, 0);
        MainWindow.setScene(primaryWidget);
    }

    private void configButton() {
        for (StyledButton b : buttons) {
            b.setButtonText(ButtonContent.getButtonText().get(buttons.indexOf(b)));
        }

        buttons.get(ButtonContent.getButtonText().indexOf("Exit")).setClickHandler(e -> System.out.println("test"));
        buttons.get(0).setClickHandler(e -> FileServices.selectionFolder(MainWindow));
//        buttons.get(3).setClickHandler(e -> ProgramServices.exitProgram());
    }

}
