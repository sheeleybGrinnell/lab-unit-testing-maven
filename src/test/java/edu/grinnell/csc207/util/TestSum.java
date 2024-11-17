package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TestSum {

  int[] values = { 1, 2, 3 };

  @Test
  public void Sum123() {
    assertEquals(6, SampleMethods.sum(values), "sum [1 2 3] = 6") ;
  }

  @Test
  public void Sum0() {
    assertEquals(0, SampleMethods.sum(new int[] {}), "sum [] = 0") ;
  }

  @Test
  public void SumNeg() {
    assertEquals(-6, SampleMethods.sum(new int[] {-1, -2, -3}), "sum [-1, -2, -3] = -6") ;
  }

  @Test
  public void SumNegSomePos() {
    assertEquals(1, SampleMethods.sum(new int[] {-1, -2, 4}), "sum [-1, -2, 4] = 1") ;
  }
  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes

 
}
