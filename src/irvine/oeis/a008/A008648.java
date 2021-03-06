package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008648 Molien series of <code>3 X 3</code> upper triangular matrices over <code>GF( 5 )</code>.
 * @author Sean A. Irvine
 */
public class A008648 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008648() {
    super(new long[] {1}, new int[] {1, 5, 25});
  }
}

