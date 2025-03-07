package com.auto7zip.view;

import java.util.function.Consumer;

import com.auto7zip.config.style.ButtonStyleConfig;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

public class StyledButton extends Button {
    private Consumer<Void> onClickHandler;
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
        super("Uninit Button");
        applyDefaultStyle();
        setClickHandler(null);
        setStylebinding();
    }

    public void setClickHandler(Consumer<Void> handler) {
        this.onClickHandler = handler;
        setClickAction();
    }

    private void setClickAction() {
        this.setOnAction(e -> {
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
        this.getStylesheets().add(cssPath);
        this.getStyleClass().add("CustomStyle");
    }

    private void setStylebinding() {
        styleProperty()
                .bind(Bindings.createStringBinding(() -> String.format(
                        "-fx-background-color: %s;" +
                                "-fx-text-fill: %s;" +
                                "-fx-min-width:%s;" +
                                "-fx-min-height:%s;" +
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
