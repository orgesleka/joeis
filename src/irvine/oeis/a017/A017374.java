package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017374 <code>a(n) = (10*n + 8)^10</code>.
 * @author Sean A. Irvine
 */
public class A017374 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(10);
  }
}

