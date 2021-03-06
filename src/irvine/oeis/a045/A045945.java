package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045945 Hexagonal matchstick numbers: <code>a(n) = 3*n*(3*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A045945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045945() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 42});
  }
}
