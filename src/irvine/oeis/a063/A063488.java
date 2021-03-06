package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063488 <code>a(n) = (2*n-1)*(n^2 -n +2)/2</code>.
 * @author Sean A. Irvine
 */
public class A063488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063488() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 6, 20, 49});
  }
}
