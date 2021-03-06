package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078987 Chebyshev <code>U(n,x)</code> polynomial evaluated at <code>x=19</code>.
 * @author Sean A. Irvine
 */
public class A078987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078987() {
    super(new long[] {-1, 38}, new long[] {1, 38});
  }
}
