package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042735 Denominators of continued fraction convergents to <code>sqrt(897)</code>.
 * @author Sean A. Irvine
 */
public class A042735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042735() {
    super(new long[] {-1, 0, 0, 0, 1198, 0, 0, 0}, new long[] {1, 1, 19, 20, 1179, 1199, 22761, 23960});
  }
}
