package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015335 Inverse of <code>1326th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015335 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015335() {
    super(Cyclotomic.inverse(1326));
  }
}
