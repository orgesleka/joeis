package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016488 Continued fraction for <code>log(60)</code>.
 * @author Sean A. Irvine
 */
public class A016488 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016488() {
    super(new A016683());
  }
}
