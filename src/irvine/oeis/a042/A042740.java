package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042740 Numerators of continued fraction convergents to <code>sqrt(901)</code>.
 * @author Sean A. Irvine
 */
public class A042740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042740() {
    super(new long[] {1, 60}, new long[] {30, 1801});
  }
}
