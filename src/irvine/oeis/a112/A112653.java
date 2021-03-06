package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112653 <code>a(n)</code> squared is congruent to <code>a(n) (mod 13)</code>.
 * @author Sean A. Irvine
 */
public class A112653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112653() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 13});
  }
}
