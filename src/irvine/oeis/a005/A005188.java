package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A005188 Armstrong (or pluperfect, or Plus Perfect, or narcissistic) numbers: m-digit numbers equal to sum of the m-th powers of their digits.
 * @author Sean A. Irvine
 */
public class A005188 extends FiniteSequence {

  /** Construct the sequence. */
  public A005188() {
    super(Z.ONE,
      Z.TWO,
      Z.THREE,
      Z.FOUR,
      Z.FIVE,
      Z.SIX,
      Z.SEVEN,
      Z.EIGHT,
      Z.NINE,
      Z.valueOf(153L),
      Z.valueOf(370L),
      Z.valueOf(371L),
      Z.valueOf(407L),
      Z.valueOf(1634L),
      Z.valueOf(8208L),
      Z.valueOf(9474L),
      Z.valueOf(54748L),
      Z.valueOf(92727L),
      Z.valueOf(93084L),
      Z.valueOf(548834L),
      Z.valueOf(1741725L),
      Z.valueOf(4210818L),
      Z.valueOf(9800817L),
      Z.valueOf(9926315L),
      Z.valueOf(24678050L),
      Z.valueOf(24678051L),
      Z.valueOf(88593477L),
      Z.valueOf(146511208L),
      Z.valueOf(472335975L),
      Z.valueOf(534494836L),
      Z.valueOf(912985153L),
      Z.valueOf(4679307774L),
      Z.valueOf(32164049650L),
      Z.valueOf(32164049651L),
      Z.valueOf(40028394225L),
      Z.valueOf(42678290603L),
      Z.valueOf(44708635679L),
      Z.valueOf(49388550606L),
      Z.valueOf(82693916578L),
      Z.valueOf(94204591914L),
      new Z("28116440335967"),
      new Z("4338281769391370"),
      new Z("4338281769391371"),
      new Z("21897142587612075"),
      new Z("35641594208964132"),
      new Z("35875699062250035"),
      new Z("1517841543307505039"),
      new Z("3289582984443187032"),
      new Z("4498128791164624869"),
      new Z("4929273885928088826"),
      new Z("63105425988599693916"),
      new Z("128468643043731391252"),
      new Z("449177399146038697307"),
      new Z("21887696841122916288858"),
      new Z("27879694893054074471405"),
      new Z("27907865009977052567814"),
      new Z("28361281321319229463398"),
      new Z("35452590104031691935943"),
      new Z("174088005938065293023722"),
      new Z("188451485447897896036875"),
      new Z("239313664430041569350093"),
      new Z("1550475334214501539088894"),
      new Z("1553242162893771850669378"),
      new Z("3706907995955475988644380"),
      new Z("3706907995955475988644381"),
      new Z("4422095118095899619457938"),
      new Z("121204998563613372405438066"),
      new Z("121270696006801314328439376"),
      new Z("128851796696487777842012787"),
      new Z("174650464499531377631639254"),
      new Z("177265453171792792366489765"),
      new Z("14607640612971980372614873089"),
      new Z("19008174136254279995012734740"),
      new Z("19008174136254279995012734741"),
      new Z("23866716435523975980390369295"),
      new Z("1145037275765491025924292050346"),
      new Z("1927890457142960697580636236639"),
      new Z("2309092682616190307509695338915"),
      new Z("17333509997782249308725103962772"),
      new Z("186709961001538790100634132976990"),
      new Z("186709961001538790100634132976991"),
      new Z("1122763285329372541592822900204593"),
      new Z("12639369517103790328947807201478392"),
      new Z("12679937780272278566303885594196922"),
      new Z("1219167219625434121569735803609966019"),
      new Z("12815792078366059955099770545296129367"),
      new Z("115132219018763992565095597973971522400"),
      new Z("115132219018763992565095597973971522401")
    );
  }
}
