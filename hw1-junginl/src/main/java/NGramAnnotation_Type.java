
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
public class NGramAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramAnnotation(addr, NGramAnnotation_Type.this);
  			   NGramAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramAnnotation(addr, NGramAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("NGramAnnotation");
 
  /** @generated */
  final Feature casFeat_OneGram;
  /** @generated */
  final int     casFeatCode_OneGram;
  /** @generated */ 
  public int getOneGram(int addr) {
        if (featOkTst && casFeat_OneGram == null)
      jcas.throwFeatMissing("OneGram", "NGramAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_OneGram);
  }
  /** @generated */    
  public void setOneGram(int addr, int v) {
        if (featOkTst && casFeat_OneGram == null)
      jcas.throwFeatMissing("OneGram", "NGramAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_OneGram, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TwoGrams;
  /** @generated */
  final int     casFeatCode_TwoGrams;
  /** @generated */ 
  public int getTwoGrams(int addr) {
        if (featOkTst && casFeat_TwoGrams == null)
      jcas.throwFeatMissing("TwoGrams", "NGramAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TwoGrams);
  }
  /** @generated */    
  public void setTwoGrams(int addr, int v) {
        if (featOkTst && casFeat_TwoGrams == null)
      jcas.throwFeatMissing("TwoGrams", "NGramAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_TwoGrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ThreeGrams;
  /** @generated */
  final int     casFeatCode_ThreeGrams;
  /** @generated */ 
  public int getThreeGrams(int addr) {
        if (featOkTst && casFeat_ThreeGrams == null)
      jcas.throwFeatMissing("ThreeGrams", "NGramAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ThreeGrams);
  }
  /** @generated */    
  public void setThreeGrams(int addr, int v) {
        if (featOkTst && casFeat_ThreeGrams == null)
      jcas.throwFeatMissing("ThreeGrams", "NGramAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_ThreeGrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elements;
  /** @generated */
  final int     casFeatCode_elements;
  /** @generated */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "NGramAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "NGramAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TokenList;
  /** @generated */
  final int     casFeatCode_TokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "NGramAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "NGramAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_TokenList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_OneGram = jcas.getRequiredFeatureDE(casType, "OneGram", "uima.cas.StringList", featOkTst);
    casFeatCode_OneGram  = (null == casFeat_OneGram) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_OneGram).getCode();

 
    casFeat_TwoGrams = jcas.getRequiredFeatureDE(casType, "TwoGrams", "uima.cas.StringList", featOkTst);
    casFeatCode_TwoGrams  = (null == casFeat_TwoGrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TwoGrams).getCode();

 
    casFeat_ThreeGrams = jcas.getRequiredFeatureDE(casType, "ThreeGrams", "uima.cas.StringList", featOkTst);
    casFeatCode_ThreeGrams  = (null == casFeat_ThreeGrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ThreeGrams).getCode();

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSList", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

 
    casFeat_TokenList = jcas.getRequiredFeatureDE(casType, "TokenList", "uima.cas.StringList", featOkTst);
    casFeatCode_TokenList  = (null == casFeat_TokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenList).getCode();

  }
}



    