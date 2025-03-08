package com.auto7zip.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageManager {
    private static final String BASE_NAME = "locales/language";

    public static ResourceBundle getResourceBundle(String language) {
        return ResourceBundle.getBundle(BASE_NAME, new Locale(language));
    }
}
