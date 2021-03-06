package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105309 <code>a(n) = |b(n)|^2 = x^2 + 3*y*2</code> where <code>(x,y,y,y)</code> is the quaternion <code>b(n)</code> of the sequence b of quaternions defined by <code>b(0)=1,b(1)=1, b(n) = b(n-1) + b(n-2)*(0,c,c,c)</code> where c <code>= 1/sqrt(3)</code>.
 * @author Sean A. Irvine
 */
public class A105309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105309() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 1, 2, 5});
  }
}
