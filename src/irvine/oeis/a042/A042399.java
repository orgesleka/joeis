package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042399 Denominators of continued fraction convergents to <code>sqrt(726)</code>.
 * @author Sean A. Irvine
 */
public class A042399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042399() {
    super(new long[] {-1, 0, 0, 0, 970, 0, 0, 0}, new long[] {1, 1, 17, 18, 953, 971, 16489, 17460});
  }
}
