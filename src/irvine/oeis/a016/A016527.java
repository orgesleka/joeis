package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016527 Continued fraction for <code>log(99)</code>.
 * @author Sean A. Irvine
 */
public class A016527 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016527() {
    super(new A016722());
  }
}
