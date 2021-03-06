package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165516 Perfect squares <code>(A000290)</code> that can be expressed as the sum of three consecutive triangular numbers <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A165516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165516() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {4, 64, 361, 6241, 35344});
  }
}
