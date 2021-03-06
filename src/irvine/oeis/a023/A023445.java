package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023445 <code>n-3</code>.
 * @author Sean A. Irvine
 */
public class A023445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023445() {
    super(new long[] {-1, 2}, new long[] {-3, -2});
  }
}
