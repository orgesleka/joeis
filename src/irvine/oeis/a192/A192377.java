package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192377 Coefficient of x in the reduction by <code>x^2-&gt;x+2</code> of the polynomial <code>p(n,x)</code> defined below in Comments.
 * @author Sean A. Irvine
 */
public class A192377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192377() {
    super(new long[] {-1, 2, 6, 2}, new long[] {0, 2, 4, 20});
  }
}
