package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007581 <code>a(n) = (2^n+1)*(2^n+2)/6</code>.
 * @author Sean A. Irvine
 */
public class A007581 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    return t.add(1).multiply(t.add(2)).divide(6);
  }
}
