package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020445 Period of continued fraction for <code>sqrt(n)</code> contains exactly nine <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A020445 extends A013648 {

  @Override
  protected int targetOnes() {
    return 9;
  }
}
