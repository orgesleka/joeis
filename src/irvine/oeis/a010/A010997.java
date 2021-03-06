package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010997 <code>a(n) =</code> binomial coefficient <code>C(n,44)</code>.
 * @author Sean A. Irvine
 */
public class A010997 implements Sequence {

  private long mN = 43;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 44);
  }
}

