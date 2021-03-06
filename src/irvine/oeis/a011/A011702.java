package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011702 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^8+x^7+x^5+x^4+x^3+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011702 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011702() {
    super(8, 0b11011110);
  }
}
