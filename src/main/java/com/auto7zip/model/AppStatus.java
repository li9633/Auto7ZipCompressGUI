package com.auto7zip.model;


import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


public class AppStatus {
    private static boolean isCompressionInProgress = false;
    private static ResourceBundle resourceBundle;
    private static List<File> selectFolder;
    private static List<File> selectFile;
    private static String searchFolder;

    private AppStatus() {
    }

    public static boolean isCompressionInProgress() {
        return isCompressionInProgress;
    }

    public static void setCompressionInProgress(boolean isCompressionInProgress) {
        AppStatus.isCompressionInProgress = isCompressionInProgress;
    }

    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    public static void setResourceBundle(ResourceBundle resourceBundle) {
        AppStatus.resourceBundle = resourceBundle;
    }

    public static List<File> getSelectFile() {
        return selectFile;
    }

    public static void setSelectFile(List<File> selectFile) {
        AppStatus.selectFile = selectFile;
    }

    public static List<File> getSelectFolder() {
        return selectFolder;
    }

    public static void setSelectFolder(List<File> selectFolder) {
        AppStatus.selectFolder = selectFolder;
    }

    public static String getSearchFolder() {
        return searchFolder;
    }

    public static void setSearchFolder(String searchFolder) {
        AppStatus.searchFolder = searchFolder;
    }
}