package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019200.
 * @author Sean A. Irvine
 */
public class A019200 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // NAT
    return "a-1: a-10(000) a-9(000) a-8(-+-) b-2(0+0)\n"
      + "b-2: a-10(+00) a-9(+00) a-5(0-0)\n"
      + "a-5: a-10(000) a-9(000) b-7(0+0)\n"
      + "a-3: a-10(+0+) a-8(000) b-7(000) b-4(+00)\n"
      + "b-4: a-8(0+0) b-7(0+0) a-6(-00)\n"
      + "a-6: a-9(+-0) a-8(000) b-7(000)\n";
  }
}
