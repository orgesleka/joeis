package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041613 Denominators of continued fraction convergents to <code>sqrt(325)</code>.
 * @author Sean A. Irvine
 */
public class A041613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041613() {
    super(new long[] {1, 36}, new long[] {1, 36});
  }
}
