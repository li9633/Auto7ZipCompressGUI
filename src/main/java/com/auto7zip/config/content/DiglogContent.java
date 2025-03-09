package com.auto7zip.config.content;

import com.auto7zip.model.AppStatus;

public class DiglogContent {
    private DiglogContent() {
    }


    public static String getDialogTitle() {
        return AppStatus.getResourceBundle().getString("dialog.title");
    }
    public static String getDialoHeader() {
        return AppStatus.getResourceBundle().getString("dialog.header");
    }
}
