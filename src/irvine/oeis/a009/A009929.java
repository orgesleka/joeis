package irvine.oeis.a009;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009929 Coefficients in expansion of Euler's constant gamma as <code>Sum_{n&gt;=1} a(n)/(n*n!*(n+1)!)</code>, as found by greedy algorithm.
 * @author Sean A. Irvine
 */
public class A009929 implements Sequence {

  private int mN = 0;
  private Z mF2 = Z.ONE;
  private CR mX = EulerGamma.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    mF2 = mF2.multiply(mN).multiply(mN);
    final Z u = mF2.multiply(mN + 1).multiply(mN);
    final Z t = mX.multiply(CR.valueOf(u)).floor();
    mX = mX.subtract(CR.valueOf(new Q(t, u)));
    return t;
  }
}
