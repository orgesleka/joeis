package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041067 Denominators of continued fraction convergents to <code>sqrt(40)</code>.
 * @author Sean A. Irvine
 */
public class A041067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041067() {
    super(new long[] {-1, 0, 38, 0}, new long[] {1, 3, 37, 114});
  }
}
