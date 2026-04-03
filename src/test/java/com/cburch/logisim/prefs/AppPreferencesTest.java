package com.cburch.logisim.prefs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;

public class AppPreferencesTest {

    @Test
    public void testDefaultTextColorPreference() {

        Integer initialColor = AppPreferences.DEFAULT_TEXT_COLOR.get();
        assertEquals(Color.BLACK.getRGB(), initialColor, "The default text color should initialize to Black.");

        Integer newColorToTest = Color.RED.getRGB();
        AppPreferences.DEFAULT_TEXT_COLOR.set(newColorToTest);

        Integer updatedColor = AppPreferences.DEFAULT_TEXT_COLOR.get();
        assertEquals(newColorToTest, updatedColor, "The preference should update to the new color.");

        AppPreferences.DEFAULT_TEXT_COLOR.set(Color.BLACK.getRGB());
    }
}