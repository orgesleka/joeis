package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026655 <code>T(n,0) + T(n,1) +</code> ... <code>+ T(n,n)</code>, T given by <code>A026648</code>.
 * @author Sean A. Irvine
 */
public class A026655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026655() {
    super(new long[] {2, 0, 4, 0}, new long[] {1, 2, 5, 10});
  }
}
