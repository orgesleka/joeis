package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037580 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,3.
 * @author Sean A. Irvine
 */
public class A037580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037580() {
    super(new long[] {-8, 1, 8}, new long[] {1, 11, 89});
  }
}
