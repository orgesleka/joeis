package irvine.oeis.a000;

/**
 * A000436 Generalized Euler numbers <code>c(3,n)</code>.
 * @author Sean A. Irvine
 */
public class A000436 extends A000233 {

  @Override
  protected int getA() {
    return 3;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
