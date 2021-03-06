package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011727 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^14 + x^12 + x^11 + x + 1 (mod 2</code>, shifted by 13 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011727 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011727() {
    super(14, 0b10110000000001);
  }
}
