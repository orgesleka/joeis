package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041723 Denominators of continued fraction convergents to <code>sqrt(381)</code>.
 * @author Sean A. Irvine
 */
public class A041723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041723() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2030, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 25, 27, 52, 2003, 2055, 4058, 50751, 54809, 105560});
  }
}
