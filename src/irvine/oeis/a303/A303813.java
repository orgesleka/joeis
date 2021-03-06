package irvine.oeis.a303;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303813 Generalized <code>19-gonal</code> (or enneadecagonal) numbers: <code>m*(17*m - 15)/2</code> with m <code>= 0, +1, -1, +2, -2, +3, -3</code>, ...
 * @author Georg Fischer
 */
public class A303813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303813() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {0L, 1L, 16L, 19L, 49L});
  } // constructor()
} // A303813
