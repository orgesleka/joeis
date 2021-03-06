package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016441 Continued fraction for <code>log(13)</code>.
 * @author Sean A. Irvine
 */
public class A016441 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016441() {
    super(new A016636());
  }
}
