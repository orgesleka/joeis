package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253168 Numbers n such that the octagonal number <code>O(n)</code> is equal to the sum of the pentagonal numbers <code>P(m), P(m+1), P(m+2)</code> and <code>P(m+3)</code> for some m.
 * @author Sean A. Irvine
 */
public class A253168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253168() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {4, 1234, 4020, 1423650, 4638692});
  }
}
