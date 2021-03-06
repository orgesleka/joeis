package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094622 Sequence whose n-th term digits sum to <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A094622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094622() {
    super(new long[] {-10, 10, 1}, new long[] {0, 11, 31});
  }
}
