package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192813 Coefficient of x in the reduction of the polynomial <code>x^(2*n) + x^n + 1</code> by <code>x^3 -&gt; x + 1</code>.
 * @author Sean A. Irvine
 */
public class A192813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192813() {
    super(new long[] {-1, 0, -1, 0, 0, 2}, new long[] {0, 1, 1, 3, 4, 6});
  }
}
