
/* First created by JCasGen Thu Feb 08 16:19:42 GMT 2018 */
package uk.ac.nactem.uima.neuro;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Model organism
 * Updated by JCasGen Thu Feb 08 16:23:32 GMT 2018
 * @generated */
public class ModelOrganism_Type extends NeuroConcept_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ModelOrganism.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uk.ac.nactem.uima.neuro.ModelOrganism");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ModelOrganism_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    