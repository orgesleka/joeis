package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041332 Numerators of continued fraction convergents to <code>sqrt(180)</code>.
 * @author Sean A. Irvine
 */
public class A041332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041332() {
    super(new long[] {-1, 0, 0, 0, 322, 0, 0, 0}, new long[] {13, 27, 67, 161, 4253, 8667, 21587, 51841});
  }
}
