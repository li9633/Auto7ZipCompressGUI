package com.auto7zip.view;

import java.util.*;
import java.util.function.BiConsumer;

import com.auto7zip.config.content.ButtonContent;
import com.auto7zip.controller.ButtonController;
import com.auto7zip.model.AppStatus;

import com.auto7zip.util.LanguageManager;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Win_Main extends Application {
    private final ArrayList<StyledButton> buttons = new ArrayList<>();
    private static Stage MainWindow;
    private Scene primaryWidget;
    ResourceBundle bundle = null;
    private Map<String, Integer> buttonNameToIndex;

    public Win_Main(String[] args) {
        launch(args);
    }

    public Win_Main() {

    }

    @Override
    public void start(Stage stage) {
        MainWindow = stage;
        initLanguage();
        initWindow();
        initButton();
        configButton();
        stage.show();
    }

    private void initWindow() {
        MainWindow.setTitle(bundle.getString("app.title"));
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

    private void initLanguage() {
        AppStatus.setResourceBundle(LanguageManager.getResourceBundle(Locale.getDefault().getLanguage()));
//        AppStatus.setResourceBundle(LanguageManager.getResourceBundle("zh"));
        this.bundle = AppStatus.getResourceBundle();
    }

    private void configButton() {
        List<String> buttonNames = ButtonContent.getButtonTextGeneral();
        buttonNameToIndex = new HashMap<>();
        for (int i = 0; i < buttonNames.size(); i++) {
            buttonNameToIndex.put(buttonNames.get(i), i);
        }
        if (buttons.size() != buttonNames.size()) {
            throw new IllegalArgumentException(bundle.getString("error.buttoncounterror"));
        }
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setButtonText(buttonNames.get(i));
        }
        System.out.println(buttonNameToIndex);
        setupButton("button.select.text", ButtonController::selectFolderButtonClick);
        setupButton("button.compress.text", ButtonController::compressButtonClick);
        setupButton("button.cancel.text", ButtonController::cancelButtonClick);
        setupButton("button.exit.text", ButtonController::exitButtonClick);
    }


    private void setupButton(String buttonName, EventHandler<ActionEvent> handler) {
        buttons.get(buttonNameToIndex.get(bundle.getString(buttonName))).setClickHandler(handler);
    }

    public static Stage getMainWindow() {
        return MainWindow;
    }

}
