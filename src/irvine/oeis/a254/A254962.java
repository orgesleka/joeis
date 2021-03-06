package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254962 Indices of hexagonal numbers <code>(A000384)</code> that are also centered pentagonal numbers <code>(A005891)</code>.
 * @author Sean A. Irvine
 */
public class A254962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254962() {
    super(new long[] {1, -1, -18, 18, 1}, new long[] {1, 2, 12, 31, 211});
  }
}
