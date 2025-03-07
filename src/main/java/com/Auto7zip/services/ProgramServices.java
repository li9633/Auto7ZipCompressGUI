package com.auto7zip.services;

public class ProgramServices {
    private ProgramServices() {}

    public static void exitProgram(int code) {
        System.exit(code);
    }

    public static void exitProgram() {
        exitProgram(0);
    }
}
