package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236584 The number of tilings of a <code>9 X (2n)</code> floor with <code>2 X 3</code> hexominoes.
 * @author Sean A. Irvine
 */
public class A236584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236584() {
    super(new long[] {-2, 4, -1, 2}, new long[] {1, 1, 1, 5});
  }
}
