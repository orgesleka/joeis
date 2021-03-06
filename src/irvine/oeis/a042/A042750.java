package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042750 Numerators of continued fraction convergents to <code>sqrt(906)</code>.
 * @author Sean A. Irvine
 */
public class A042750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042750() {
    super(new long[] {-1, 0, 602, 0}, new long[] {30, 301, 18090, 181201});
  }
}
