package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015403 Inverse of <code>1394th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015403 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015403() {
    super(Cyclotomic.inverse(1394));
  }
}
