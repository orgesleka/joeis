package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143861 Ulam's spiral (NNE spoke).
 * @author Sean A. Irvine
 */
public class A143861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143861() {
    super(new long[] {1, -3, 3}, new long[] {1, 14, 59});
  }
}
