package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096024 Numbers n such that <code>(n+j) mod (2+j) = 1</code> for j from 0 to 5 and <code>(n+6) mod 8</code> &lt;&gt; 1.
 * @author Sean A. Irvine
 */
public class A096024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096024() {
    super(new long[] {-1, 2}, new long[] {423, 1263});
  }
}
