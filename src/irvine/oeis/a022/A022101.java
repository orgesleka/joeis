package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022101 Fibonacci sequence beginning <code>1, 11</code>.
 * @author Sean A. Irvine
 */
public class A022101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022101() {
    super(new long[] {1, 1}, new long[] {1, 11});
  }
}
