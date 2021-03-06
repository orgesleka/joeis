package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035598 Number of points of <code>L1</code> norm 4 in cubic lattice <code>Z^n</code>.
 * @author Sean A. Irvine
 */
public class A035598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035598() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 16, 66, 192});
  }
}
