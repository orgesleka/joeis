package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225954 A primitive sequence of order n = 2 generated by f(x) = x^2 - (4*x + 13) over Z/(3*5) (see below).
 * @author Sean A. Irvine
 */
public class A225954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225954() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 13, 7, 2, 9, 2, 5, 1, 9, 4, 13, 14, 0, 2, 8, 13, 6, 13, 10, 14, 6, 11, 2});
  }
}
