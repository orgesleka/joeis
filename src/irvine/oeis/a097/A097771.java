package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097771 Chebyshev <code>U(n,x)</code> polynomial evaluated at <code>x=339=2*13^2+1</code>.
 * @author Sean A. Irvine
 */
public class A097771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097771() {
    super(new long[] {-1, 678}, new long[] {1, 678});
  }
}
