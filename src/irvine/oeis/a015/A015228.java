package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015228 Inverse of <code>1219th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015228 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015228() {
    super(Cyclotomic.inverse(1219));
  }
}
