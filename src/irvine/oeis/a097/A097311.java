package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097311 Chebyshev polynomials of the second kind, <code>U(n,x)</code>, evaluated at <code>x=14</code>.
 * @author Sean A. Irvine
 */
public class A097311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097311() {
    super(new long[] {-1, 28}, new long[] {0, 1});
  }
}
