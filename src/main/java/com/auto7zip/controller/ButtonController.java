package com.auto7zip.controller;

import com.auto7zip.config.content.DiglogContent;
import com.auto7zip.model.AppStatus;
import com.auto7zip.services.FileServices;
import com.auto7zip.view.Win_Main;
import com.auto7zip.view.dialog.CustomDialog;
import com.auto7zip.view.dialog.CustomOptionButton;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class ButtonController {
    private static final Stage MainWindow = Win_Main.getMainWindow();

    public static void selectFolderButtonClick(ActionEvent event) {
        CustomDialog<String> dialog = new CustomDialog<>();
        dialog.setTitle(DiglogContent.getDialogTitle());
        dialog.setDialogContentText(DiglogContent.getDialogHeader());
        dialog.setDefaultButtonText(CustomDialog.StyleButtonOk, DiglogContent.getDialogButtonSelectionSearch());
        dialog.setDefaultButtonText(CustomDialog.StyleButtonCancel, DiglogContent.getDialogButtonSelectionFiles());
        dialog.setButtons(new CustomOptionButton<>(DiglogContent.getDialogButtonSelectionFolder()), false);
        dialog.setButtons(new CustomOptionButton<>(DiglogContent.getDialogButtonDefaultCancelText()), true);

        dialog.showAndWait().ifPresent(result -> {
            if (result.equals(DiglogContent.getDialogButtonSelectionSearch())) {
                FileServices.searchFolder(MainWindow);
            }
            if (result.equals(DiglogContent.getDialogButtonSelectionFiles())) {
                FileServices.selectionFile(MainWindow);
            }
            if (result.equals(DiglogContent.getDialogButtonSelectionFolder())) {
                FileServices.selectionFolder(MainWindow);
            }
        });
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
