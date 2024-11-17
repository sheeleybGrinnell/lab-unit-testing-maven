package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  public void test2() {
    assertEquals(10, 3*5, "stupid test");
  } // test2()

  @Test
  public void freezingc2f(){
    assertEquals(32, SampleMethods.c2f(0), "0 degrees C is 32 degree F");
  }

  @Test
  public void boilingc2f(){
    assertEquals(212, SampleMethods.c2f(100), "100 degrees C is 212 degree F");
  }

  @Test
  public void negativeinputc2f(){
    assertEquals(14, SampleMethods.c2f(-10), "-10 C is 14 F");
  }

  @Test
  public void negativeoutputc2f(){
    assertEquals(-4, SampleMethods.c2f(-20), "-20 C is -4 F");
  }
} // class TestSampleMethods
