package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015227 Inverse of <code>1218th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015227 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015227() {
    super(Cyclotomic.inverse(1218));
  }
}
