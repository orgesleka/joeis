package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216134 Numbers n such that <code>T_n</code> and <code>2*T_n + 1</code> are triangular.
 * @author Sean A. Irvine
 */
public class A216134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216134() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {0, 1, 4, 9, 26});
  }
}
