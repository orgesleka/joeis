package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157436 <code>128n^2 + 2528n + 12481</code>.
 * @author Sean A. Irvine
 */
public class A157436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157436() {
    super(new long[] {1, -3, 3}, new long[] {15137, 18049, 21217});
  }
}
