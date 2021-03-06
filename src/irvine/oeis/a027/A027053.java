package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027053 <code>T(n,n+2)</code>, T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027053() {
    super(new long[] {-1, 0, 0, 2}, new long[] {1, 4, 9, 18});
  }
}
