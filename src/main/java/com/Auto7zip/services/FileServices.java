package com.Auto7zip.services;


import java.io.File;

import javafx.stage.DirectoryChooser;

public class FileServices {
    private FileServices(){
        ;
    }

    public static void selectionFolder(){
        DirectoryChooser chooser = new DirectoryChooser();
        File selectedDirectory = chooser.showDialog(null);
        if (selectedDirectory != null) {
            System.out.println(selectedDirectory.getAbsolutePath());
        }
    }
}
