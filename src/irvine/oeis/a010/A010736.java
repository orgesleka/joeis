package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010736 Let <code>S(x,y) =</code> number of lattice paths from <code>(0,0)</code> to <code>(x,y)</code> that use the step set <code>{ (0,1), (1,0), (2,0), (3,0), ....}</code> and never pass below <code>y =</code> x. Sequence gives <code>S(n-2,n)</code>.
 * @author Sean A. Irvine
 */
public class A010736 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.THREE;
        return Z.THREE;
      }
      mC = Z.valueOf(12);
    } else {
      final Z n = Z.valueOf(++mN);
      final Z t = mC.multiply(n.multiply(12).add(11).multiply(n).subtract(11))
        .subtract(mB.multiply(mN - 3).multiply(2 * mN - 1))
        .add(mA.multiply(3 - mN))
        .divide(mN + 3)
        .divide(2 * mN - 1);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

