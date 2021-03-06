package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014175 Apply partial sum operator 4 times to Stern's sequence.
 * @author Sean A. Irvine
 */
public class A014175 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014175() {
    super(new A014173());
  }
}
