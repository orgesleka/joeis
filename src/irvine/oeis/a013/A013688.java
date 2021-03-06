package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013688 Continued fraction for <code>zeta(12)</code>.
 * @author Sean A. Irvine
 */
public class A013688 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013688() {
    super(new A013670());
  }
}
