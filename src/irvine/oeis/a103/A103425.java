package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103425 <code>a(n)=3a(n-1)+a(n-2)-3a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A103425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103425() {
    super(new long[] {-3, 1, 3}, new long[] {1, 3, 5});
  }
}
