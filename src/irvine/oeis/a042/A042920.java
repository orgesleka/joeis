package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042920 Numerators of continued fraction convergents to <code>sqrt(992)</code>.
 * @author Sean A. Irvine
 */
public class A042920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042920() {
    super(new long[] {-1, 0, 126, 0}, new long[] {31, 63, 3937, 7937});
  }
}
