package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;

/**
 * A018252 The nonprime numbers <code>(1</code> together with the composite numbers, <code>A002808)</code>.
 * @author Sean A. Irvine
 */
public class A018252 extends PrependSequence {

  /** Construct the sequence. */
  public A018252() {
    super(new A002808(), Z.ONE);
  }
}

