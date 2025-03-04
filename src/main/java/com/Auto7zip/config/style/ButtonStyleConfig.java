package com.Auto7zip.config.style;

public class ButtonStyleConfig {
    private static final int BUTTON_WIDTH = 50;
    private static final int BUTTON_HEIGHT = 20;
    private static final int radius = 10;

    public static int getButtonHeight() {
        return BUTTON_HEIGHT;
    }

    public static int getButtonWidth() {
        return BUTTON_WIDTH;
    }

    public static int getButtonRadius() {
        return radius;
    }

    public static String getStyleForStyle(int value) {
        return String.format("%dpx", value);
    }
}