package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041182 Numerators of continued fraction convergents to <code>sqrt(102)</code>.
 * @author Sean A. Irvine
 */
public class A041182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041182() {
    super(new long[] {-1, 0, 202, 0}, new long[] {10, 101, 2030, 20401});
  }
}
