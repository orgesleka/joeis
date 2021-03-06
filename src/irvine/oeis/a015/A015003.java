package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015003 Inverse of <code>994th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015003 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015003() {
    super(Cyclotomic.inverse(994));
  }
}
