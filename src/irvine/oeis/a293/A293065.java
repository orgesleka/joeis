package irvine.oeis.a293;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A293065 Number of vertices of type D at level n of the hyperbolic Pascal pyramid <code>PP_(4,5)</code>.
 * @author Georg Fischer
 */
public class A293065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293065() {
    super(new long[] {-1, 5, -8, 5}, new long[] {0, 0, 1, 3}, new long[] {0});
  }
}
