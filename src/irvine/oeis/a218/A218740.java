package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218740 <code>a(n) = (37^n-1)/36</code>.
 * @author Sean A. Irvine
 */
public class A218740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218740() {
    super(new long[] {-37, 38}, new long[] {0, 1});
  }
}
