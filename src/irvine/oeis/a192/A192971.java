package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192971 Constant term of the reduction by <code>x^2-&gt;x+1</code> of the polynomial <code>p(n,x)</code> defined at Comments.
 * @author Sean A. Irvine
 */
public class A192971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192971() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 9, 21});
  }
}
