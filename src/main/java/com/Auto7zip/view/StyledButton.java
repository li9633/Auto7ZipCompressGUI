package com.Auto7zip.view;

import java.util.function.Consumer;

import com.Auto7zip.config.button_config;
import javafx.scene.control.Button;

public class StyledButton extends Button {
    private Consumer<Void> onClickHandler;

    public StyledButton(String text) {
        super(text);
        applyDefaultStyle();

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
        this.resize(button_config.getButtonWidth("int"), button_config.getButtonHeight("int"));
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
