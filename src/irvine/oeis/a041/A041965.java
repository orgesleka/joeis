package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041965 Denominators of continued fraction convergents to <code>sqrt(505)</code>.
 * @author Sean A. Irvine
 */
public class A041965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041965() {
    super(new long[] {-1, 0, 0, 0, 1618, 0, 0, 0}, new long[] {1, 2, 17, 36, 1601, 3238, 27505, 58248});
  }
}
