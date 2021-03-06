package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008582 Molien series for Weyl group <code>E_8</code>.
 * @author Sean A. Irvine
 */
public class A008582 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008582() {
    super(RING.one(), RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
      RING.oneMinusXToTheN(1),
      RING.oneMinusXToTheN(4)),
      RING.oneMinusXToTheN(6)),
      RING.oneMinusXToTheN(7)),
      RING.oneMinusXToTheN(9)),
      RING.oneMinusXToTheN(10)),
      RING.oneMinusXToTheN(12)),
      RING.oneMinusXToTheN(15)));
  }
}

