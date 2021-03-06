package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022127 Fibonacci sequence beginning <code>3, 17</code>.
 * @author Sean A. Irvine
 */
public class A022127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022127() {
    super(new long[] {1, 1}, new long[] {3, 17});
  }
}
