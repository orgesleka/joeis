package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142880 <code>a(n) = 7*a(n-3) - a(n-6)</code>.
 * @author Sean A. Irvine
 */
public class A142880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142880() {
    super(new long[] {-1, 0, 0, 7, 0, 0}, new long[] {0, 1, 2, 3, 8, 13});
  }
}
