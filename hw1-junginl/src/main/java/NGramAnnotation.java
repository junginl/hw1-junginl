

/* First created by JCasGen Tue Sep 10 22:20:26 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:03:52 EDT 2013
 * XML source: /Users/junginlee/git/hw1-junginl/hw1-junginl/src/main/resources/hw1-junginl-typesystem.xml
 * @generated */
public class NGramAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NGramAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: OneGram

  /** getter for OneGram - gets 
   * @generated */
  public StringList getOneGram() {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_OneGram == null)
      jcasType.jcas.throwFeatMissing("OneGram", "NGramAnnotation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_OneGram)));}
    
  /** setter for OneGram - sets  
   * @generated */
  public void setOneGram(StringList v) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_OneGram == null)
      jcasType.jcas.throwFeatMissing("OneGram", "NGramAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_OneGram, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: TwoGrams

  /** getter for TwoGrams - gets 
   * @generated */
  public StringList getTwoGrams() {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_TwoGrams == null)
      jcasType.jcas.throwFeatMissing("TwoGrams", "NGramAnnotation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_TwoGrams)));}
    
  /** setter for TwoGrams - sets  
   * @generated */
  public void setTwoGrams(StringList v) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_TwoGrams == null)
      jcasType.jcas.throwFeatMissing("TwoGrams", "NGramAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_TwoGrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ThreeGrams

  /** getter for ThreeGrams - gets 
   * @generated */
  public StringList getThreeGrams() {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_ThreeGrams == null)
      jcasType.jcas.throwFeatMissing("ThreeGrams", "NGramAnnotation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_ThreeGrams)));}
    
  /** setter for ThreeGrams - sets  
   * @generated */
  public void setThreeGrams(StringList v) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_ThreeGrams == null)
      jcasType.jcas.throwFeatMissing("ThreeGrams", "NGramAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_ThreeGrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets 
   * @generated */
  public FSList getElements() {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "NGramAnnotation");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets  
   * @generated */
  public void setElements(FSList v) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "NGramAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: TokenList

  /** getter for TokenList - gets 
   * @generated */
  public StringList getTokenList() {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "NGramAnnotation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets  
   * @generated */
  public void setTokenList(StringList v) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "NGramAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    