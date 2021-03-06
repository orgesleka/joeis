package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011703 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^8+x^7+x^6+x^4+x^3+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011703 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011703() {
    super(8, 0b11101110);
  }
}
