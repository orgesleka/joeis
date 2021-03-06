package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014119 Inverse of <code>110th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014119 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014119() {
    super(Cyclotomic.inverse(110));
  }
}
