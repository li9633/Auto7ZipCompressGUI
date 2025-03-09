package com.auto7zip.config.content;

import com.auto7zip.model.AppStatus;

public class ChooserContent {

    private ChooserContent() {
    }
    public static String getChooserTile() {
        return AppStatus.getResourceBundle().getString("chooser.title");
    }

    public static String getChooserFilterFile() {
        return AppStatus.getResourceBundle().getString("chooser.filter.type.file");
    }

    public static String getChooserFilterFolder() {
        return AppStatus.getResourceBundle().getString("chooser.filter.type.folder");
    }

    public static String getChooserFilterSearch() {
        return AppStatus.getResourceBundle().getString("chooser.filter.type.search");
    }
}
