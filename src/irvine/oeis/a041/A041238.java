package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041238 Numerators of continued fraction convergents to <code>sqrt(131)</code>.
 * @author Sean A. Irvine
 */
public class A041238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041238() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 21220, 0, 0, 0, 0, 0}, new long[] {11, 23, 103, 1156, 4727, 10610, 238147, 486904, 2185763, 24530297, 100306951, 225144199});
  }
}
