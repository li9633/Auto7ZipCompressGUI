package com.auto7zip.view.dialog;

import com.auto7zip.config.content.DiglogContent;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;

import java.util.Objects;
import java.util.ResourceBundle;

public class CustomDialog<T> extends Dialog<T> {
    private DialogPane dialogPane;

    public CustomDialog() {
        super();
        setTitle(DiglogContent.getDialogTitle());
        setHeaderText(DiglogContent.getDialogHeader());
        String cssPath = Objects.requireNonNull(getClass().getResource("/css/CustomButton.css")).toExternalForm();
        System.out.println(cssPath);
        getDialogPane().getStylesheets().add(cssPath);
        getDialogPane().getStyleClass().add("CustomDialog");
        getDialogPane().setContent(dialogPane);
    }
}
