package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095932 Number of walks of length <code>2n+1</code> between two nodes at distance 3 in the cycle graph <code>C_10</code>.
 * @author Sean A. Irvine
 */
public class A095932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095932() {
    super(new long[] {4, -13, 7}, new long[] {1, 5, 22});
  }
}
