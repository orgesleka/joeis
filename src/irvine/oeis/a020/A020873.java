package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020873 <code>a(n) =</code> number of cycles in Moebius ladder <code>M_n</code>.
 * @author Sean A. Irvine
 */
public class A020873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020873() {
    super(new long[] {-2, 7, -9, 5}, new long[] {2, 3, 7, 15});
  }
}
