package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127211 <code>a(n) = 4^n*Lucas(n)</code>, where Lucas <code>= A000204</code>.
 * @author Sean A. Irvine
 */
public class A127211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127211() {
    super(new long[] {16, 4}, new long[] {4, 48});
  }
}
