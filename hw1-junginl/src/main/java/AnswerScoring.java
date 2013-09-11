

/* First created by JCasGen Tue Sep 10 22:20:26 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:03:52 EDT 2013
 * XML source: /Users/junginlee/git/hw1-junginl/hw1-junginl/src/main/resources/hw1-junginl-typesystem.xml
 * @generated */
public class AnswerScoring extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScoring.class);
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
  protected AnswerScoring() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScoring(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScoring(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScoring(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets 
   * @generated */
  public double getScore() {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScoring");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated */
  public void setScore(double v) {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScoring");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: AnswerList

  /** getter for AnswerList - gets 
   * @generated */
  public StringList getAnswerList() {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "AnswerScoring");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_AnswerList)));}
    
  /** setter for AnswerList - sets  
   * @generated */
  public void setAnswerList(StringList v) {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "AnswerScoring");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_AnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Question

  /** getter for Question - gets 
   * @generated */
  public StringList getQuestion() {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "AnswerScoring");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_Question)));}
    
  /** setter for Question - sets  
   * @generated */
  public void setQuestion(StringList v) {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "AnswerScoring");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_Question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: QuestionTokens

  /** getter for QuestionTokens - gets 
   * @generated */
  public StringList getQuestionTokens() {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_QuestionTokens == null)
      jcasType.jcas.throwFeatMissing("QuestionTokens", "AnswerScoring");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_QuestionTokens)));}
    
  /** setter for QuestionTokens - sets  
   * @generated */
  public void setQuestionTokens(StringList v) {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_QuestionTokens == null)
      jcasType.jcas.throwFeatMissing("QuestionTokens", "AnswerScoring");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_QuestionTokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: AnswerTokens

  /** getter for AnswerTokens - gets 
   * @generated */
  public StringList getAnswerTokens() {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_AnswerTokens == null)
      jcasType.jcas.throwFeatMissing("AnswerTokens", "AnswerScoring");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_AnswerTokens)));}
    
  /** setter for AnswerTokens - sets  
   * @generated */
  public void setAnswerTokens(StringList v) {
    if (AnswerScoring_Type.featOkTst && ((AnswerScoring_Type)jcasType).casFeat_AnswerTokens == null)
      jcasType.jcas.throwFeatMissing("AnswerTokens", "AnswerScoring");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScoring_Type)jcasType).casFeatCode_AnswerTokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    