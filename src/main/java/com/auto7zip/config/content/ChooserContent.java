package com.auto7zip.config.content;

import com.auto7zip.model.AppStatus;

public class ChooserContent {
    private static final String chooserText = AppStatus.getResourceBundle().getString("chooser.title");

    public static String getChooserText() {
        return chooserText;
    }
}
