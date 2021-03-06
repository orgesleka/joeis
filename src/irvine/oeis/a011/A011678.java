package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011678 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^7+x^5+x^3+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011678 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011678() {
    super(7, 0b1010101);
  }
}
