package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253512 <code>a(n) = (2^n - 1) * (3^(n+2) - 1) / 2</code>.
 * @author Sean A. Irvine
 */
public class A253512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253512() {
    super(new long[] {-36, 72, -47, 12}, new long[] {0, 13, 120, 847});
  }
}
