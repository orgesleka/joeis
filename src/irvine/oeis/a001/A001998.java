package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001998 Bending a piece of wire of length <code>n+1</code>; walks of length <code>n+1</code> on a tetrahedron; also non-branched catafusenes with <code>n+2</code> condensed hexagons.
 * @author Sean A. Irvine
 */
public class A001998 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.THREE.pow(mN).add(1).add(Z.THREE.pow(mN / 2).shiftLeft(1 + (mN & 1))).shiftRight(2);
  }
}
