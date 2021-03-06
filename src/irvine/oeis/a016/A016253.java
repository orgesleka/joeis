package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016253 Inverse of <code>2244th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016253 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016253() {
    super(Cyclotomic.inverse(2244));
  }
}
