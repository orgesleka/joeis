package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013690 Continued fraction for <code>zeta(14)</code>.
 * @author Sean A. Irvine
 */
public class A013690 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013690() {
    super(new A013672());
  }
}
