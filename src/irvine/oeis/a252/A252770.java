package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252770 Numbers n such that the heptagonal number <code>H(n)</code> is equal to the sum of the pentagonal numbers <code>P(m), P(m+1), P(m+2)</code> and <code>P(m+3)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252770() {
    super(new long[] {1, -63, 63}, new long[] {148, 9155, 567444});
  }
}
