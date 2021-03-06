package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013679 Continued fraction for <code>zeta(2) = Pi^2/6</code>.
 * @author Sean A. Irvine
 */
public class A013679 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013679() {
    super(new A013661());
  }
}
