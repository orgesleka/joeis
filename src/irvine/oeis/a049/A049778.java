package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049778 <code>a(n)=Sum{T(n,2k-1): k=1,2,...,[(n+1)/2]}</code>, array T as in <code>A049777</code>.
 * @author Sean A. Irvine
 */
public class A049778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049778() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 3, 9, 17, 32, 50});
  }
}
