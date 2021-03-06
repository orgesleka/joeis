package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160869 <code>a(n) = sigma(6^(n-1))</code>.
 * @author Sean A. Irvine
 */
public class A160869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160869() {
    super(new long[] {-36, 72, -47, 12}, new long[] {1, 12, 91, 600});
  }
}
