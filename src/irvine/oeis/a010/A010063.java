package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A010063 <code>a(n+1) = a(n) +</code> sum of digits in base 3 representation of <code>a(n)</code>, with <code>a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A010063 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSum(mA, Z.THREE));
    return mA;
  }
}

