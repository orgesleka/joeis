package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041924 Numerators of continued fraction convergents to <code>sqrt(485)</code>.
 * @author Sean A. Irvine
 */
public class A041924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041924() {
    super(new long[] {1, 44}, new long[] {22, 969});
  }
}
