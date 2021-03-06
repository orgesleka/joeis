package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095342 Number of elements in n-th string generated by a <code>Kolakoski(5,1)</code> rule starting with <code>a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A095342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095342() {
    super(new long[] {2, 3, 0}, new long[] {1, 1, 5});
  }
}
