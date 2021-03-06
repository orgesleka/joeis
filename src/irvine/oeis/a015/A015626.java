package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015626 Inverse of <code>1617th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015626 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015626() {
    super(Cyclotomic.inverse(1617));
  }
}
