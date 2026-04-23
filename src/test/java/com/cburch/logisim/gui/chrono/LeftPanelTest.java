package com.cburch.logisim.gui.chrono;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import org.junit.jupiter.api.Test;

class LeftPanelTest {

    @Test
    void resolveThemeAwareTableBackgroundUsesTableBackgroundWhenAvailable() {
        Color table = new Color(60, 63, 65);
        Color panel = new Color(200, 200, 200);

        assertEquals(table, LeftPanel.resolveThemeAwareTableBackground(table, panel));
    }

    @Test
    void resolveThemeAwareTableBackgroundFallsBackToPanelBackground() {
        Color panel = new Color(80, 80, 80);

        assertEquals(panel, LeftPanel.resolveThemeAwareTableBackground(null, panel));
    }

    @Test
    void resolveThemeAwareTableBackgroundFallsBackToWhiteWhenNoColorsAvailable() {
        assertEquals(Color.WHITE, LeftPanel.resolveThemeAwareTableBackground(null, null));
    }
}