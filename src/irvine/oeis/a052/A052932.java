package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052932 Expansion of <code>(1-x)/(1-2x-x^4+x^5)</code>.
 * @author Sean A. Irvine
 */
public class A052932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052932() {
    super(new long[] {-1, 1, 0, 0, 2}, new long[] {1, 1, 2, 4, 9});
  }
}
