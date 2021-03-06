package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041207 Denominators of continued fraction convergents to <code>sqrt(114)</code>.
 * @author Sean A. Irvine
 */
public class A041207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041207() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2050, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 31, 65, 96, 1985, 2081, 6147, 63551, 133249, 196800});
  }
}
