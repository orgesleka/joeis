package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017596 <code>(12n+6)^4</code>.
 * @author Sean A. Irvine
 */
public class A017596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017596() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1296, 104976, 810000, 3111696, 8503056});
  }
}
