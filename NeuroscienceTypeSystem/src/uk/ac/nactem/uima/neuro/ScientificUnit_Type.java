
/* First created by JCasGen Thu Feb 08 16:19:42 GMT 2018 */
package uk.ac.nactem.uima.neuro;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Scientific Unit
 * Updated by JCasGen Thu Feb 08 16:23:32 GMT 2018
 * @generated */
public class ScientificUnit_Type extends NeuroConcept_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ScientificUnit.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uk.ac.nactem.uima.neuro.ScientificUnit");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ScientificUnit_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    