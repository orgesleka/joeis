package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082685 <code>(2*5^n + 2^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A082685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082685() {
    super(new long[] {-10, 7}, new long[] {1, 4});
  }
}
