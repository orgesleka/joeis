package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017159 <code>a(n) = (8*n + 7)^11</code>.
 * @author Sean A. Irvine
 */
public class A017159 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(11);
  }
}

