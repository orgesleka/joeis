package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093196 Number of <code>4 X 4</code> pandiagonal magic squares with line sum <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A093196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093196() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 28, 265, 1392, 5145, 15100, 37681});
  }
}
