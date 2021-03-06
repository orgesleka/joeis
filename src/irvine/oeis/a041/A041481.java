package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041481 Denominators of continued fraction convergents to <code>sqrt(257)</code>.
 * @author Sean A. Irvine
 */
public class A041481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041481() {
    super(new long[] {1, 32}, new long[] {1, 32});
  }
}
