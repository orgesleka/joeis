package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016559 Continued fraction for <code>log(63/2)</code>.
 * @author Sean A. Irvine
 */
public class A016559 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016559() {
    super(new A016608());
  }
}
