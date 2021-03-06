package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253167 Numbers n such that the sum of the pentagonal numbers <code>P(n), P(n+1), P(n+2)</code> and <code>P(n+3)</code> is equal to the octagonal number <code>O(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A253167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253167() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 871, 2841, 1006671, 3280049});
  }
}
