package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062990 Eighth column <code>(r=7)</code> of <code>FS(5)</code> staircase array <code>A062985</code>.
 * @author Sean A. Irvine
 */
public class A062990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062990() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {5, 30, 110, 315, 771, 1688, 3396, 6390});
  }
}
