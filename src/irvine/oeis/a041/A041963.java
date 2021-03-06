package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041963 Denominators of continued fraction convergents to <code>sqrt(504)</code>.
 * @author Sean A. Irvine
 */
public class A041963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041963() {
    super(new long[] {-1, 0, 0, 0, 898, 0, 0, 0}, new long[] {1, 2, 9, 20, 889, 1798, 8081, 17960});
  }
}
