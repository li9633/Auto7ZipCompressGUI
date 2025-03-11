package com.auto7zip.view.dialog;

import com.auto7zip.view.StyledButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CustomDialog<T> extends Dialog<T> {

    private final HBox buttonContainer = new HBox();

    public CustomDialog() {
        getDialogPane().getStylesheets().add(getClass().getResource("/css/CustomDialog.css").toExternalForm());

        getDialogPane().getButtonTypes().clear();

        getDialogPane().setStyle(
                "-fx-border-color: #2a88e8;" +  // 红色边框
                        "-fx-border-width: 3px;" +      // 2像素宽度
                        "-fx-border-style: dashed;" +
                        "-fx-padding: 0;"// 虚线样式（可选）
        );


        buttonContainer.setStyle(
                "-fx-border-color: #d03ba4;" +  // 红色边框
                        "-fx-border-width: 2px;" +      // 2像素宽度
                        "-fx-border-style: dashed;"     // 虚线样式（可选）
        );
        buttonContainer.setSpacing(5);
        buttonContainer.setPadding(new Insets(5));
        buttonContainer.setAlignment(Pos.BOTTOM_RIGHT);
        BorderPane rootpane = new BorderPane();
        rootpane.setStyle(
                "-fx-border-color: #ff0000;" +  // 红色边框
                        "-fx-border-width: 2px;" +      // 2像素宽度
                        "-fx-border-style: dashed;"     // 虚线样式（可选）
        );

        // 按钮容器配置
        buttonContainer.setAlignment(Pos.BOTTOM_RIGHT);
        buttonContainer.setSpacing(10);
        buttonContainer.setPadding(new Insets(5));
        rootpane.setBottom(buttonContainer);

        getDialogPane().setContent(rootpane);
    }

    public void setButtons(StyledButton st) {

        buttonContainer.getChildren().add(st);
    }
}
