package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041680 Numerators of continued fraction convergents to <code>sqrt(359)</code>.
 * @author Sean A. Irvine
 */
public class A041680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041680() {
    super(new long[] {-1, 0, 0, 0, 720, 0, 0, 0}, new long[] {18, 19, 341, 360, 13301, 13661, 245538, 259199});
  }
}
