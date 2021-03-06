package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290992 p-INVERT of <code>(0,0,0,1,2,3,4,5,...)</code>, the nonnegative integers <code>A000027</code> preceded by two zeros, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A290992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290992() {
    super(new long[] {1, 0, 1, -2, 0, 4, -6, 4}, new long[] {0, 0, 0, 1, 2, 3, 4, 7});
  }
}
