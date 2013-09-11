

/* First created by JCasGen Tue Sep 10 22:20:26 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.Sofa;
import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:03:52 EDT 2013
 * XML source: /Users/junginlee/git/hw1-junginl/hw1-junginl/src/main/resources/hw1-junginl-typesystem.xml
 * @generated */
public class TestElementAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TestElementAnnotation.class);
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
  protected TestElementAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TestElementAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TestElementAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TestElementAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: InputFile

  /** getter for InputFile - gets 
   * @generated */
  public Sofa getInputFile() {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_InputFile == null)
      jcasType.jcas.throwFeatMissing("InputFile", "TestElementAnnotation");
    return (Sofa)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_InputFile)));}
    
  /** setter for InputFile - sets  
   * @generated */
  public void setInputFile(Sofa v) {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_InputFile == null)
      jcasType.jcas.throwFeatMissing("InputFile", "TestElementAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_InputFile, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Question

  /** getter for Question - gets 
   * @generated */
  public StringList getQuestion() {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "TestElementAnnotation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_Question)));}
    
  /** setter for Question - sets  
   * @generated */
  public void setQuestion(StringList v) {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "TestElementAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_Question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: AnswerList

  /** getter for AnswerList - gets 
   * @generated */
  public StringList getAnswerList() {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "TestElementAnnotation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_AnswerList)));}
    
  /** setter for AnswerList - sets  
   * @generated */
  public void setAnswerList(StringList v) {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "TestElementAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_AnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: IsCorrect

  /** getter for IsCorrect - gets 
   * @generated */
  public boolean getIsCorrect() {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "TestElementAnnotation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_IsCorrect);}
    
  /** setter for IsCorrect - sets  
   * @generated */
  public void setIsCorrect(boolean v) {
    if (TestElementAnnotation_Type.featOkTst && ((TestElementAnnotation_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "TestElementAnnotation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TestElementAnnotation_Type)jcasType).casFeatCode_IsCorrect, v);}    
  }

    