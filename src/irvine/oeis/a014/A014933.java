package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014933 Inverse of <code>924th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014933 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014933() {
    super(Cyclotomic.inverse(924));
  }
}
