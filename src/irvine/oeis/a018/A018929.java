package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018929 Define <code>{b(n)}</code> by <code>b(1) = 3, b(n) (n &gt;= 2)</code> is smallest number such that <code>b(1)^2 +</code> ... <code>+ b(n)^2 = m^2</code> for some m and all <code>b(i)</code> are distinct. Sequence gives values of <code>m^2</code>.
 * @author Sean A. Irvine
 */
public class A018929 extends A018928 {

  private A018930 mA = new A018930();
  {
    next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().square().subtract(mA.next().square());
  }
}

