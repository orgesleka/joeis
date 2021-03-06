package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082010 <code>a(n) = n/2</code> if n is even, otherwise <code>floor(8*n/5)+1</code>.
 * @author Sean A. Irvine
 */
public class A082010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082010() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0}, new long[] {0, 2, 1, 5, 2, 9, 3, 12, 4, 15, 5, 18});
  }
}
