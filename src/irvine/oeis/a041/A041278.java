package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041278 Numerators of continued fraction convergents to <code>sqrt(152)</code>.
 * @author Sean A. Irvine
 */
public class A041278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041278() {
    super(new long[] {-1, 0, 74, 0}, new long[] {12, 37, 900, 2737});
  }
}
