package com.auto7zip.services;

import java.io.File;

import com.auto7zip.config.content.ChooserContent;

import javafx.stage.DirectoryChooser;
import javafx.stage.Window;

public class FileServices {
    private FileServices() {
        ;
    }

    public static void selectionFolder(Window MainWindow) {
        DirectoryChooser dirChooser = new DirectoryChooser();
        dirChooser.setTitle(ChooserContent.getChooserText());

        File selectedDirectory = dirChooser.showDialog(MainWindow);
        if (selectedDirectory != null) {
        System.out.println(selectedDirectory.getAbsolutePath());
        }

    }
}
