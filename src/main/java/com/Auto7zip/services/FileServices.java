package com.Auto7zip.services;

import java.io.File;
import java.util.Optional;

import com.Auto7zip.config.content.ChooserContent;

import javafx.scene.control.ChoiceDialog;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import org.controlsfx.control.FileChooser;

public class FileServices {
    private FileServices() {
        ;
    }

    public static void selectionFolder(Window MainWindow) {
        // DirectoryChooser dirChooser = new DirectoryChooser();
        // dirChooser.setTitle(ChooserContent.getChooserText());
        // FileChooser fileChooser = new FileChooser();
        // fileChooser.setTitle(ChooserContent.getChooserText());

        // File selectedFile = fileChooser.showOpenDialog(MainWindow);
        // File selectedDirectory = dirChooser.showDialog(MainWindow);
        // if (selectedDirectory != null) {
        // System.out.println(selectedDirectory.getAbsolutePath());
        // }
        // if (selectedFile != null) {
        // System.out.println(selectedFile.getAbsolutePath());
        // }
        org.controlsfx.control.FileChooser chooser = new org.controlsfx.control.FileChooser();
        chooser.setMode(FileChooserMode.ANY); // 允许选择文件或目录
        File file = chooser.showOpenDialog(stage);

    }
}
