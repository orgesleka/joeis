package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252077 Numbers n such that the hexagonal number <code>X(n)</code> is equal to the sum of the heptagonal number <code>H(m)</code> and <code>H(m+1)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252077() {
    super(new long[] {1, -1443, 1443}, new long[] {1, 769, 1108537});
  }
}
