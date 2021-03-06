package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036216 Expansion of <code>1/(1 - 3*x)^4; 4-fold</code> convolution of <code>A000244</code> (powers of <code>3)</code>.
 * @author Sean A. Irvine
 */
public class A036216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036216() {
    super(new long[] {-81, 108, -54, 12}, new long[] {1, 12, 90, 540});
  }
}
