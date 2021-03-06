package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041139 Denominators of continued fraction convergents to <code>sqrt(78)</code>.
 * @author Sean A. Irvine
 */
public class A041139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041139() {
    super(new long[] {-1, 0, 0, 0, 106, 0, 0, 0}, new long[] {1, 1, 5, 6, 101, 107, 529, 636});
  }
}
