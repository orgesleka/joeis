package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022373 Fibonacci sequence beginning <code>2, 22</code>.
 * @author Sean A. Irvine
 */
public class A022373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022373() {
    super(new long[] {1, 1}, new long[] {2, 22});
  }
}
