package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016736 Continued fraction for <code>log(8)</code>.
 * @author Sean A. Irvine
 */
public class A016736 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016736() {
    super(new A016631());
  }
}
