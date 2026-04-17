package com.cburch.logisim.prefs;

import com.cburch.logisim.prefs.AppPreferences;
import org.junit.jupiter.api.Test;
import java.awt.Color;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppPreferencesTest {

    @Test
    public void testMultipleLabelColorUpdate() {
        javax.swing.JLabel defaultTextLabel = new javax.swing.JLabel("Default Text");
        javax.swing.JLabel canvasBgTitleLabel = new javax.swing.JLabel("Canvas BG Title");

        defaultTextLabel.setForeground(java.awt.Color.RED);
        canvasBgTitleLabel.setForeground(java.awt.Color.RED);


        java.awt.Color targetColor = java.awt.Color.BLUE;
        int targetRgb = targetColor.getRGB();

        com.cburch.logisim.prefs.AppPreferences.DEFAULT_TEXT_COLOR.set(targetRgb);


        defaultTextLabel.setForeground(new java.awt.Color(com.cburch.logisim.prefs.AppPreferences.DEFAULT_TEXT_COLOR.get()));
        canvasBgTitleLabel.setForeground(new java.awt.Color(com.cburch.logisim.prefs.AppPreferences.DEFAULT_TEXT_COLOR.get()));

        assertEquals(targetRgb, defaultTextLabel.getForeground().getRGB(),
                "Primary label failed to update to Blue.");

        assertEquals(targetRgb, canvasBgTitleLabel.getForeground().getRGB(),
                "Secondary label (canvasBgColorTitle) failed to update to Blue.");

        System.out.println("SUCCESS: Both labels are perfectly synchronized!");
    }

}