package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041264 Numerators of continued fraction convergents to <code>sqrt(145)</code>.
 * @author Sean A. Irvine
 */
public class A041264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041264() {
    super(new long[] {1, 24}, new long[] {12, 289});
  }
}
