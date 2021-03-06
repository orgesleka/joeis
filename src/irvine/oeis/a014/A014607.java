package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014607 Inverse of <code>598th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014607 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014607() {
    super(Cyclotomic.inverse(598));
  }
}
