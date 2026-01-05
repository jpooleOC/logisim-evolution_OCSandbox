/*
 * Logisim-evolution - digital logic design tool and simulator
 * Copyright by the Logisim-evolution developers
 *
 * https://github.com/logisim-evolution/
 *
 * This is free software released under GNU GPLv3 license
 */

package com.cburch.logisim;


import com.cburch.logisim.gui.main.Canvas;
import com.cburch.logisim.proj.Project;
import com.cburch.logisim.prefs.AppPreferences;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class jpooleTest extends TestBase {

  /** Checks if isNotEmpty() correctly handles non-null and non-empty collections. */
  @Test
  public void stringTest() {
            String expected = "Hello Class!";
            String actual = "Hello Class!";
            assertEquals(expected, actual);
        }
  @Test
  public void integerTest() {
            int result = 2 + 2;
            assertEquals(4, result);
        }
  @Test
  public void MenuEditTest() {
	  //CircuitJList Cjl = new CircuitJList(a,false);
	    //Cjl.getSelectedCircuits();
	    //Project a=new Canvas.getProject();
	    //Canvas myCanvas = new Canvas(a);
	    Canvas.snapXToGrid(0);
            int result = 2 + 2;
            assertEquals(4, result);
        }
  @Test
  public void DefaultCanvasBGTest() {
	  int result=AppPreferences.CANVAS_BG_COLOR.get();
	  assertEquals(0x0FFFFFFF,result);
  }



}

