package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016946 <code>(6n+3)^2</code>.
 * @author Sean A. Irvine
 */
public class A016946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016946() {
    super(new long[] {1, -3, 3}, new long[] {9, 81, 225});
  }
}
