package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055797 <code>T(2n+4,n)</code>, array T as in <code>A055794</code>.
 * @author Sean A. Irvine
 */
public class A055797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055797() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 6, 22, 64, 162, 372, 792, 1584});
  }
}
