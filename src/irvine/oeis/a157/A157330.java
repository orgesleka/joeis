package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157330 <code>a(n) = 64*n - 8</code>.
 * @author Sean A. Irvine
 */
public class A157330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157330() {
    super(new long[] {-1, 2}, new long[] {56, 120});
  }
}
