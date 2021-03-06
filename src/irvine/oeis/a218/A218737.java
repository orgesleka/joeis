package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218737 <code>a(n) = (34^n-1)/33</code>.
 * @author Sean A. Irvine
 */
public class A218737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218737() {
    super(new long[] {-34, 35}, new long[] {0, 1});
  }
}
