package com.cburch.logisim.gui.prefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cburch.logisim.prefs.AppPreferences;
import org.junit.jupiter.api.Test;

class WindowOptionsTest {

    @Test
    void applyLookAndFeelUpdatesPreference() {
        String testLaf = "com.formdev.flatlaf.FlatDarkLaf";

        AppPreferences.LookAndFeel.set(testLaf);

        assertEquals(testLaf, AppPreferences.LookAndFeel.get());
    }

    @Test
    void resetLookAndFeelRestoresDefault() {
        String defaultLaf = com.formdev.flatlaf.FlatIntelliJLaf.class.getName();

        AppPreferences.LookAndFeel.set("com.formdev.flatlaf.FlatDarkLaf");
        AppPreferences.LookAndFeel.set(defaultLaf);

        assertEquals(defaultLaf, AppPreferences.LookAndFeel.get());
    }
}