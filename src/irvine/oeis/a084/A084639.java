package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084639 Expansion of <code>x*(1+2*x)/((1+x)*(1-x)*(1-2*x))</code>.
 * @author Sean A. Irvine
 */
public class A084639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084639() {
    super(new long[] {-2, 1, 2}, new long[] {0, 1, 4});
  }
}
