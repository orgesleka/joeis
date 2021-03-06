package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193048 Constant term of the reduction by <code>x^2-&gt;x+1</code> of the polynomial <code>p(n,x)</code> defined at Comments.
 * @author Sean A. Irvine
 */
public class A193048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193048() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {1, 0, 1, 2, 8, 25, 68});
  }
}
