
/* First created by JCasGen Tue Sep 10 22:20:26 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 10 23:03:52 EDT 2013
 * @generated */
public class Evaluation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluation(addr, Evaluation_Type.this);
  			   Evaluation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluation(addr, Evaluation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Evaluation");
 
  /** @generated */
  final Feature casFeat_AnswerList;
  /** @generated */
  final int     casFeatCode_AnswerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Evaluation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Evaluation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precisionN;
  /** @generated */
  final int     casFeatCode_precisionN;
  /** @generated */ 
  public int getPrecisionN(int addr) {
        if (featOkTst && casFeat_precisionN == null)
      jcas.throwFeatMissing("precisionN", "Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_precisionN);
  }
  /** @generated */    
  public void setPrecisionN(int addr, int v) {
        if (featOkTst && casFeat_precisionN == null)
      jcas.throwFeatMissing("precisionN", "Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_precisionN, v);}
    
   /** @generated */
  public double getPrecisionN(int addr, int i) {
        if (featOkTst && casFeat_precisionN == null)
      jcas.throwFeatMissing("precisionN", "Evaluation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_precisionN), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_precisionN), i);
  return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_precisionN), i);
  }
   
  /** @generated */ 
  public void setPrecisionN(int addr, int i, double v) {
        if (featOkTst && casFeat_precisionN == null)
      jcas.throwFeatMissing("precisionN", "Evaluation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_precisionN), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_precisionN), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_precisionN), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_IsCorrect;
  /** @generated */
  final int     casFeatCode_IsCorrect;
  /** @generated */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_IsCorrect == null)
      jcas.throwFeatMissing("IsCorrect", "Evaluation");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_IsCorrect);
  }
  /** @generated */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_IsCorrect == null)
      jcas.throwFeatMissing("IsCorrect", "Evaluation");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_IsCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NumCorrect;
  /** @generated */
  final int     casFeatCode_NumCorrect;
  /** @generated */ 
  public int getNumCorrect(int addr) {
        if (featOkTst && casFeat_NumCorrect == null)
      jcas.throwFeatMissing("NumCorrect", "Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NumCorrect);
  }
  /** @generated */    
  public void setNumCorrect(int addr, int v) {
        if (featOkTst && casFeat_NumCorrect == null)
      jcas.throwFeatMissing("NumCorrect", "Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_NumCorrect, v);}
    
   /** @generated */
  public int getNumCorrect(int addr, int i) {
        if (featOkTst && casFeat_NumCorrect == null)
      jcas.throwFeatMissing("NumCorrect", "Evaluation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumCorrect), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NumCorrect), i);
  return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumCorrect), i);
  }
   
  /** @generated */ 
  public void setNumCorrect(int addr, int i, int v) {
        if (featOkTst && casFeat_NumCorrect == null)
      jcas.throwFeatMissing("NumCorrect", "Evaluation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumCorrect), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NumCorrect), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumCorrect), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_NumPredicted;
  /** @generated */
  final int     casFeatCode_NumPredicted;
  /** @generated */ 
  public int getNumPredicted(int addr) {
        if (featOkTst && casFeat_NumPredicted == null)
      jcas.throwFeatMissing("NumPredicted", "Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NumPredicted);
  }
  /** @generated */    
  public void setNumPredicted(int addr, int v) {
        if (featOkTst && casFeat_NumPredicted == null)
      jcas.throwFeatMissing("NumPredicted", "Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_NumPredicted, v);}
    
   /** @generated */
  public int getNumPredicted(int addr, int i) {
        if (featOkTst && casFeat_NumPredicted == null)
      jcas.throwFeatMissing("NumPredicted", "Evaluation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumPredicted), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NumPredicted), i);
  return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumPredicted), i);
  }
   
  /** @generated */ 
  public void setNumPredicted(int addr, int i, int v) {
        if (featOkTst && casFeat_NumPredicted == null)
      jcas.throwFeatMissing("NumPredicted", "Evaluation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumPredicted), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NumPredicted), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NumPredicted), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_AnswerList = jcas.getRequiredFeatureDE(casType, "AnswerList", "uima.cas.StringList", featOkTst);
    casFeatCode_AnswerList  = (null == casFeat_AnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerList).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_precisionN = jcas.getRequiredFeatureDE(casType, "precisionN", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_precisionN  = (null == casFeat_precisionN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precisionN).getCode();

 
    casFeat_IsCorrect = jcas.getRequiredFeatureDE(casType, "IsCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_IsCorrect  = (null == casFeat_IsCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IsCorrect).getCode();

 
    casFeat_NumCorrect = jcas.getRequiredFeatureDE(casType, "NumCorrect", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_NumCorrect  = (null == casFeat_NumCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NumCorrect).getCode();

 
    casFeat_NumPredicted = jcas.getRequiredFeatureDE(casType, "NumPredicted", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_NumPredicted  = (null == casFeat_NumPredicted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NumPredicted).getCode();

  }
}



    