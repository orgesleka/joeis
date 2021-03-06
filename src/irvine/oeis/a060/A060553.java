package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060553 <code>a(n)</code> is the number of distinct <code>(modulo</code> geometric <code>D3-operations)</code> patterns which can be formed by an equilateral triangular arrangement of closely packed black and white cells satisfying the local matching rule of Pascal's triangle modulo 2, where n is the number of cells in each edge of the arrangement. The matching rule is such that any elementary top-down triangle of three neighboring cells in the arrangement contains either one or three white cells.
 * @author Sean A. Irvine
 */
public class A060553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060553() {
    super(new long[] {8, -4, -4, -2, 2, 2}, new long[] {2, 2, 4, 6, 10, 16});
  }
}
