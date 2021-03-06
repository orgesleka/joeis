package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042414 Numerators of continued fraction convergents to <code>sqrt(735)</code>.
 * @author Sean A. Irvine
 */
public class A042414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042414() {
    super(new long[] {-1, 0, 488, 0}, new long[] {27, 244, 13203, 119071});
  }
}
