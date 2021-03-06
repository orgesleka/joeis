package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102900 <code>a(n) = 3a(n-1) + 4a(n-2), a(0)=a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A102900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102900() {
    super(new long[] {4, 3}, new long[] {1, 1});
  }
}
