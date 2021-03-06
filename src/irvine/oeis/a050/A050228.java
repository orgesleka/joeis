package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050228 <code>a(n)</code> is the number of subsequences <code>{s(k)}</code> of <code>{1,2,3,...n}</code> such that <code>s(k+1)-s(k)</code> is 1 or 3.
 * @author Sean A. Irvine
 */
public class A050228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050228() {
    super(new long[] {1, -2, 2, -3, 3}, new long[] {1, 3, 6, 11, 19});
  }
}
