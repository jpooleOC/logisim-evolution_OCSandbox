package com.cburch.hex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import javax.swing.UIManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class HexEditorTest {

    @AfterEach
    void tearDown() {
        UIManager.put("TextArea.background", null);
        UIManager.put("TextArea.foreground", null);
    }

    @Test
    void constructorUsesThemeColorsWhenAvailable() {
        Color expectedBg = new Color(30, 30, 30);
        Color expectedFg = new Color(220, 220, 220);

        UIManager.put("TextArea.background", expectedBg);
        UIManager.put("TextArea.foreground", expectedFg);

        HexEditor editor = new HexEditor(null);

        assertEquals(expectedBg, editor.getBackground());
        assertEquals(expectedFg, editor.getForeground());
    }

    @Test
    void constructorFallsBackToDefaultBackgroundWhenThemeBackgroundMissing() {
        UIManager.put("TextArea.background", null);
        UIManager.put("TextArea.foreground", null);

        HexEditor editor = new HexEditor(null);

        assertEquals(Color.WHITE, editor.getBackground());
    }
}