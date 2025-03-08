package com.auto7zip.model;


import java.util.Random;
import java.util.ResourceBundle;


public class AppStatus {
    private static boolean isCompressionInProgress = false;
    private static ResourceBundle resourceBundle;
    private static String selectFolder;

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

    public static String getSelectFolder() {
        return selectFolder;
    }

    public static void setSelectFolder(String selectFolder) {
        AppStatus.selectFolder = selectFolder;
    }
}