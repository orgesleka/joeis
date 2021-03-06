package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047860 <code>a(n) = T(3,n)</code>, array T given by <code>A047858</code>.
 * @author Sean A. Irvine
 */
public class A047860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047860() {
    super(new long[] {4, -8, 5}, new long[] {1, 5, 14});
  }
}
