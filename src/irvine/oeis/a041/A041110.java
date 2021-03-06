package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041110 Numerators of continued fraction convergents to <code>sqrt(63)</code>.
 * @author Sean A. Irvine
 */
public class A041110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041110() {
    super(new long[] {-1, 0, 16, 0}, new long[] {7, 8, 119, 127});
  }
}
