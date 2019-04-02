package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065100 a(0) = c, a(1) = p*c^3; a(n+2) = p*c^2*a(n+1) - a(n), for p = 1, c = 3.
 * @author Sean A. Irvine
 */
public class A065100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065100() {
    super(new long[] {-1, 9}, new long[] {3, 27});
  }
}
