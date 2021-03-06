package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041838 Numerators of continued fraction convergents to <code>sqrt(440)</code>.
 * @author Sean A. Irvine
 */
public class A041838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041838() {
    super(new long[] {-1, 0, 42, 0}, new long[] {20, 21, 860, 881});
  }
}
