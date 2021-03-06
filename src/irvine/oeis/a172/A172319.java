package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172319 <code>10th</code> column of <code>A172119</code>.
 * @author Sean A. Irvine
 */
public class A172319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172319() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512});
  }
}
