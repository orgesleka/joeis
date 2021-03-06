package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016124 Inverse of <code>2115th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016124 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016124() {
    super(Cyclotomic.inverse(2115));
  }
}
