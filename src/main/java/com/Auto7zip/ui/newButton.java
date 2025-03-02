package com.Auto7zip.ui;

import com.Auto7zip.config.button_config;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class newButton extends Button {
    public newButton(String text) {
        super(text);
        setButtonAction();
        applyDefaultStyle();
    }

    public newButton() {
        super();
        setButtonAction();
        applyDefaultStyle();
    }

    private void setButtonAction() {

    }

    public void setButtonSize() {
        this.resize(button_config.getButtonWidth("int"), button_config.getButtonHeight("int"));
    }

    private void SelectFolder(ActionEvent event) {
        System.out.println("folder selected");
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
                button_config.getButtonWidth("String"),
                button_config.getButtonHeight("String"),
                button_config.getRadius(),
                button_config.getRadius());
        this.getStylesheets().add(
                "data:text/css;charset=UTF-8," + cssStyle);
        this.getStyleClass().add("buttonSize");
        this.getStylesheets().add(cssPath);
        this.getStyleClass().add("newbutton");
    }

}
