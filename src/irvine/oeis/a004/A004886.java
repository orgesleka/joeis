package irvine.oeis.a004;

/**
 * A004886 Numbers that are the sum of at most 2 positive 9th powers.
 * @author Sean A. Irvine
 */
public class A004886 extends A004802 {

  @Override
  protected int power() {
    return 9;
  }

  @Override
  protected int min() {
    return 0;
  }
}
