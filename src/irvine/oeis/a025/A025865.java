package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025865 Expansion of <code>1/((1-x^4)(1-x^6)(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A025865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025865() {
    super(new long[] {1, 0, 0, 0, -1, 0, -1, 0, 0, -1, 1, 0, 0, 1, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 2, 1, 1, 1, 2, 1, 3});
  }
}
