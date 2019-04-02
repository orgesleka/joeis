package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287794 Nine steps forward, eight steps back.
 * @author Sean A. Irvine
 */
public class A287794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287794() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1});
  }
}
