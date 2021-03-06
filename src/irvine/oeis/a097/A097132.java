package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097132 Sum <code>F(k)+(-1)^k*F(k-1), k=0..n</code>.
 * @author Sean A. Irvine
 */
public class A097132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097132() {
    super(new long[] {1, -1, -3, 3, 1}, new long[] {1, 2, 4, 5, 10});
  }
}
