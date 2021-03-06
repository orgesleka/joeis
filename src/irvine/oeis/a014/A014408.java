package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014408 Inverse of <code>399th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014408 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014408() {
    super(Cyclotomic.inverse(399));
  }
}
