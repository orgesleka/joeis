package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130646 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+727)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A130646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130646() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 56, 1925, 2181, 2465, 13056, 14540});
  }
}
