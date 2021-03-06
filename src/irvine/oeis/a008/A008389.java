package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008389 Coordination sequence for <code>A_7</code> lattice.
 * @author Sean A. Irvine
 */
public class A008389 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008389() {
    super(
      new long[] {1, 49, 441, 1225, 1225, 441, 49, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

