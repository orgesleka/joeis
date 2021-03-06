package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077401 Second member of Diophantine pair <code>(m,k)</code> that satisfies <code>7*(m^2 + m) = k^2 +</code> k; <code>a(n) =</code> k.
 * @author Sean A. Irvine
 */
public class A077401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077401() {
    super(new long[] {1, -1, -16, 16, 1}, new long[] {0, 6, 14, 104, 231});
  }
}
