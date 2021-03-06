package irvine.oeis.a010;

/**
 * A010822 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^15</code>.
 * @author Sean A. Irvine
 */
public class A010822 extends A010816 {

  @Override
  protected int power() {
    return 15;
  }
}
