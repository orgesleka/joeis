package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041917 Denominators of continued fraction convergents to <code>sqrt(480)</code>.
 * @author Sean A. Irvine
 */
public class A041917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041917() {
    super(new long[] {-1, 0, 0, 0, 482, 0, 0, 0}, new long[] {1, 1, 10, 11, 472, 483, 4819, 5302});
  }
}
