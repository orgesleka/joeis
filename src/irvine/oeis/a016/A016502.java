package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016502 Continued fraction for <code>log(74)</code>.
 * @author Sean A. Irvine
 */
public class A016502 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016502() {
    super(new A016697());
  }
}
