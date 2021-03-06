package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042625 Denominators of continued fraction convergents to <code>sqrt(842)</code>.
 * @author Sean A. Irvine
 */
public class A042625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042625() {
    super(new long[] {1, 58}, new long[] {1, 58});
  }
}
