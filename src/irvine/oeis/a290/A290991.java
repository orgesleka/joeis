package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290991 p-INVERT of <code>(0,0,1,2,3,4,5,...)</code>, the nonnegative integers <code>A000027</code> preceded by one zero, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A290991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290991() {
    super(new long[] {1, 1, -3, 5, -6, 4}, new long[] {0, 0, 1, 2, 3, 6});
  }
}
