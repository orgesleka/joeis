package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008378 Coordination sequence for <code>D_10</code> lattice.
 * @author Sean A. Irvine
 */
public class A008378 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008378() {
    super(
      new long[] {1, 170, 4685, 38200, 124850, 183356, 124850, 38200, 4685, 170, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

