package irvine.oeis.a006;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a000.A000005;

/**
 * A006171 Number of factorization patterns of polynomials of degree n over integers.
 * @author Sean A. Irvine
 */
public class A006171 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A006171() {
    super(new A000005(), 0);
  }
}

