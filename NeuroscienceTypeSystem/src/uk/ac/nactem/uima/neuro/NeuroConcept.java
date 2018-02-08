

/* First created by JCasGen Thu Feb 08 16:19:42 GMT 2018 */
package uk.ac.nactem.uima.neuro;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Basic concept for neuroscience.
 * Updated by JCasGen Thu Feb 08 16:23:32 GMT 2018
 * XML source: C:/Users/Nhung Nguyen/workspace/OpenMinTeD/NeuroscienceTypeSystem/src/NeuroscienceTypeSystem.xml
 * @generated */
public class NeuroConcept extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NeuroConcept.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NeuroConcept() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NeuroConcept(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NeuroConcept(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NeuroConcept(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets ID in an external database.
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (NeuroConcept_Type.featOkTst && ((NeuroConcept_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "uk.ac.nactem.uima.neuro.NeuroConcept");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NeuroConcept_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets ID in an external database. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (NeuroConcept_Type.featOkTst && ((NeuroConcept_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "uk.ac.nactem.uima.neuro.NeuroConcept");
    jcasType.ll_cas.ll_setStringValue(addr, ((NeuroConcept_Type)jcasType).casFeatCode_id, v);}    
  }

    