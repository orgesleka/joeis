package irvine.oeis.a001;

/**
 * A001391 To get the 3rd term, for example, note that 2nd term has three <code>(11</code> in <code>binary!) 1</code>'s and one <code>(1) 0</code>, giving <code>11 1 1 0</code>.
 * @author Sean A. Irvine
 */
public class A001391 extends A001387 {

  @Override
  protected String start() {
    return "10";
  }
}
