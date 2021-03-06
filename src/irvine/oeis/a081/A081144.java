package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081144 Starting at <code>1, four-fold</code> convolution of <code>A000400</code> (powers of <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A081144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081144() {
    super(new long[] {-1296, 864, -216, 24}, new long[] {0, 0, 0, 1});
  }
}
