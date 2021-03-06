package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026385 <code>Sum{T(n-k,k)}, 0&lt;=k&lt;=[ n/2 ]</code>, where T is the array in <code>A026374</code>.
 * @author Sean A. Irvine
 */
public class A026385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026385() {
    super(new long[] {1, 3, 1, 0}, new long[] {1, 1, 2, 4});
  }
}
