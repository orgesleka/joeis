package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042208 Numerators of continued fraction convergents to <code>sqrt(630)</code>.
 * @author Sean A. Irvine
 */
public class A042208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042208() {
    super(new long[] {-1, 0, 502, 0}, new long[] {25, 251, 12575, 126001});
  }
}
