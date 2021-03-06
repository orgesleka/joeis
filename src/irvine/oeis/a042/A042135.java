package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042135 Denominators of continued fraction convergents to <code>sqrt(592)</code>.
 * @author Sean A. Irvine
 */
public class A042135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042135() {
    super(new long[] {-1, 0, 146, 0}, new long[] {1, 3, 145, 438});
  }
}
