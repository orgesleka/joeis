package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192874 Constant term in the reduction by <code>(x^2 -&gt; x + 1)</code> of the polynomial <code>p(n,x)</code> given in Comments.
 * @author Sean A. Irvine
 */
public class A192874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192874() {
    super(new long[] {4, -6, -5, 6, 2}, new long[] {1, 0, 4, 6, 26});
  }
}
