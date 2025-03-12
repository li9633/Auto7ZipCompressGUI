package com.auto7zip.view.dialog;

import com.auto7zip.view.StyledButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.Objects;

public class CustomDialog<T> extends Dialog<T> {

    private final HBox buttonContainer = new HBox();
    private final BorderPane rootpane = new BorderPane();
    private final ArrayList<CustomOptionButton<Void>> defaultButtons = new ArrayList<CustomOptionButton<Void>>() {{
        add(new CustomOptionButton<>("OK"));
        add(new CustomOptionButton<>("Cancel"));
    }};

    public static final int StyleButtonOk = 0;
    public static final int StyleButtonCancel = 1;

    public CustomDialog() {
        InitStyle();
        InitPanel();
//        ClearAllButtons();
        InitButtonContainer();
        setDefaultButtons();
        getDialogPane().setContent(rootpane);
    }

    private void setDefaultButtons() {
        defaultButtons[StyleButtonOk].setButtonText("OK");
        defaultButtons[StyleButtonCancel].setButtonText("Cancel");
        buttonContainer.getChildren().addAll(defaultButtons);
        defaultButtons[StyleButtonOk].setClickHandler(event -> {
            this.setResult((T) null);
            this.close();
        });
        defaultButtons[StyleButtonCancel].setClickHandler(event -> {
            this.close();
        });
    }

    public static CustomOptionButton[] getDefaultButtons() {
        return defaultButtons;
    }

    private void InitButtonContainer() {
        buttonContainer.setAlignment(Pos.BOTTOM_RIGHT);
        buttonContainer.setSpacing(5);
        buttonContainer.setPadding(new Insets(5));
    }

    private void InitPanel() {
        rootpane.setPadding(Insets.EMPTY);
        rootpane.setBottom(buttonContainer);
    }

    private void InitStyle() {
        getDialogPane().getStylesheets().add(Objects.requireNonNull(getClass().getResource("/css/CustomDialog.css")).toExternalForm());
        getDialogPane().getStyleClass().add("CustomDialog");
    }

    private void ClearAllButtons() {
        this.getDialogPane().getButtonTypes().clear();
    }


    public void setButtons(StyledButton st) {
        buttonContainer.getChildren().add(st);
    }
}
