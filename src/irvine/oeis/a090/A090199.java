package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090199 <code>N(6,n)</code> where <code>N(6,x)</code> is the 6th Narayana polynomial.
 * @author Sean A. Irvine
 */
public class A090199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090199() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 132, 903, 3304, 8925, 20076});
  }
}
