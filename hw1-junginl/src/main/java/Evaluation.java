

/* First created by JCasGen Tue Sep 10 22:20:26 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.IntegerArray;
import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.DoubleArray;


/** 
 * Updated by JCasGen Tue Sep 10 23:03:52 EDT 2013
 * XML source: /Users/junginlee/git/hw1-junginl/hw1-junginl/src/main/resources/hw1-junginl-typesystem.xml
 * @generated */
public class Evaluation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
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
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
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
  //* Feature: AnswerList

  /** getter for AnswerList - gets 
   * @generated */
  public StringList getAnswerList() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "Evaluation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_AnswerList)));}
    
  /** setter for AnswerList - sets  
   * @generated */
  public void setAnswerList(StringList v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_AnswerList == null)
      jcasType.jcas.throwFeatMissing("AnswerList", "Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_AnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets 
   * @generated */
  public double getScore() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Evaluation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated */
  public void setScore(double v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Evaluation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: precisionN

  /** getter for precisionN - gets 
   * @generated */
  public DoubleArray getPrecisionN() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionN == null)
      jcasType.jcas.throwFeatMissing("precisionN", "Evaluation");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionN)));}
    
  /** setter for precisionN - sets  
   * @generated */
  public void setPrecisionN(DoubleArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionN == null)
      jcasType.jcas.throwFeatMissing("precisionN", "Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionN, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for precisionN - gets an indexed value - 
   * @generated */
  public double getPrecisionN(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionN == null)
      jcasType.jcas.throwFeatMissing("precisionN", "Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionN), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionN), i);}

  /** indexed setter for precisionN - sets an indexed value - 
   * @generated */
  public void setPrecisionN(int i, double v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionN == null)
      jcasType.jcas.throwFeatMissing("precisionN", "Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionN), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionN), i, v);}
   
    
  //*--------------*
  //* Feature: IsCorrect

  /** getter for IsCorrect - gets 
   * @generated */
  public boolean getIsCorrect() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Evaluation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Evaluation_Type)jcasType).casFeatCode_IsCorrect);}
    
  /** setter for IsCorrect - sets  
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_IsCorrect == null)
      jcasType.jcas.throwFeatMissing("IsCorrect", "Evaluation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Evaluation_Type)jcasType).casFeatCode_IsCorrect, v);}    
   
    
  //*--------------*
  //* Feature: NumCorrect

  /** getter for NumCorrect - gets 
   * @generated */
  public IntegerArray getNumCorrect() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumCorrect == null)
      jcasType.jcas.throwFeatMissing("NumCorrect", "Evaluation");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumCorrect)));}
    
  /** setter for NumCorrect - sets  
   * @generated */
  public void setNumCorrect(IntegerArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumCorrect == null)
      jcasType.jcas.throwFeatMissing("NumCorrect", "Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumCorrect, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for NumCorrect - gets an indexed value - 
   * @generated */
  public int getNumCorrect(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumCorrect == null)
      jcasType.jcas.throwFeatMissing("NumCorrect", "Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumCorrect), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumCorrect), i);}

  /** indexed setter for NumCorrect - sets an indexed value - 
   * @generated */
  public void setNumCorrect(int i, int v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumCorrect == null)
      jcasType.jcas.throwFeatMissing("NumCorrect", "Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumCorrect), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumCorrect), i, v);}
   
    
  //*--------------*
  //* Feature: NumPredicted

  /** getter for NumPredicted - gets 
   * @generated */
  public IntegerArray getNumPredicted() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumPredicted == null)
      jcasType.jcas.throwFeatMissing("NumPredicted", "Evaluation");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumPredicted)));}
    
  /** setter for NumPredicted - sets  
   * @generated */
  public void setNumPredicted(IntegerArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumPredicted == null)
      jcasType.jcas.throwFeatMissing("NumPredicted", "Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumPredicted, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for NumPredicted - gets an indexed value - 
   * @generated */
  public int getNumPredicted(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumPredicted == null)
      jcasType.jcas.throwFeatMissing("NumPredicted", "Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumPredicted), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumPredicted), i);}

  /** indexed setter for NumPredicted - sets an indexed value - 
   * @generated */
  public void setNumPredicted(int i, int v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_NumPredicted == null)
      jcasType.jcas.throwFeatMissing("NumPredicted", "Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumPredicted), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_NumPredicted), i, v);}
  }

    