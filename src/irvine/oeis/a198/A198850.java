package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198850 <code>2*8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198850() {
    super(new long[] {-8, 9}, new long[] {1, 15});
  }
}
