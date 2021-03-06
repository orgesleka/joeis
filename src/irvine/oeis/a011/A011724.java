package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011724 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^11 + x^2 + 1 (mod 2</code>, shifted by 10 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011724 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011724() {
    super(11, 0b10000000010);
  }
}
