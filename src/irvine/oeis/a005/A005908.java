package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005908 <code>a(n) = [ tau*a(n-1) ] + [ tau*a(n-2) ]</code>.
 * @author Sean A. Irvine
 */
public class A005908 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = CR.PHI.multiply(CR.valueOf(mA)).floor().add(CR.PHI.multiply(CR.valueOf(mB)).floor());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
