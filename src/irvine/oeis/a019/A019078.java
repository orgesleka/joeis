package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019078 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite BOG = Boggsite Na4Ca7 [ Al18Si78O192 ] . 74 H2O.
 * @author Sean A. Irvine
 */
public class A019078 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // BOG
    return "a-1: a-37(00-) f-18(-00) f-6(000) c-3(000)\n"
      + "c-3: c-21(000) e-17(000) e-5(000)\n"
      + "f-6: e-23(000) a-13(--0)\n"
      + "a-37: f-42(0-0) c-39(000)\n"
      + "b-2: b-44(000) b-38(000) f-6(0+0) d-4(-00)\n"
      + "d-4: d-46(000) d-22(++0) e-5(000)\n"
      + "b-38: f-42(00-) d-40(-0-)\n"
      + "b-44: f-48(0+0) d-46(-00)\n"
      + "e-5: f-24(000) c-15(000)\n"
      + "c-21: e-23(000)\n"
      + "d-22: d-28(000) e-23(000)\n"
      + "d-46: e-47(000)\n"
      + "c-15: e-17(000)\n"
      + "a-13: a-25(00-) f-18(0+0) c-15(000)\n"
      + "a-7: a-43(000) f-24(0-0) f-12(0-0) c-9(000)\n"
      + "c-9: e-23(+00) c-15(0-0) e-11(000)\n"
      + "f-12: a-19(000) e-17(000)\n"
      + "a-43: f-48(000) c-45(000)\n"
      + "b-8: b-44(000) b-38(000) f-12(000) d-10(-00)\n"
      + "d-10: d-40(00-) d-16(+00) e-11(000)\n"
      + "e-11: c-21(+00) f-18(000)\n"
      + "d-16: d-34(00-) e-17(000)\n"
      + "d-40: e-41(000)\n"
      + "a-19: a-31(000) f-24(000) c-21(000)\n"
      + "a-25: f-42(+00) f-30(000) c-27(000)\n"
      + "b-14: b-32(000) b-26(000) f-18(00+) d-16(+0+)\n"
      + "b-26: f-30(0-0) d-28(+00)\n"
      + "b-32: f-36(000) d-34(+00)\n"
      + "d-34: d-40(-00) e-35(000)\n"
      + "a-31: f-48(0+0) f-36(0+0) c-33(000)\n"
      + "b-20: b-32(000) b-26(000) f-24(0-0) d-22(+00)\n"
      + "d-28: d-46(--0) e-29(000)\n"
      + "c-27: c-45(000) e-41(000) e-29(000)\n"
      + "f-30: e-47(000) a-37(++0)\n"
      + "e-29: f-48(000) c-39(000)\n"
      + "c-45: e-47(000)\n"
      + "c-39: e-41(000)\n"
      + "c-33: e-47(-00) c-39(0+0) e-35(000)\n"
      + "f-36: a-43(000) e-41(000)\n"
      + "e-35: c-45(-00) f-42(000)\n";
  }
}

