package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A004683 Primes written in base 9.
 * @author Sean A. Irvine
 */
public class A004683 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(9));
  }
}

