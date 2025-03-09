package com.auto7zip.controller;

import com.auto7zip.config.content.DiglogContent;
import com.auto7zip.model.AppStatus;
import com.auto7zip.services.FileServices;
import com.auto7zip.view.StyledButton;
import com.auto7zip.view.Win_Main;
import javafx.event.ActionEvent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;

public class ButtonController {
    private static final Stage MainWindow = Win_Main.getMainWindow();

    public static void selectFolderButtonClick(ActionEvent event) {

        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle(DiglogContent.getDialogTitle());
        dialog.setHeaderText("dialog.header");

        ButtonType buttonType = new ButtonType("testOptions");
        dialog.getDialogPane().getButtonTypes().addAll(buttonType);
        dialog.showAndWait();
        FileServices.selectionFolder(MainWindow);
    }

    public static void compressButtonClick(ActionEvent event) {
//        if (!AppStatus.isCompressionInProgress()) {
//            System.out.println("compress");
//        }
        System.out.println("遍历目录:" + AppStatus.getSearchFolder());
        System.out.println("选择文件:" + AppStatus.getSelectFile());
        System.out.println("选择文件夹:" + AppStatus.getSelectFolder());
    }

    public static void cancelButtonClick(ActionEvent event) {
        AppStatus.setCompressionInProgress(!AppStatus.isCompressionInProgress());
    }


    public static void exitButtonClick(ActionEvent event) {
        MainWindow.close();
    }
}
