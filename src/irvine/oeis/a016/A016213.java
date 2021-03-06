package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016213 Inverse of <code>2204th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016213 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016213() {
    super(Cyclotomic.inverse(2204));
  }
}
