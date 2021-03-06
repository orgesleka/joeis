package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042174 Numerators of continued fraction convergents to <code>sqrt(612)</code>.
 * @author Sean A. Irvine
 */
public class A042174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042174() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 4354, 0, 0, 0, 0, 0, 0, 0}, new long[] {24, 25, 74, 99, 470, 569, 1608, 2177, 106104, 108281, 322666, 430947, 2046454, 2477401, 7001256, 9478657});
  }
}
