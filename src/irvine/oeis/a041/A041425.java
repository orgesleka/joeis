package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041425 Denominators of continued fraction convergents to <code>sqrt(228)</code>.
 * @author Sean A. Irvine
 */
public class A041425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041425() {
    super(new long[] {-1, 0, 302, 0}, new long[] {1, 10, 301, 3020});
  }
}
