package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047853 <code>a(n) = T(5,n)</code>, array T given by <code>A047848</code>.
 * @author Sean A. Irvine
 */
public class A047853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047853() {
    super(new long[] {-8, 9}, new long[] {1, 2});
  }
}
