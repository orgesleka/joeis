package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004919 Floor of <code>n*phi^4</code>, where phi is the golden ratio, <code>A001622</code>.
 * @author Sean A. Irvine
 */
public class A004919 implements Sequence {

  private static final CR PHI4 = ComputableReals.SINGLETON.pow(CR.PHI, 4);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI4.multiply(CR.valueOf(++mN)).floor();
  }
}
