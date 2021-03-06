package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077985 Expansion of <code>1/(1 + 2*x - x^2)</code>.
 * @author Sean A. Irvine
 */
public class A077985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077985() {
    super(new long[] {1, -2}, new long[] {1, -2});
  }
}
