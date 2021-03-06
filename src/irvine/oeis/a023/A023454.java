package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023454 <code>n-12</code>.
 * @author Sean A. Irvine
 */
public class A023454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023454() {
    super(new long[] {-1, 2}, new long[] {-12, -11});
  }
}
