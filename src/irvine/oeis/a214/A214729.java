package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214729 Member <code>m=6</code> of the m-family of sums <code>b(m,n) = Sum_{k=0..n} F(k+m)*F(k), m &gt;= 0, n &gt;= 0</code>, with the Fibonacci numbers F.
 * @author Sean A. Irvine
 */
public class A214729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214729() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 13, 34, 102});
  }
}
