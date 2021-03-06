package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042402 Numerators of continued fraction convergents to <code>sqrt(728)</code>.
 * @author Sean A. Irvine
 */
public class A042402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042402() {
    super(new long[] {-1, 0, 54, 0}, new long[] {26, 27, 1430, 1457});
  }
}
