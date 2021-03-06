package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071769 Determinant of the <code>n X n</code> matrix whose element <code>(i,j)</code> equals <code>|i-j|</code> (Mod <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A071769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071769() {
    super(new long[] {-1024, 0, -256, 0, 128, 0, 32, 0, -4, 0}, new long[] {0, -1, 4, -12, -64, -208, 1088, -960, -8192, -6400});
  }
}
