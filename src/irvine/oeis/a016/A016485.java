package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016485 Continued fraction for <code>log(57)</code>.
 * @author Sean A. Irvine
 */
public class A016485 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016485() {
    super(new A016680());
  }
}
