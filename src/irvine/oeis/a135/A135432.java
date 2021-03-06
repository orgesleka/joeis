package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135432 <code>a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4) - a(n-5)</code> with <code>a(0)=0, a(1)=1, a(2)=2, a(3)=3</code> and <code>a(4)=4</code>.
 * @author Sean A. Irvine
 */
public class A135432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135432() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {0, 1, 2, 3, 4});
  }
}
