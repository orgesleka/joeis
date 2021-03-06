package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041822 Numerators of continued fraction convergents to <code>sqrt(432)</code>.
 * @author Sean A. Irvine
 */
public class A041822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041822() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2702, 0, 0, 0, 0, 0, 0, 0}, new long[] {20, 21, 83, 104, 187, 291, 1060, 1351, 55100, 56451, 224453, 280904, 505357, 786261, 2864140, 3650401});
  }
}
