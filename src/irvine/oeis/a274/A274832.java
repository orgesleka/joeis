package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274832 Values of n such that <code>2*n+1</code> and <code>7*n+1</code> are both triangular numbers <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A274832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274832() {
    super(new long[] {1, -1, -898, 898, 1}, new long[] {0, 27, 297, 24570, 267030});
  }
}
