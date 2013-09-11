
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
public class AnswerScoring_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerScoring_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerScoring_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerScoring(addr, AnswerScoring_Type.this);
  			   AnswerScoring_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerScoring(addr, AnswerScoring_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerScoring.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerScoring");
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "AnswerScoring");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "AnswerScoring");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnswerList;
  /** @generated */
  final int     casFeatCode_AnswerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "AnswerScoring");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "AnswerScoring");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Question;
  /** @generated */
  final int     casFeatCode_Question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "AnswerScoring");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "AnswerScoring");
    ll_cas.ll_setRefValue(addr, casFeatCode_Question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_QuestionTokens;
  /** @generated */
  final int     casFeatCode_QuestionTokens;
  /** @generated */ 
  public int getQuestionTokens(int addr) {
        if (featOkTst && casFeat_QuestionTokens == null)
      jcas.throwFeatMissing("QuestionTokens", "AnswerScoring");
    return ll_cas.ll_getRefValue(addr, casFeatCode_QuestionTokens);
  }
  /** @generated */    
  public void setQuestionTokens(int addr, int v) {
        if (featOkTst && casFeat_QuestionTokens == null)
      jcas.throwFeatMissing("QuestionTokens", "AnswerScoring");
    ll_cas.ll_setRefValue(addr, casFeatCode_QuestionTokens, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnswerTokens;
  /** @generated */
  final int     casFeatCode_AnswerTokens;
  /** @generated */ 
  public int getAnswerTokens(int addr) {
        if (featOkTst && casFeat_AnswerTokens == null)
      jcas.throwFeatMissing("AnswerTokens", "AnswerScoring");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerTokens);
  }
  /** @generated */    
  public void setAnswerTokens(int addr, int v) {
        if (featOkTst && casFeat_AnswerTokens == null)
      jcas.throwFeatMissing("AnswerTokens", "AnswerScoring");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerTokens, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerScoring_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_AnswerList = jcas.getRequiredFeatureDE(casType, "AnswerList", "uima.cas.StringList", featOkTst);
    casFeatCode_AnswerList  = (null == casFeat_AnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerList).getCode();

 
    casFeat_Question = jcas.getRequiredFeatureDE(casType, "Question", "uima.cas.StringList", featOkTst);
    casFeatCode_Question  = (null == casFeat_Question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Question).getCode();

 
    casFeat_QuestionTokens = jcas.getRequiredFeatureDE(casType, "QuestionTokens", "uima.cas.StringList", featOkTst);
    casFeatCode_QuestionTokens  = (null == casFeat_QuestionTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_QuestionTokens).getCode();

 
    casFeat_AnswerTokens = jcas.getRequiredFeatureDE(casType, "AnswerTokens", "uima.cas.StringList", featOkTst);
    casFeatCode_AnswerTokens  = (null == casFeat_AnswerTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerTokens).getCode();

  }
}



    