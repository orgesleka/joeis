package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015166 Inverse of <code>1157th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015166 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015166() {
    super(Cyclotomic.inverse(1157));
  }
}
