package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015297 Inverse of <code>1288th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015297 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015297() {
    super(Cyclotomic.inverse(1288));
  }
}
