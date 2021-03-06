package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025877 Expansion of <code>1/((1-x^5)(1-x^6)(1-x^8))</code>.
 * @author Sean A. Irvine
 */
public class A025877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025877() {
    super(new long[] {1, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2, 1, 2});
  }
}
