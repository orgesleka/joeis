package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252092 Numbers n such that the sum of the octagonal numbers <code>N(n), N(n+1)</code> and <code>N(n+2)</code> is equal to the pentagonal number <code>P(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252092() {
    super(new long[] {1, -940899, 940899}, new long[] {36, 34503186, 32463979328256L});
  }
}
