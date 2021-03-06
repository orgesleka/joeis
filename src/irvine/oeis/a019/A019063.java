package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019063 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite VFI <code>= VPI-5 [ Al18P18O72 ]. 42 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019063 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // VFI
    return "a-1: a-28(000) a-23(00+) a-19(00+) b-6(00+)\n"
      + "b-6: a-36(-0-) b-20(00-) b-18(000)\n"
      + "a-19: a-33(000) b-22(0+-)\n"
      + "a-23: a-32(000)\n"
      + "a-28: a-33(000) a-32(000)\n"
      + "b-2: a-34(00-) b-22(00-) b-14(000) a-9(0--)\n"
      + "a-9: a-26(000) a-21(00+) a-19(00+)\n"
      + "b-14: a-26(0-0) a-17(000)\n"
      + "b-22: a-29(00+)\n"
      + "a-3: a-29(000) a-17(000) a-13(000) b-8(000)\n"
      + "b-8: a-33(0-0) b-22(000) b-14(000)\n"
      + "a-13: a-35(000) b-16(000)\n"
      + "a-17: a-34(000)\n"
      + "a-29: a-35(00-) a-34(00-)\n"
      + "b-4: a-31(000) b-24(000) b-16(000) a-11(000)\n"
      + "a-11: a-27(000) a-15(000) a-13(000)\n"
      + "b-16: a-30(000)\n"
      + "b-24: a-27(00+)\n"
      + "a-5: a-30(000) a-23(00+) a-21(00+) b-10(00+)\n"
      + "b-10: a-35(00-) b-24(00-) b-16(000)\n"
      + "a-21: a-31(000) b-24(00-)\n"
      + "a-30: a-32(000) a-31(000)\n"
      + "b-18: a-28(000)\n"
      + "b-20: a-25(-0+) a-23(00+)\n"
      + "a-7: a-25(000) a-17(000) a-15(000) b-12(+00)\n"
      + "b-12: a-32(000) b-20(000) b-18(000)\n"
      + "a-15: a-36(000) b-18(+00)\n"
      + "a-25: a-36(00-) a-34(00-)\n"
      + "a-26: a-33(000) a-31(000)\n"
      + "a-27: a-36(00-) a-35(00-)\n";
  }
}

