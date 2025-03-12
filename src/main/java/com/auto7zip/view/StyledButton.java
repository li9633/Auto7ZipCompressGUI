package com.auto7zip.view;

import java.util.Objects;

import com.auto7zip.config.style.ButtonStyleConfig;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class StyledButton extends Button {
    private EventHandler<ActionEvent> onClickHandler;
    private SimpleStringProperty bgcolor = new SimpleStringProperty(ButtonStyleConfig.getButtonBgColor());
    private SimpleStringProperty textcolor = new SimpleStringProperty(ButtonStyleConfig.getButtonTextColor());
    private SimpleStringProperty width = new SimpleStringProperty(
            ButtonStyleConfig.getStyleForStyle(ButtonStyleConfig.getButtonWidth()));
    private SimpleStringProperty height = new SimpleStringProperty(
            ButtonStyleConfig.getStyleForStyle(ButtonStyleConfig.getButtonHeight()));
    private SimpleStringProperty radius = new SimpleStringProperty(
            String.valueOf(ButtonStyleConfig.getButtonRadius()));
    private SimpleStringProperty fontsize = new SimpleStringProperty(
            ButtonStyleConfig.getStyleForStyle(ButtonStyleConfig.getButtonFontSize()));

    public StyledButton() {
        super();
        applyDefaultStyle();
        setClickHandler(null);
        setStyleBinding();
    }

    public void setClickHandler(EventHandler<ActionEvent> handler) {
        this.onClickHandler = handler;
        setOnAction(handler);
    }

    public void setButtonSize(int width, int height) {
        this.width.set(ButtonStyleConfig.getStyleForStyle(width));
        this.height.set(ButtonStyleConfig.getStyleForStyle(height));
    }

    private void applyDefaultStyle() {
        this.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/css/CustomButton.css")).toExternalForm());
        this.getStyleClass().add("CustomStyle");
    }

    private void setStyleBinding() {
        styleProperty()
                .bind(Bindings.createStringBinding(() -> String.format(
                                "-fx-background-color: %s;" +
                                        "-fx-text-fill: %s;" +
                                        "-fx-pref-width:%s;" +
                                        "-fx-pref-height:%s;" +
                                        "-fx-background-radius:%s;" +
                                        "-fx-border-radius:%s;" +
                                        "-fx-font-size:%s;" +
                                        "-fx-text-fill:%s;",
                                bgcolor.get(),
                                textcolor.get(),
                                width.get(), height.get(), radius.get(), radius.get(), fontsize.get(), textcolor.get()),
                        bgcolor, textcolor, width, height, radius, radius, fontsize, textcolor));
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
