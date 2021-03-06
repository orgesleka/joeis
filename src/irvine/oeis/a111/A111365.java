package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111365 <code>a(n) = 5*a(n-1) + 3*a(n-2)</code> where <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A111365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111365() {
    super(new long[] {3, 5}, new long[] {1, 1});
  }
}
