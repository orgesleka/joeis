package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247613 <code>a(n) = Sum_{k=0..8} binomial(16,k)*binomial(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A247613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247613() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 17, 153, 969, 4845, 20349, 74613, 245157, 735471});
  }
}
