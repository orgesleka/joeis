package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011656 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^3 + x^2 + 1 (mod 2)</code>, shifted by 2 initial <code>0</code>'s.
 * @author Sean A. Irvine
 */
public class A011656 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011656() {
    super(0, 0, 1, 0, 1, 1, 1);
  }
}
