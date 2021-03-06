package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178626 Convolution of <code>Pell(n)</code> and <code>10^n</code>.
 * @author Sean A. Irvine
 */
public class A178626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178626() {
    super(new long[] {-10, -19, 12}, new long[] {1, 12, 125});
  }
}
