package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077980 Expansion of <code>1/(1 + x + 2*x^2 + 2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077980() {
    super(new long[] {-2, -2, -1}, new long[] {1, -1, -1});
  }
}
