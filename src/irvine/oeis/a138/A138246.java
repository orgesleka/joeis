package irvine.oeis.a138;

import irvine.math.z.Z;

/**
 * A138246 Composite members of sequence <code>A138244</code>.
 * @author Sean A. Irvine
 */
public class A138246 extends A138244 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isPrime() && !Z.ONE.equals(t)) {
        return t;
      }
    }
  }
}

