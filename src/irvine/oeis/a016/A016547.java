package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016547 Continued fraction for <code>log(39/2)</code>.
 * @author Sean A. Irvine
 */
public class A016547 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016547() {
    super(new A016596());
  }
}
