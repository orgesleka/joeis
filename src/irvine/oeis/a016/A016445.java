package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016445 Continued fraction for <code>log(17)</code>.
 * @author Sean A. Irvine
 */
public class A016445 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016445() {
    super(new A016640());
  }
}
