package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215885 <code>a(n) = 3*a(n-1) - a(n-3)</code>, with <code>a(0)=3, a(1)=3</code>, and <code>a(2)=9</code>.
 * @author Sean A. Irvine
 */
public class A215885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215885() {
    super(new long[] {-1, 0, 3}, new long[] {3, 3, 9});
  }
}
