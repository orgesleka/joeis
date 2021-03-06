package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002817 Doubly triangular numbers: <code>a(n) = n*(n+1)*(n^2+n+2)/8</code>.
 * @author Sean A. Irvine
 */
public class A002817 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z a = mN.add(1);
    return mN.multiply(a).multiply(a.multiply(mN).add(2)).shiftRight(3);
  }
}

