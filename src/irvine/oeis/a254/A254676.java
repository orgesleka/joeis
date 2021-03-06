package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254676 Heptagonal numbers <code>(A000566)</code> which are also centered triangular numbers <code>(A005448)</code>.
 * @author Sean A. Irvine
 */
public class A254676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254676() {
    super(new long[] {1, -1, -3842, 3842, 1}, new long[] {1, 235, 2839, 902101, 10906669});
  }
}
