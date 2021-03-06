package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042906 Numerators of continued fraction convergents to <code>sqrt(985)</code>.
 * @author Sean A. Irvine
 */
public class A042906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042906() {
    super(new long[] {1, 0, 0, 0, 0, 816, 0, 0, 0, 0}, new long[] {31, 63, 94, 157, 408, 25453, 51314, 76767, 128081, 332929});
  }
}
