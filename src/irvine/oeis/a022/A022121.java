package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022121 Fibonacci sequence beginning <code>3, 8</code>.
 * @author Sean A. Irvine
 */
public class A022121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022121() {
    super(new long[] {1, 1}, new long[] {3, 8});
  }
}
