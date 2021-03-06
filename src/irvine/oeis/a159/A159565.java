package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159565 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+241)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A159565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159565() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {221, 241, 265, 1061, 1205, 1369});
  }
}
