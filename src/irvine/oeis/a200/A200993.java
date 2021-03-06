package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200993 Triangular numbers, <code>T(m)</code>, that are two-thirds of another triangular number; <code>T(m)</code> such that <code>3*T(m) = 2*T(k)</code> for some k.
 * @author Sean A. Irvine
 */
public class A200993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200993() {
    super(new long[] {1, -99, 99}, new long[] {0, 10, 990});
  }
}
