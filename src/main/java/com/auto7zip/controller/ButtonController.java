package com.auto7zip.controller;

import com.auto7zip.model.AppStatus;
import com.auto7zip.services.FileServices;
import com.auto7zip.view.Win_Main;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class ButtonController {
    private static final Stage MainWindow = Win_Main.getMainWindow();

    public static void selectFolderButtonClick(ActionEvent event) {
        FileServices.selectionFolder(MainWindow);
    }

    public static void compressButtonClick(ActionEvent event) {
        if (!AppStatus.isCompressionInProgress()) {
            System.out.println("compress");
        }
    }

    public static void cancelButtonClick(ActionEvent event) {
        AppStatus.setCompressionInProgress(!AppStatus.isCompressionInProgress());
    }


    public static void exitButtonClick(ActionEvent event) {
        MainWindow.close();
    }
}
