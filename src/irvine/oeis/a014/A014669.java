package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014669 Inverse of <code>660th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014669 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014669() {
    super(Cyclotomic.inverse(660));
  }
}
