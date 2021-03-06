package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264147 <code>a(n) = n*F(n+1) - (n+1)*F(n)</code>, where F <code>= A000045</code>.
 * @author Sean A. Irvine
 */
public class A264147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264147() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, -1, 1, 1});
  }
}
