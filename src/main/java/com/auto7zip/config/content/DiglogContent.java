package com.auto7zip.config.content;

import com.auto7zip.model.AppStatus;

public class DiglogContent {
    private DiglogContent() {
    }


    public static String getDialogTitle() {
        return AppStatus.getResourceBundle().getString("dialog.title");
    }

    public static String getDialogHeader() {
        return AppStatus.getResourceBundle().getString("dialog.header");
    }

    public static String getDialogButtonDefaultOkText() {
        return AppStatus.getResourceBundle().getString("dialog.button.default.ok.text");
    }

    public static String getDialogButtonDefaultCancelText() {
        return AppStatus.getResourceBundle().getString("dialog.button.default.cancel.text");
    }

    public static String getDialogButtonSelectionFiles() {
        return AppStatus.getResourceBundle().getString("dialog.button.selection.files");
    }

    public static String getDialogButtonSelectionFolder() {
        return AppStatus.getResourceBundle().getString("dialog.button.selection.folder");
    }

    public static String getDialogButtonSelectionSearch() {
        return AppStatus.getResourceBundle().getString("dialog.button.selection.search");
    }
}
