package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052949 Expansion of <code>(2-4x+x^3)/((1-x)(1-2x-x^2+x^3))</code>.
 * @author Sean A. Irvine
 */
public class A052949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052949() {
    super(new long[] {1, -2, -1, 3}, new long[] {2, 2, 4, 7});
  }
}
