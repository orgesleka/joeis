package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131028 Periodic sequence <code>(7, 4, 1, 1, 4, 7)</code>.
 * @author Sean A. Irvine
 */
public class A131028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131028() {
    super(new long[] {1, -2, 2}, new long[] {7, 4, 1});
  }
}
