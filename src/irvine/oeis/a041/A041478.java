package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041478 Numerators of continued fraction convergents to <code>sqrt(255)</code>.
 * @author Sean A. Irvine
 */
public class A041478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041478() {
    super(new long[] {-1, 0, 32, 0}, new long[] {15, 16, 495, 511});
  }
}
