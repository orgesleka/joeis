package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011696 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^8+x^7+x^6+x^5+x^4+x^3+1</code>.
 * @author Sean A. Irvine
 */
public class A011696 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011696() {
    super(8, 0b11111100);
  }
}
