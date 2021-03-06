package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134410 Second-order Lucas numbers; <code>a(n) = (2n+3)*Lucas(n) - n*Lucas(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A134410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134410() {
    super(new long[] {-1, -2, 1, 2}, new long[] {6, 3, 19, 27});
  }
}
