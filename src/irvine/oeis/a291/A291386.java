package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291386 <code>a(n) = (1/3)*A099432(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A291386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291386() {
    super(new long[] {-9, -18, -3, 6}, new long[] {2, 11, 54, 252});
  }
}
