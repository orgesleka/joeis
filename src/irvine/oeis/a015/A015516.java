package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015516 Inverse of <code>1507th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015516 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015516() {
    super(Cyclotomic.inverse(1507));
  }
}
