package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023475 <code>n-33</code>.
 * @author Sean A. Irvine
 */
public class A023475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023475() {
    super(new long[] {-1, 2}, new long[] {-33, -32});
  }
}
