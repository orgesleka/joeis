package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096025 Numbers n such that <code>(n+j) mod (2+j) = 1</code> for j from 0 to 6 and <code>(n+7) mod 9</code> &lt;&gt; 1.
 * @author Sean A. Irvine
 */
public class A096025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096025() {
    super(new long[] {-1, 1, 1}, new long[] {843, 1683, 3363});
  }
}
