package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172162 <code>a(n) = ( A165155(n) + A165154(n) )/2</code>.
 * @author Sean A. Irvine
 */
public class A172162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172162() {
    super(new long[] {-9900, -101, 102}, new long[] {0, 1, 101});
  }
}
