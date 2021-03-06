package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212706 <code>a(n)</code> is the difference between numbers of nonnegative multiples of <code>2*n+1</code> with even and odd digit sum in base <code>2*n</code> in interval <code>[0, (2*n)^9)</code>.
 * @author Sean A. Irvine
 */
public class A212706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212706() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {81, 5825, 73745, 461313, 1951057, 6418369, 17712657, 42921473});
  }
}
