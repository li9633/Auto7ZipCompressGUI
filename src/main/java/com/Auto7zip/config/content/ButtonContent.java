package com.Auto7zip.config.content;

import java.util.Collections;
import java.util.List;

public class ButtonContent {
    private static List<String> BUTTON_TEXT = List.of(
            "Pick A Folder",
            "Compress",
            "Unified Password",
            "Exit");

    public static List<String> getButtonText() {
        return Collections.unmodifiableList(BUTTON_TEXT);
    }
    
}
