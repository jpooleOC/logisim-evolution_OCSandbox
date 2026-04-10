package com.cburch.logisim.prefs;

import com.cburch.logisim.prefs.AppPreferences;
import org.junit.jupiter.api.Test;
import java.awt.Color;
import static org.junit.jupiter.api.Assertions.assertEquals;

// 1. THIS IS THE MISSING WRAPPER:
public class AppPreferencesTest {

    @Test
    public void testDefaultTextColorPreference() {

        int actualStartingColor = AppPreferences.DEFAULT_TEXT_COLOR.get();

        // 2. THIS IS THE FIXED LINE WITH .get():
        int expectedStartingColor = AppPreferences.DEFAULT_COMPONENT_ICON_COLOR;

        assertEquals(expectedStartingColor, actualStartingColor,
                "The Default Text Color should initially match the Component Icon Color.");

        Color neonGreen = new Color(57, 255, 20);

        // Save it to your preference
        AppPreferences.DEFAULT_TEXT_COLOR.set(neonGreen.getRGB());

        int updatedColor = AppPreferences.DEFAULT_TEXT_COLOR.get();

        assertEquals(neonGreen.getRGB(), updatedColor,
                "The preference should successfully save and return a newly selected color.");
    }

// 3. DON'T FORGET THIS CLOSING BRACKET FOR THE CLASS!
}