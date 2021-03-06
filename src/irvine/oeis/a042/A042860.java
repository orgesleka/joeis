package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042860 Numerators of continued fraction convergents to <code>sqrt(962)</code>.
 * @author Sean A. Irvine
 */
public class A042860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042860() {
    super(new long[] {1, 62}, new long[] {31, 1923});
  }
}
