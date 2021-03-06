package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000705;

/**
 * A002201 Superior highly composite numbers: positive integers n for which there is an e <code>&gt; 0</code> such that <code>d(n)/n^e &gt;= d(k)/k^e</code> for all k <code>&gt; 1</code>, where the function <code>d(n)</code> counts the divisors of <code>n (A000005)</code>.
 * @author Sean A. Irvine
 */
public class A002201 extends A000705 {

  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mP.multiply(super.next());
    return mP;
  }
}
