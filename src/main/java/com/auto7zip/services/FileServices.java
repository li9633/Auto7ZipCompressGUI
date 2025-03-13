package com.auto7zip.services;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import com.auto7zip.config.content.ChooserContent;

import com.auto7zip.model.AppStatus;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import org.controlsfx.control.GridView;

public class FileServices {
    private FileServices() {

    }

    public static void selectionFolder(Window MainWindow) {
//        FileChooser dirChooser = new FileChooser();
//        dirChooser.setTitle(ChooserContent.getChooserTile());
//        dirChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(
//                ChooserContent.getChooserFilterFolder()
//                , "*."));
//
//        List<File> selectedDirectory = dirChooser.showOpenMultipleDialog(MainWindow);
//        if (selectedDirectory != null) {
//            AppStatus.setSelectFolder(selectedDirectory.stream().filter(File::isDirectory).collect(Collectors.toList()));
//        }

        GridView<File> dirChooser = new GridView<>();
        dirChooser.setCellWidth(200);
        dirChooser.setCellHeight(400);


    }

    public static void selectionFile(Window MainWindow) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle(ChooserContent.getChooserTile());
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(
                ChooserContent.getChooserFilterFile()
                , "*.*"));
        List<File> selectedFile = fileChooser.showOpenMultipleDialog(MainWindow);
        if (selectedFile != null) {
            AppStatus.setSelectFile(selectedFile.stream().filter(File::isFile).collect(Collectors.toList()));
        }

    }

    public static void searchFolder(Window MainWindow) {
        DirectoryChooser dirChooser = new DirectoryChooser();
        dirChooser.setTitle(ChooserContent.getChooserFilterSearch());
        File selectedDirectory = dirChooser.showDialog(MainWindow);
        if (selectedDirectory != null) {
            AppStatus.setSearchFolder(selectedDirectory.getAbsolutePath());
        }

    }
}
