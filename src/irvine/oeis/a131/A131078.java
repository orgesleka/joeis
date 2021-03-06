package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131078 Periodic sequence <code>(1, 1, 1, 1, 0, 0, 0, 0)</code>.
 * @author Sean A. Irvine
 */
public class A131078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131078() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {1, 1, 1, 1, 0});
  }
}
