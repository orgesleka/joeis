package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117642 <code>a(n) = 3*n^3</code>.
 * @author Sean A. Irvine
 */
public class A117642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117642() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 24, 81});
  }
}
