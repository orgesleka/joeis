package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226489 <code>a(n) = n*(15*n-11)/2</code>.
 * @author Sean A. Irvine
 */
public class A226489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226489() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 19});
  }
}
