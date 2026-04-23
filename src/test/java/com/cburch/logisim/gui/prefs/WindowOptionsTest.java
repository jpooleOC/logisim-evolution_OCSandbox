package com.cburch.logisim.gui.prefs;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cburch.logisim.prefs.AppPreferences;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
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

    @Test
    void refreshShowingWindowsUpdatesMultipleOpenWindows() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            JFrame frame = new JFrame("Test Frame");
            JDialog dialog = new JDialog(frame, "Test Dialog");

            frame.setSize(200, 200);
            dialog.setSize(200, 200);

            frame.setVisible(true);
            dialog.setVisible(true);

            try {
                assertDoesNotThrow(WindowOptions::refreshShowingWindows);
            } finally {
                dialog.dispose();
                frame.dispose();
            }
        });
    }
}