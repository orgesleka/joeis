package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022397 Fibonacci sequence beginning <code>1, 27</code>.
 * @author Sean A. Irvine
 */
public class A022397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022397() {
    super(new long[] {1, 1}, new long[] {1, 27});
  }
}
