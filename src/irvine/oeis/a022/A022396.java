package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022396 Fibonacci sequence beginning <code>1, 26</code>.
 * @author Sean A. Irvine
 */
public class A022396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022396() {
    super(new long[] {1, 1}, new long[] {1, 26});
  }
}
