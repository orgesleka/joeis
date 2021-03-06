package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019564 Coordination sequence for <code>C_8</code> lattice.
 * @author Sean A. Irvine
 */
public class A019564 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019564() {
    super(
      new long[] {1, 120, 1820, 8008, 12870, 8008, 1820, 120, 1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}

