package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042720 Numerators of continued fraction convergents to <code>sqrt(890)</code>.
 * @author Sean A. Irvine
 */
public class A042720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042720() {
    super(new long[] {-1, 0, 0, 0, 358, 0, 0, 0}, new long[] {29, 30, 149, 179, 10531, 10710, 53371, 64081});
  }
}
