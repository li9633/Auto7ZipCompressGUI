package com.auto7zip.config.content;

import com.auto7zip.model.AppStatus;

import java.util.Collections;
import java.util.List;

public class ButtonContent {
    private static final List<String> BUTTON_TEXT_GENERAL = List.of(
            AppStatus.getResourceBundle().getString("button.select.text"),
            AppStatus.getResourceBundle().getString("button.compress.text"),
            AppStatus.getResourceBundle().getString("button.cancel.text"),
            AppStatus.getResourceBundle().getString("button.exit.text")
    );

    private static final List<String> BUTTON_TEXT_OPTIONS = List.of(
            AppStatus.getResourceBundle().getString("options.password")
    );

    public static List<String> getButtonTextGeneral() {
        return BUTTON_TEXT_GENERAL;
    }

    public static List<String> getButtonTextOptions() {
        return BUTTON_TEXT_OPTIONS;
    }

}
