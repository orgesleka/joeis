package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016522 Continued fraction for <code>log(94)</code>.
 * @author Sean A. Irvine
 */
public class A016522 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016522() {
    super(new A016717());
  }
}
