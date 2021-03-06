package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016451 Continued fraction for <code>log(23)</code>.
 * @author Sean A. Irvine
 */
public class A016451 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016451() {
    super(new A016646());
  }
}
