package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214827 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0) = 1, a(1) = a(2) = 5.
 * @author Sean A. Irvine
 */
public class A214827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214827() {
    super(new long[] {1, 1, 1}, new long[] {1, 5, 5});
  }
}
