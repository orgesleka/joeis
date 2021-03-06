package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277991 <code>a(n) = 81*n^2 - 9*n</code>.
 * @author Sean A. Irvine
 */
public class A277991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277991() {
    super(new long[] {1, -3, 3}, new long[] {0, 72, 306});
  }
}
