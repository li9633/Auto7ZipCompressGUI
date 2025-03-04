package com.Auto7zip.view;

import java.util.function.Consumer;


import com.Auto7zip.config.style.ButtonStyleConfig;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

public class StyledButton extends Button {
    private Consumer<Void> onClickHandler;
    private SimpleStringProperty bgcolor = new SimpleStringProperty("#6789e7");
    private SimpleStringProperty textcolor = new SimpleStringProperty("#FFFFFF");

    public StyledButton() {
        super("Uninit Button");
        applyDefaultStyle();
        setOnAction(null);
        setStylebinding();
    }

    public void setClickHandler(Consumer<Void> handler) {
        this.onClickHandler = handler;
    }

    private void setClickAction() {
        this.setOnAction(_ -> {
            if (onClickHandler != null) {
                onClickHandler.accept(null);
            }
        });
    }

    public void setButtonSize() {
        this.resize(ButtonStyleConfig.getButtonWidth(), ButtonStyleConfig.getButtonHeight());
    }

    private void applyDefaultStyle() {
        String cssPath = getClass().getResource("/css/newButton.css").toExternalForm();

        String cssStyle = String.format("""
                .buttonSize{
                    -fx-min-width: %s;
                    -fx-min-height: %s;
                    -fx-background-radius: %s;
                    -fx-border-radius: %s;
                }
                }""",
                ButtonStyleConfig.getStyleForStyle(ButtonStyleConfig.getButtonWidth()),
                ButtonStyleConfig.getStyleForStyle(ButtonStyleConfig.getButtonHeight()),
                ButtonStyleConfig.getStyleForStyle(ButtonStyleConfig.getButtonRadius()),
                ButtonStyleConfig.getStyleForStyle(ButtonStyleConfig.getButtonRadius()));
        this.getStylesheets().add(
                "data:text/css;charset=UTF-8," + cssStyle);
        this.getStylesheets().add(cssPath);
        this.getStyleClass().add("CustomStyle");
    }

    private void setStylebinding() {
        styleProperty()
                .bind(Bindings.createStringBinding(() -> String.format(
                        "-fx-background-color: %s;" +
                                "-fx-text-fill: %s",
                        bgcolor.get(), textcolor.get()),
                        bgcolor, textcolor));
    }

    public void setbgColor(String color) {
        bgcolor.set(color);
    }

    public void setButtonText(String text) {
        super.setText(text);
    }

    public void setTextColor(String color) {
        textcolor.set(color);
    }

}
