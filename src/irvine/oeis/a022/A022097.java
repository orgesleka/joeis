package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022097 Fibonacci sequence beginning <code>1, 7</code>.
 * @author Sean A. Irvine
 */
public class A022097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022097() {
    super(new long[] {1, 1}, new long[] {1, 7});
  }
}
