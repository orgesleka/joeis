package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157435 <code>64n + 632</code>.
 * @author Sean A. Irvine
 */
public class A157435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157435() {
    super(new long[] {-1, 2}, new long[] {696, 760});
  }
}
