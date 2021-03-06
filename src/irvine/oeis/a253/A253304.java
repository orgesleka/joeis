package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253304 Numbers n such that the sum of the heptagonal numbers <code>H(n)</code> and <code>H(n+1)</code> is equal to the octagonal number <code>O(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A253304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253304() {
    super(new long[] {1, -1, -62, 62, 1}, new long[] {1, 22, 77, 1376, 4785});
  }
}
