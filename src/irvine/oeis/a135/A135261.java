package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135261 <code>a(n) = 3*A131090(n) - A131090(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A135261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135261() {
    super(new long[] {2, -1, 0, 2}, new long[] {-1, 3, -1, 2});
  }
}
