package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097737 Chebyshev <code>U(n,x)</code> polynomial evaluated at <code>x=163</code>.
 * @author Sean A. Irvine
 */
public class A097737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097737() {
    super(new long[] {-1, 326}, new long[] {1, 326});
  }
}
