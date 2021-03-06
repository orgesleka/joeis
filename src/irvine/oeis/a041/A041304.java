package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041304 Numerators of continued fraction convergents to <code>sqrt(165)</code>.
 * @author Sean A. Irvine
 */
public class A041304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041304() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2158, 0, 0, 0, 0, 0}, new long[] {12, 13, 77, 167, 912, 1079, 26808, 27887, 166243, 360373, 1968108, 2328481});
  }
}
