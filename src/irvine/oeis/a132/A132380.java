package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132380 Period <code>8: 0, 0, 1, 1, 0, 0, -1, -1</code>.
 * @author Sean A. Irvine
 */
public class A132380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132380() {
    super(new long[] {-1, 0, 0, 0}, new long[] {0, 0, 1, 1});
  }
}
