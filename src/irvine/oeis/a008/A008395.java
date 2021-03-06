package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008395 Coordination sequence for <code>A_10</code> lattice.
 * @author Sean A. Irvine
 */
public class A008395 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008395() {
    super(
      new long[] {1, 100, 2025, 14400, 44100, 63504, 44100, 14400, 2025, 100, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

