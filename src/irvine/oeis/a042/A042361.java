package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042361 Denominators of continued fraction convergents to <code>sqrt(707)</code>.
 * @author Sean A. Irvine
 */
public class A042361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042361() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 5052, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 17, 39, 56, 95, 4996, 5091, 10087, 25265, 85882, 197029, 282911, 479940});
  }
}
