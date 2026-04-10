package com.cburch.logisim;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Color;
import com.cburch.logisim.soc.data.SocMemMapModel;

public class SocMemMapModelTest {

    @Test
    public void testTextColorChange() {
        SocMemMapModel.SlaveInfo info = new SocMemMapModel.SlaveInfo(0, 10);

        Color result = info.getTextColor();

        assertEquals(Color.BLACK, result); // match YOUR change
    }
}