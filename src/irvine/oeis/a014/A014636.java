package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014636 Inverse of <code>627th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014636 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014636() {
    super(Cyclotomic.inverse(627));
  }
}
