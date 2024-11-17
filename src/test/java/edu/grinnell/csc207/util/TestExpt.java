package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TestExpt {

  @Test
  public void BaseTwo(){
    int expected = 1;
    for(int base = -3; base <= 3; base++) {
      for(int k = 0 ; k <= 5 ; k++){
        assertEquals(expected, SampleMethods.expt(base, k), "Test base" + base + "to" + k);
        expected = expected * base;
      }
      expected = 1;
    }
  }
}
