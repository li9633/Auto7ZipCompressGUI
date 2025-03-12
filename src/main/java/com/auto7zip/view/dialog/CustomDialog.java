package com.auto7zip.view.dialog;

import com.auto7zip.config.content.ButtonContent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.Objects;

public class CustomDialog<T> extends Dialog<T> {

    private final HBox buttonContainer = new HBox();
    private final BorderPane rootpanel = new BorderPane();
    private static ArrayList<CustomOptionButton<String>> defaultButtons = new ArrayList<>() {{
        add(new CustomOptionButton<>());
        add(new CustomOptionButton<>());
    }};

    public static final int StyleButtonOk = 0;
    public static final int StyleButtonCancel = 1;

    public CustomDialog() {
        InitStyle();
        InitPanel();
        CleanButtons();
        InitButtonContainer();
        setDefaultButtons();
        getDialogPane().setContent(rootpanel);
    }

    public void setDialogContentText(String text) {
        Label label = new Label();
        label.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/css/CustomDialog.css")).toExternalForm());
        label.getStyleClass().add("ContentText");
        label.setText(text);
        HBox labelpanel = new HBox();
        labelpanel.getChildren().add(label);
        labelpanel.setPadding(new Insets(5));
        labelpanel.setSpacing(2);
        labelpanel.setAlignment(Pos.CENTER);
        rootpanel.setTop(labelpanel);
    }

    private void setDefaultButtons() {
        int count = 0;
        for (CustomOptionButton<String> button : defaultButtons) {
            button.setButtonText(ButtonContent.getUninitButtonText() + count);
            button.setResultValue(ButtonContent.getUninitButtonText() + count);
            button.setButtonSize(80, 20);
            button.setResultHandler(event -> {
                this.setResult((T) button.getResultValue());
                this.close();
            });
            count++;
        }

        buttonContainer.getChildren().addAll(defaultButtons);
    }

    public void setDefaultButtonText(int buttonindex, String text) {
        defaultButtons.get(buttonindex).setButtonText(text);
        defaultButtons.get(buttonindex).setResultValue(text);
    }

    public ArrayList<CustomOptionButton<String>> getDefaultButtons() {
        return defaultButtons;
    }

    public void CleanButtons() {
        defaultButtons.clear();
        buttonContainer.getChildren().clear();
        defaultButtons = new ArrayList<>() {{
            add(new CustomOptionButton<>());
            add(new CustomOptionButton<>());
        }};
    }

    private void InitButtonContainer() {
        buttonContainer.setAlignment(Pos.BOTTOM_CENTER);
        buttonContainer.setSpacing(5);
        buttonContainer.setPadding(new Insets(5));
    }

    private void InitPanel() {
        rootpanel.setPadding(Insets.EMPTY);
        rootpanel.setBottom(buttonContainer);
    }

    private void InitStyle() {
        getDialogPane().getStylesheets().add(Objects.requireNonNull(getClass().getResource("/css/CustomDialog.css")).toExternalForm());
        getDialogPane().getStyleClass().add("CustomDialog");
    }

    private void ClearAllButtons() {
        this.getDialogPane().getButtonTypes().clear();
    }


    public void setButtons(CustomOptionButton<String> st) {
        buttonContainer.getChildren().add(st);
        defaultButtons.add(st);
        defaultButtons.get(defaultButtons.size() - 1).setResultValue(st.getText());
        defaultButtons.get(defaultButtons.size() - 1).setButtonSize(80, 20);
        defaultButtons.get(defaultButtons.size() - 1).setResultHandler(event -> {
            this.setResult((T) st.getResultValue());
            this.close();
        });
    }
}
