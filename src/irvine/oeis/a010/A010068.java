package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A010068 <code>a(n+1) = a(n) +</code> sum of digits in base 6 representation of <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A010068 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSum(mA, Z.SIX));
    return mA;
  }
}

