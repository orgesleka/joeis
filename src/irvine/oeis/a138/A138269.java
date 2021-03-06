package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138269 <code>a(n+1)</code> is the Hankel transform of <code>C(n)+C(n+2)</code>, where <code>C(n)=A000108(n)</code>.
 * @author Sean A. Irvine
 */
public class A138269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138269() {
    super(new long[] {-1, 5, -4, 5}, new long[] {1, 3, 12, 53});
  }
}
