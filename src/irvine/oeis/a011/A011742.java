package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011742 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^29 + x^2 + 1 (mod 2</code>, shifted by 28 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011742 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011742() {
    super(29, 0b10000000000000000000000000010);
  }
}
