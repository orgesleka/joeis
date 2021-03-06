package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054498 Number of symmetric nonnegative integer <code>8 X 8</code> matrices with sum of elements equal to <code>4*n</code>, under action of dihedral group <code>D_4</code>.
 * @author Sean A. Irvine
 */
public class A054498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054498() {
    super(new long[] {-1, 4, 0, -20, 20, 36, -64, -20, 90, -20, -64, 36, 20, -20, 0, 4}, new long[] {1, 4, 16, 44, 116, 260, 560, 1100, 2090, 3740, 6512, 10868, 17732, 28028, 43472, 65780});
  }
}
