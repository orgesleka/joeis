package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041133 Denominators of continued fraction convergents to <code>sqrt(75)</code>.
 * @author Sean A. Irvine
 */
public class A041133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041133() {
    super(new long[] {-1, 0, 0, 0, 52, 0, 0, 0}, new long[] {1, 1, 2, 3, 50, 53, 103, 156});
  }
}
