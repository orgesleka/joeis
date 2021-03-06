package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294157 Fibonacci sequence beginning <code>2, 8</code>.
 * @author Sean A. Irvine
 */
public class A294157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294157() {
    super(new long[] {1, 1}, new long[] {2, 8});
  }
}
