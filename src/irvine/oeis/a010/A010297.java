package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010297 Continued fraction for cube root of 69.
 * @author Sean A. Irvine
 */
public class A010297 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010297() {
    super(new A010639());
  }
}
