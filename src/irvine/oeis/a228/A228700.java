package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228700 <code>2^n*(4^n-3^(n+1)+3*2^n-1)/6</code>.
 * @author Sean A. Irvine
 */
public class A228700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228700() {
    super(new long[] {-384, 400, -140, 20}, new long[] {0, 0, 0, 8});
  }
}
