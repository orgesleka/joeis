package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107118 Numbers that are both centered triangular numbers <code>(A005448)</code> and centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A107118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107118() {
    super(new long[] {1, -35, 35}, new long[] {1, 19, 631});
  }
}
