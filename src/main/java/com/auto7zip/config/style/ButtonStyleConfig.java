package com.auto7zip.config.style;

public class ButtonStyleConfig {
    private static final int BUTTON_WIDTH = 120;
    private static final int BUTTON_HEIGHT = 30;
    private static final int RADIUS = 10;
    private static final int BUTTON_FONT_SIZE = 12;
    private static final String BUTTON_TEXT_COLOR = "#ffffff";
    private static final String BUTTON_BG_COLOR = "#6789e7";
    public static int getButtonHeight() {
        return BUTTON_HEIGHT;
    }

    public static int getButtonWidth() {
        return BUTTON_WIDTH;
    }

    public static int getButtonRadius() {
        return RADIUS;
    }

    public static String getStyleForStyle(int value) {
        return String.format("%dpx", value);
    }

    public static int getButtonFontSize() {
        return BUTTON_FONT_SIZE;
    }

    public static String getButtonTextColor() {
        return BUTTON_TEXT_COLOR;
    }

    public static String getButtonBgColor() {
        return BUTTON_BG_COLOR;
    }
}