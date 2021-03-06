package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041691 Denominators of continued fraction convergents to <code>sqrt(365)</code>.
 * @author Sean A. Irvine
 */
public class A041691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041691() {
    super(new long[] {1, 0, 0, 0, 0, 6916, 0, 0, 0, 0}, new long[] {1, 9, 10, 19, 181, 6897, 62254, 69151, 131405, 1251796});
  }
}
