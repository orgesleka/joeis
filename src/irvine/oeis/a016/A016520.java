package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016520 Continued fraction for <code>log(92)</code>.
 * @author Sean A. Irvine
 */
public class A016520 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016520() {
    super(new A016715());
  }
}
