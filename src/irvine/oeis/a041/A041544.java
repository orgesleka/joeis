package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041544 Numerators of continued fraction convergents to <code>sqrt(290)</code>.
 * @author Sean A. Irvine
 */
public class A041544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041544() {
    super(new long[] {1, 34}, new long[] {17, 579});
  }
}
