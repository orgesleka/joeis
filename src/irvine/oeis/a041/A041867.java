package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041867 Denominators of continued fraction convergents to <code>sqrt(455)</code>.
 * @author Sean A. Irvine
 */
public class A041867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041867() {
    super(new long[] {-1, 0, 128, 0}, new long[] {1, 3, 127, 384});
  }
}
