package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042598 Numerators of continued fraction convergents to <code>sqrt(828)</code>.
 * @author Sean A. Irvine
 */
public class A042598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042598() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2302, 0, 0, 0, 0, 0}, new long[] {28, 29, 115, 259, 892, 1151, 65348, 66499, 264845, 596189, 2053412, 2649601});
  }
}
