package irvine.oeis.a007;

import irvine.oeis.InverseEulerTransformSequence;

/**
 * A007718 Number of independent polynomial invariants of matrix of order n.
 * @author Sean A. Irvine
 */
public class A007718 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A007718() {
    super(new A007716(), 1);
    next();
  }
}

