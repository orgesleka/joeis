package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251991 Numbers n such that the sum of the pentagonal numbers <code>P(n)</code> and <code>P(n+1)</code> is equal to the sum of the hexagonal numbers <code>H(m)</code> and <code>H(m+1)</code> for some m.
 * @author Sean A. Irvine
 */
public class A251991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251991() {
    super(new long[] {1, -195, 195}, new long[] {60, 11704, 2270580});
  }
}
