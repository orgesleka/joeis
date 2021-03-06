package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042045 Denominators of continued fraction convergents to <code>sqrt(546)</code>.
 * @author Sean A. Irvine
 */
public class A042045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042045() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1402, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 8, 11, 30, 1391, 2812, 4203, 11218, 15421, 42060});
  }
}
