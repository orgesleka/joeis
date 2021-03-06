package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265762 Coefficient of x in minimal polynomial of the continued fraction <code>[1^n,2,1,1,1,...]</code>, where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A265762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265762() {
    super(new long[] {-1, 2, 2}, new long[] {-3, -5, -15});
  }
}
