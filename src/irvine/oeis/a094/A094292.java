package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094292 Number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>0 &lt; s(i) &lt; 5</code> and <code>|s(i) - s(i-1)| &lt;= 1</code> for i <code>= 1,2,....,n, s(0) = 2, s(n) = 4</code>.
 * @author Sean A. Irvine
 */
public class A094292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094292() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 0, 1, 3});
  }
}
