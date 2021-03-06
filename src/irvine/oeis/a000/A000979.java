package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000979 Wagstaff primes: primes of form <code>(2^p + 1)/3</code>.
 * @author Sean A. Irvine
 */
public class A000979 extends A000978 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue()).add(1).divide(3);
  }
}
