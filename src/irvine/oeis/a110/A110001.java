package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110001 n followed by <code>n^2</code> followed by <code>n^3</code> followed by <code>n^4</code>.
 * @author Sean A. Irvine
 */
public class A110001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110001() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 4, 8, 16, 3, 9, 27, 81, 4, 16, 64, 256, 5, 25, 125, 625});
  }
}
