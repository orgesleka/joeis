package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143451 Expansion of <code>1/(x^k*(1-x-2*x^(k+1)))</code> for <code>k=8</code>.
 * @author Sean A. Irvine
 */
public class A143451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143451() {
    super(new long[] {2, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9, 11, 13, 15, 17});
  }
}
