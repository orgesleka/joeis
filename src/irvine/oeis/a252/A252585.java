package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252585 Numbers n such that the sum of the pentagonal numbers <code>P(n)</code> and <code>P(n+1)</code> is equal to the heptagonal number <code>H(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252585() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {3, 234, 1617, 112948, 779551});
  }
}
