package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026397 <code>Sum{T(n-k,k)}, 0&lt;=k&lt;=[ n/2 ]</code>, where T is the array in <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026397() {
    super(new long[] {1, 3, 1, 0}, new long[] {1, 2, 3, 6});
  }
}
