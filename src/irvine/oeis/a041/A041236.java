package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041236 Numerators of continued fraction convergents to <code>sqrt(130)</code>.
 * @author Sean A. Irvine
 */
public class A041236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041236() {
    super(new long[] {1, 0, 0, 114, 0, 0}, new long[] {11, 23, 57, 1277, 2611, 6499});
  }
}
