package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070431 <code>a(n) = n^2 mod 6</code>.
 * @author Sean A. Irvine
 */
public class A070431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070431() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 3, 4, 1});
  }
}
