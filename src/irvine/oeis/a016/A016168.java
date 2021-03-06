package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016168 Inverse of <code>2159th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016168 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016168() {
    super(Cyclotomic.inverse(2159));
  }
}
