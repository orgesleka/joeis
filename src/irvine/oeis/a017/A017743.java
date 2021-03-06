package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017743 Binomial coefficients <code>C(n,79)</code>.
 * @author Sean A. Irvine
 */
public class A017743 implements Sequence {

  private long mN = 78;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 79);
  }
}

