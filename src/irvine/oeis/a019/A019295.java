package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019295 <code>a(n) = sigma(sigma(...(sigma(n))...) /</code> n, where sigma <code>(A000203)</code> is iterated <code>A019294(n)</code> times.
 * @author Sean A. Irvine
 */
public class A019295 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    Z[] qr;
    do {
      m = Jaguar.factor(m).sigma();
      qr = m.divideAndRemainder(mN);
    } while (!qr[1].equals(Z.ZERO));
    return qr[0];
  }
}

