package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008388 Crystal ball sequence for <code>A_6</code> lattice.
 * @author Sean A. Irvine
 */
public class A008388 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008388() {
    super(
      new long[] {1, 36, 225, 400, 225, 36, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

