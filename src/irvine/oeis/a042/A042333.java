package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042333 Denominators of continued fraction convergents to sqrt(693).
 * @author Sean A. Irvine
 */
public class A042333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042333() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 492802, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 37, 40, 197, 237, 3041, 9360, 489761, 1478643, 18233477, 19712120, 97081957, 116794077, 1498610881, 4612626720L});
  }
}
