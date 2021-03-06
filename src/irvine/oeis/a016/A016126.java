package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016126 Inverse of <code>2117th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016126 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016126() {
    super(Cyclotomic.inverse(2117));
  }
}
