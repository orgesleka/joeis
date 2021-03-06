package irvine.oeis.a099;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A099604 Antidiagonal sums of triangle <code>A099602</code>, in which row n equals the inverse binomial transform of column n of the triangle of trinomial coefficients <code>(A027907)</code>.
 * @author Georg Fischer
 */
public class A099604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099604() {
    super(new long[] {-1L, -2L, 0L, 3L, 2L, 0L}, new long[] {1L, 1L, 2L, 4L, 7L, 12L});
  } // constructor()
} // A099604
