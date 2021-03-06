package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175657 Eight bishops and one elephant on a <code>3 X 3</code> chessboard: <code>a(n) = 3*2^n - 2*F(n+1)</code>, with <code>F(n) = A000045(n)</code>.
 * @author Sean A. Irvine
 */
public class A175657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175657() {
    super(new long[] {-2, -1, 3}, new long[] {1, 4, 8});
  }
}
