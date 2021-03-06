package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123362 <code>a(0)=1, a(1)=1, a(n) = 6*a(n-1) + 5*a(n-2)</code> for <code>n &gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A123362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123362() {
    super(new long[] {5, 6}, new long[] {1, 1});
  }
}
