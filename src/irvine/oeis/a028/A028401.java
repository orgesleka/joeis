package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028401 The <code>(2^n+1)-th</code> triangular number <code>(cf. A000217)</code>.
 * @author Sean A. Irvine
 */
public class A028401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028401() {
    super(new long[] {8, -14, 7}, new long[] {3, 6, 15});
  }
}
