package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143404 Expansion of <code>x^k/Product_{t=k..2k} (1-tx)</code> for <code>k=9</code>.
 * @author Sean A. Irvine
 */
public class A143404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143404() {
    super(new long[] {-158789030400L, 123418922400L, -42924478536L, 8797620060L, -1176812090, 107358615, -6765213, 290790, -8160, 135}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
