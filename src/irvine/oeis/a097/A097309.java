package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097309 Chebyshev polynomials of the second kind, <code>U(n,x)</code>, evaluated at <code>x=13</code>.
 * @author Sean A. Irvine
 */
public class A097309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097309() {
    super(new long[] {-1, 26}, new long[] {0, 1});
  }
}
