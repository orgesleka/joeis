package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008259 Coordination sequence <code>T2</code> for Moganite, also for <code>BGB1</code>.
 * @author Sean A. Irvine
 */
public class A008259 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008259() {
    super(
      new long[] {1, 3, 7, 11, 11, 7, 3, 1},
      new int[] {1, 3, 3});
  }
}

