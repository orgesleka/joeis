package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126284 <code>a(n) = 5*2^n - 4*n - 5</code>.
 * @author Sean A. Irvine
 */
public class A126284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126284() {
    super(new long[] {2, -5, 4}, new long[] {1, 7, 23});
  }
}
