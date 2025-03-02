package com.Auto7zip.config;

import java.util.ArrayList;

public class button_config {
    private static final int BUTTON_WIDTH = 50;
    private static final int BUTTON_HEIGHT = 20;
    private static final int radius = 10;

    private static final ArrayList<String> buttonNames = new ArrayList<>();

    static {
        buttonNames.add("Pick A Folder");
        buttonNames.add("Compress");
        buttonNames.add("Unified Password");
        buttonNames.add("Exit");
    }

    public static ArrayList<String> getButtonNames() {
        return new ArrayList<>(buttonNames);
    }

    public static String getRadius() {
        return String.valueOf(radius);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getButtonHeight(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type cannot be null");
        }

        if (type.equals("int")) {
            return (T) Integer.valueOf(BUTTON_HEIGHT);
        } else if (type.equals("String")) {
            return (T) String.valueOf(BUTTON_HEIGHT);
        }
        throw new UnsupportedOperationException("type not supported");
    }

    @SuppressWarnings("unchecked")
    public static <T> T getButtonWidth(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type cannot be null");
        }

        if (type.equals("int")) {
            return (T) Integer.valueOf(BUTTON_WIDTH);
        } else if (type.equals("String")) {
            return (T) String.valueOf(BUTTON_WIDTH);
        }
        throw new UnsupportedOperationException("type not supported");
    }
}