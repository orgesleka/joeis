package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048481 <code>a(n) = T(0,n)+T(1,n-1)+...+T(n,0)</code>, array T given by <code>A048472</code>.
 * @author Sean A. Irvine
 */
public class A048481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048481() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 3, 9, 27});
  }
}
