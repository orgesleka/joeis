package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144124 <code>P_4(2n+1)</code>, the Legendre polynomial of order 4 at <code>2n+1</code>.
 * @author Sean A. Irvine
 */
public class A144124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144124() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 321, 2641, 10321, 28401});
  }
}
