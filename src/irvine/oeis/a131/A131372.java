package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131372 Period <code>7</code>: repeat <code>[1, -1, 0, 1, 0, -1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A131372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131372() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, -1, 0, 1, 0, -1, 1});
  }
}
