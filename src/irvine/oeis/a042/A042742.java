package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042742 Numerators of continued fraction convergents to <code>sqrt(902)</code>.
 * @author Sean A. Irvine
 */
public class A042742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042742() {
    super(new long[] {-1, 0, 1802, 0}, new long[] {30, 901, 54090, 1623601});
  }
}
