package org.xtext.example.resume.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.resume.services.ResumeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalResumeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Metadata'", "'style:'", "'font:'", "'imgPath:'", "'Userdata'", "'name:'", "'email:'", "'telephoneNumber:'", "'direction:'", "'city:'", "'country:'", "'Experience'", "'language:'", "'title:'", "'description:'", "'company:'", "'startDate:'", "'endDate:'", "'tags:'", "'Projects'", "'technologies:'", "'link:'", "'from:'", "','", "'Education'", "'institution:'", "'graduationDate:'", "'Skills'", "'Interests'", "'Languages'", "'Metrics'", "'Metric'", "'='", "'-'", "'Customization'", "'include'", "'Profile'", "'where'", "'language'", "'tags'", "'startDate'", "'after'", "'endDate'", "'before'", "'all'", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalResumeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalResumeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalResumeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalResume.g"; }



     	private ResumeGrammarAccess grammarAccess;

        public InternalResumeParser(TokenStream input, ResumeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Profile";
       	}

       	@Override
       	protected ResumeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProfile"
    // InternalResume.g:65:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalResume.g:65:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalResume.g:66:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalResume.g:72:1: ruleProfile returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        EObject lv_metadata_0_0 = null;

        EObject lv_userdata_1_0 = null;

        EObject lv_sections_2_0 = null;

        EObject lv_customization_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:78:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) ) )
            // InternalResume.g:79:2: ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) )
            {
            // InternalResume.g:79:2: ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) )
            // InternalResume.g:80:3: ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) )
            {
            // InternalResume.g:80:3: ( (lv_metadata_0_0= ruleMetadata ) )
            // InternalResume.g:81:4: (lv_metadata_0_0= ruleMetadata )
            {
            // InternalResume.g:81:4: (lv_metadata_0_0= ruleMetadata )
            // InternalResume.g:82:5: lv_metadata_0_0= ruleMetadata
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getMetadataMetadataParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_metadata_0_0=ruleMetadata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"metadata",
            						lv_metadata_0_0,
            						"org.xtext.example.resume.Resume.Metadata");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:99:3: ( (lv_userdata_1_0= ruleUserdata ) )
            // InternalResume.g:100:4: (lv_userdata_1_0= ruleUserdata )
            {
            // InternalResume.g:100:4: (lv_userdata_1_0= ruleUserdata )
            // InternalResume.g:101:5: lv_userdata_1_0= ruleUserdata
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getUserdataUserdataParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_userdata_1_0=ruleUserdata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"userdata",
            						lv_userdata_1_0,
            						"org.xtext.example.resume.Resume.Userdata");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:118:3: ( (lv_sections_2_0= ruleSection ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==30||LA1_0==35||(LA1_0>=38 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalResume.g:119:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalResume.g:119:4: (lv_sections_2_0= ruleSection )
            	    // InternalResume.g:120:5: lv_sections_2_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getSectionsSectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_2_0,
            	    						"org.xtext.example.resume.Resume.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalResume.g:137:3: ( (lv_customization_3_0= ruleCustomization ) )
            // InternalResume.g:138:4: (lv_customization_3_0= ruleCustomization )
            {
            // InternalResume.g:138:4: (lv_customization_3_0= ruleCustomization )
            // InternalResume.g:139:5: lv_customization_3_0= ruleCustomization
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getCustomizationCustomizationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_customization_3_0=ruleCustomization();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"customization",
            						lv_customization_3_0,
            						"org.xtext.example.resume.Resume.Customization");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleMetadata"
    // InternalResume.g:160:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // InternalResume.g:160:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalResume.g:161:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalResume.g:167:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_style_2_0=null;
        Token otherlv_3=null;
        Token lv_font_4_0=null;
        Token otherlv_5=null;
        Token lv_imgPath_6_0=null;


        	enterRule();

        try {
            // InternalResume.g:173:2: ( (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) ) )
            // InternalResume.g:174:2: (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) )
            {
            // InternalResume.g:174:2: (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) )
            // InternalResume.g:175:3: otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataAccess().getStyleKeyword_1());
            		
            // InternalResume.g:183:3: ( (lv_style_2_0= RULE_STRING ) )
            // InternalResume.g:184:4: (lv_style_2_0= RULE_STRING )
            {
            // InternalResume.g:184:4: (lv_style_2_0= RULE_STRING )
            // InternalResume.g:185:5: lv_style_2_0= RULE_STRING
            {
            lv_style_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_style_2_0, grammarAccess.getMetadataAccess().getStyleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"style",
            						lv_style_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getFontKeyword_3());
            		
            // InternalResume.g:205:3: ( (lv_font_4_0= RULE_STRING ) )
            // InternalResume.g:206:4: (lv_font_4_0= RULE_STRING )
            {
            // InternalResume.g:206:4: (lv_font_4_0= RULE_STRING )
            // InternalResume.g:207:5: lv_font_4_0= RULE_STRING
            {
            lv_font_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_font_4_0, grammarAccess.getMetadataAccess().getFontSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"font",
            						lv_font_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMetadataAccess().getImgPathKeyword_5());
            		
            // InternalResume.g:227:3: ( (lv_imgPath_6_0= RULE_STRING ) )
            // InternalResume.g:228:4: (lv_imgPath_6_0= RULE_STRING )
            {
            // InternalResume.g:228:4: (lv_imgPath_6_0= RULE_STRING )
            // InternalResume.g:229:5: lv_imgPath_6_0= RULE_STRING
            {
            lv_imgPath_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_imgPath_6_0, grammarAccess.getMetadataAccess().getImgPathSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"imgPath",
            						lv_imgPath_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleUserdata"
    // InternalResume.g:249:1: entryRuleUserdata returns [EObject current=null] : iv_ruleUserdata= ruleUserdata EOF ;
    public final EObject entryRuleUserdata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserdata = null;


        try {
            // InternalResume.g:249:49: (iv_ruleUserdata= ruleUserdata EOF )
            // InternalResume.g:250:2: iv_ruleUserdata= ruleUserdata EOF
            {
             newCompositeNode(grammarAccess.getUserdataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserdata=ruleUserdata();

            state._fsp--;

             current =iv_ruleUserdata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserdata"


    // $ANTLR start "ruleUserdata"
    // InternalResume.g:256:1: ruleUserdata returns [EObject current=null] : (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserdata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_email_4_0=null;
        Token otherlv_5=null;
        Token lv_telephoneNumber_6_0=null;
        Token otherlv_7=null;
        Token lv_direction_8_0=null;
        Token otherlv_9=null;
        Token lv_city_10_0=null;
        Token otherlv_11=null;
        Token lv_country_12_0=null;


        	enterRule();

        try {
            // InternalResume.g:262:2: ( (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) ) )
            // InternalResume.g:263:2: (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) )
            {
            // InternalResume.g:263:2: (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) )
            // InternalResume.g:264:3: otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUserdataAccess().getUserdataKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getUserdataAccess().getNameKeyword_1());
            		
            // InternalResume.g:272:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalResume.g:273:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalResume.g:273:4: (lv_name_2_0= RULE_STRING )
            // InternalResume.g:274:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUserdataAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUserdataAccess().getEmailKeyword_3());
            		
            // InternalResume.g:294:3: ( (lv_email_4_0= RULE_STRING ) )
            // InternalResume.g:295:4: (lv_email_4_0= RULE_STRING )
            {
            // InternalResume.g:295:4: (lv_email_4_0= RULE_STRING )
            // InternalResume.g:296:5: lv_email_4_0= RULE_STRING
            {
            lv_email_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_email_4_0, grammarAccess.getUserdataAccess().getEmailSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUserdataAccess().getTelephoneNumberKeyword_5());
            		
            // InternalResume.g:316:3: ( (lv_telephoneNumber_6_0= RULE_STRING ) )
            // InternalResume.g:317:4: (lv_telephoneNumber_6_0= RULE_STRING )
            {
            // InternalResume.g:317:4: (lv_telephoneNumber_6_0= RULE_STRING )
            // InternalResume.g:318:5: lv_telephoneNumber_6_0= RULE_STRING
            {
            lv_telephoneNumber_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_telephoneNumber_6_0, grammarAccess.getUserdataAccess().getTelephoneNumberSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"telephoneNumber",
            						lv_telephoneNumber_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getUserdataAccess().getDirectionKeyword_7());
            		
            // InternalResume.g:338:3: ( (lv_direction_8_0= RULE_STRING ) )
            // InternalResume.g:339:4: (lv_direction_8_0= RULE_STRING )
            {
            // InternalResume.g:339:4: (lv_direction_8_0= RULE_STRING )
            // InternalResume.g:340:5: lv_direction_8_0= RULE_STRING
            {
            lv_direction_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_direction_8_0, grammarAccess.getUserdataAccess().getDirectionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"direction",
            						lv_direction_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getUserdataAccess().getCityKeyword_9());
            		
            // InternalResume.g:360:3: ( (lv_city_10_0= RULE_STRING ) )
            // InternalResume.g:361:4: (lv_city_10_0= RULE_STRING )
            {
            // InternalResume.g:361:4: (lv_city_10_0= RULE_STRING )
            // InternalResume.g:362:5: lv_city_10_0= RULE_STRING
            {
            lv_city_10_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_city_10_0, grammarAccess.getUserdataAccess().getCitySTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"city",
            						lv_city_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getUserdataAccess().getCountryKeyword_11());
            		
            // InternalResume.g:382:3: ( (lv_country_12_0= RULE_STRING ) )
            // InternalResume.g:383:4: (lv_country_12_0= RULE_STRING )
            {
            // InternalResume.g:383:4: (lv_country_12_0= RULE_STRING )
            // InternalResume.g:384:5: lv_country_12_0= RULE_STRING
            {
            lv_country_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_country_12_0, grammarAccess.getUserdataAccess().getCountrySTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserdata"


    // $ANTLR start "entryRuleSection"
    // InternalResume.g:404:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalResume.g:404:48: (iv_ruleSection= ruleSection EOF )
            // InternalResume.g:405:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalResume.g:411:1: ruleSection returns [EObject current=null] : (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_Experience_0 = null;

        EObject this_Projects_1 = null;

        EObject this_Education_2 = null;

        EObject this_Skills_3 = null;

        EObject this_Interests_4 = null;

        EObject this_Languages_5 = null;

        EObject this_Metrics_6 = null;



        	enterRule();

        try {
            // InternalResume.g:417:2: ( (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics ) )
            // InternalResume.g:418:2: (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics )
            {
            // InternalResume.g:418:2: (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 39:
                {
                alt2=5;
                }
                break;
            case 40:
                {
                alt2=6;
                }
                break;
            case 41:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalResume.g:419:3: this_Experience_0= ruleExperience
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getExperienceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Experience_0=ruleExperience();

                    state._fsp--;


                    			current = this_Experience_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalResume.g:428:3: this_Projects_1= ruleProjects
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getProjectsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Projects_1=ruleProjects();

                    state._fsp--;


                    			current = this_Projects_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalResume.g:437:3: this_Education_2= ruleEducation
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getEducationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Education_2=ruleEducation();

                    state._fsp--;


                    			current = this_Education_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalResume.g:446:3: this_Skills_3= ruleSkills
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getSkillsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Skills_3=ruleSkills();

                    state._fsp--;


                    			current = this_Skills_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalResume.g:455:3: this_Interests_4= ruleInterests
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getInterestsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interests_4=ruleInterests();

                    state._fsp--;


                    			current = this_Interests_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalResume.g:464:3: this_Languages_5= ruleLanguages
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getLanguagesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Languages_5=ruleLanguages();

                    state._fsp--;


                    			current = this_Languages_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalResume.g:473:3: this_Metrics_6= ruleMetrics
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getMetricsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Metrics_6=ruleMetrics();

                    state._fsp--;


                    			current = this_Metrics_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleExperience"
    // InternalResume.g:485:1: entryRuleExperience returns [EObject current=null] : iv_ruleExperience= ruleExperience EOF ;
    public final EObject entryRuleExperience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperience = null;


        try {
            // InternalResume.g:485:51: (iv_ruleExperience= ruleExperience EOF )
            // InternalResume.g:486:2: iv_ruleExperience= ruleExperience EOF
            {
             newCompositeNode(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperience=ruleExperience();

            state._fsp--;

             current =iv_ruleExperience; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalResume.g:492:1: ruleExperience returns [EObject current=null] : (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ ) ;
    public final EObject ruleExperience() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_jobs_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:498:2: ( (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ ) )
            // InternalResume.g:499:2: (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ )
            {
            // InternalResume.g:499:2: (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ )
            // InternalResume.g:500:3: otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getExperienceAccess().getExperienceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExperienceAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:508:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:509:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:509:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:510:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_language_2_0, grammarAccess.getExperienceAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:526:3: ( (lv_jobs_3_0= ruleJob ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalResume.g:527:4: (lv_jobs_3_0= ruleJob )
            	    {
            	    // InternalResume.g:527:4: (lv_jobs_3_0= ruleJob )
            	    // InternalResume.g:528:5: lv_jobs_3_0= ruleJob
            	    {

            	    					newCompositeNode(grammarAccess.getExperienceAccess().getJobsJobParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_jobs_3_0=ruleJob();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExperienceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jobs",
            	    						lv_jobs_3_0,
            	    						"org.xtext.example.resume.Resume.Job");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleJob"
    // InternalResume.g:549:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalResume.g:549:44: (iv_ruleJob= ruleJob EOF )
            // InternalResume.g:550:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalResume.g:556:1: ruleJob returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_company_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_startDate_7_0 = null;

        AntlrDatatypeRuleToken lv_endDate_9_0 = null;

        EObject lv_tags_11_0 = null;



        	enterRule();

        try {
            // InternalResume.g:562:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) ) )
            // InternalResume.g:563:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) )
            {
            // InternalResume.g:563:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) )
            // InternalResume.g:564:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJobAccess().getTitleKeyword_0());
            		
            // InternalResume.g:568:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:569:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:569:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:570:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_title_1_0, grammarAccess.getJobAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getJobAccess().getDescriptionKeyword_2());
            		
            // InternalResume.g:590:3: ( (lv_description_3_0= ruleStringList ) )
            // InternalResume.g:591:4: (lv_description_3_0= ruleStringList )
            {
            // InternalResume.g:591:4: (lv_description_3_0= ruleStringList )
            // InternalResume.g:592:5: lv_description_3_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getJobAccess().getDescriptionStringListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_description_3_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getJobAccess().getCompanyKeyword_4());
            		
            // InternalResume.g:613:3: ( (lv_company_5_0= RULE_STRING ) )
            // InternalResume.g:614:4: (lv_company_5_0= RULE_STRING )
            {
            // InternalResume.g:614:4: (lv_company_5_0= RULE_STRING )
            // InternalResume.g:615:5: lv_company_5_0= RULE_STRING
            {
            lv_company_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_company_5_0, grammarAccess.getJobAccess().getCompanySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"company",
            						lv_company_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getJobAccess().getStartDateKeyword_6());
            		
            // InternalResume.g:635:3: ( (lv_startDate_7_0= ruleDate ) )
            // InternalResume.g:636:4: (lv_startDate_7_0= ruleDate )
            {
            // InternalResume.g:636:4: (lv_startDate_7_0= ruleDate )
            // InternalResume.g:637:5: lv_startDate_7_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getJobAccess().getStartDateDateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_startDate_7_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"startDate",
            						lv_startDate_7_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getJobAccess().getEndDateKeyword_8());
            		
            // InternalResume.g:658:3: ( (lv_endDate_9_0= ruleDate ) )
            // InternalResume.g:659:4: (lv_endDate_9_0= ruleDate )
            {
            // InternalResume.g:659:4: (lv_endDate_9_0= ruleDate )
            // InternalResume.g:660:5: lv_endDate_9_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getJobAccess().getEndDateDateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_24);
            lv_endDate_9_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_9_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getJobAccess().getTagsKeyword_10());
            		
            // InternalResume.g:681:3: ( (lv_tags_11_0= ruleStringList ) )
            // InternalResume.g:682:4: (lv_tags_11_0= ruleStringList )
            {
            // InternalResume.g:682:4: (lv_tags_11_0= ruleStringList )
            // InternalResume.g:683:5: lv_tags_11_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getJobAccess().getTagsStringListParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_11_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_11_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleProjects"
    // InternalResume.g:704:1: entryRuleProjects returns [EObject current=null] : iv_ruleProjects= ruleProjects EOF ;
    public final EObject entryRuleProjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjects = null;


        try {
            // InternalResume.g:704:49: (iv_ruleProjects= ruleProjects EOF )
            // InternalResume.g:705:2: iv_ruleProjects= ruleProjects EOF
            {
             newCompositeNode(grammarAccess.getProjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjects=ruleProjects();

            state._fsp--;

             current =iv_ruleProjects; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjects"


    // $ANTLR start "ruleProjects"
    // InternalResume.g:711:1: ruleProjects returns [EObject current=null] : (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ ) ;
    public final EObject ruleProjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_projects_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:717:2: ( (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ ) )
            // InternalResume.g:718:2: (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ )
            {
            // InternalResume.g:718:2: (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ )
            // InternalResume.g:719:3: otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectsAccess().getProjectsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:727:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:728:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:728:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:729:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_language_2_0, grammarAccess.getProjectsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:745:3: ( (lv_projects_3_0= ruleProject ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalResume.g:746:4: (lv_projects_3_0= ruleProject )
            	    {
            	    // InternalResume.g:746:4: (lv_projects_3_0= ruleProject )
            	    // InternalResume.g:747:5: lv_projects_3_0= ruleProject
            	    {

            	    					newCompositeNode(grammarAccess.getProjectsAccess().getProjectsProjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_projects_3_0=ruleProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"projects",
            	    						lv_projects_3_0,
            	    						"org.xtext.example.resume.Resume.Project");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjects"


    // $ANTLR start "entryRuleProject"
    // InternalResume.g:768:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalResume.g:768:48: (iv_ruleProject= ruleProject EOF )
            // InternalResume.g:769:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalResume.g:775:1: ruleProject returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_link_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_description_3_0 = null;

        EObject lv_technologies_5_0 = null;

        EObject lv_tags_9_0 = null;



        	enterRule();

        try {
            // InternalResume.g:781:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) )
            // InternalResume.g:782:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            {
            // InternalResume.g:782:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            // InternalResume.g:783:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getTitleKeyword_0());
            		
            // InternalResume.g:787:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:788:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:788:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:789:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_title_1_0, grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getDescriptionKeyword_2());
            		
            // InternalResume.g:809:3: ( (lv_description_3_0= ruleStringList ) )
            // InternalResume.g:810:4: (lv_description_3_0= ruleStringList )
            {
            // InternalResume.g:810:4: (lv_description_3_0= ruleStringList )
            // InternalResume.g:811:5: lv_description_3_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getDescriptionStringListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_description_3_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getTechnologiesKeyword_4());
            		
            // InternalResume.g:832:3: ( (lv_technologies_5_0= ruleStringList ) )
            // InternalResume.g:833:4: (lv_technologies_5_0= ruleStringList )
            {
            // InternalResume.g:833:4: (lv_technologies_5_0= ruleStringList )
            // InternalResume.g:834:5: lv_technologies_5_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTechnologiesStringListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_technologies_5_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"technologies",
            						lv_technologies_5_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLinkKeyword_6());
            		
            // InternalResume.g:855:3: ( (lv_link_7_0= RULE_STRING ) )
            // InternalResume.g:856:4: (lv_link_7_0= RULE_STRING )
            {
            // InternalResume.g:856:4: (lv_link_7_0= RULE_STRING )
            // InternalResume.g:857:5: lv_link_7_0= RULE_STRING
            {
            lv_link_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_link_7_0, grammarAccess.getProjectAccess().getLinkSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"link",
            						lv_link_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getTagsKeyword_8());
            		
            // InternalResume.g:877:3: ( (lv_tags_9_0= ruleStringList ) )
            // InternalResume.g:878:4: (lv_tags_9_0= ruleStringList )
            {
            // InternalResume.g:878:4: (lv_tags_9_0= ruleStringList )
            // InternalResume.g:879:5: lv_tags_9_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTagsStringListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_27);
            lv_tags_9_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_9_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:896:3: (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalResume.g:897:4: otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getFromKeyword_10_0());
                    			
                    // InternalResume.g:901:4: ( (otherlv_11= RULE_ID ) )
                    // InternalResume.g:902:5: (otherlv_11= RULE_ID )
                    {
                    // InternalResume.g:902:5: (otherlv_11= RULE_ID )
                    // InternalResume.g:903:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getFromSkillCrossReference_10_1_0());
                    					

                    }


                    }

                    // InternalResume.g:914:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalResume.g:915:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,34,FOLLOW_28); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalResume.g:919:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalResume.g:920:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalResume.g:920:6: (otherlv_13= RULE_ID )
                    	    // InternalResume.g:921:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProjectRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getProjectAccess().getFromSkillCrossReference_10_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEducation"
    // InternalResume.g:938:1: entryRuleEducation returns [EObject current=null] : iv_ruleEducation= ruleEducation EOF ;
    public final EObject entryRuleEducation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducation = null;


        try {
            // InternalResume.g:938:50: (iv_ruleEducation= ruleEducation EOF )
            // InternalResume.g:939:2: iv_ruleEducation= ruleEducation EOF
            {
             newCompositeNode(grammarAccess.getEducationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEducation=ruleEducation();

            state._fsp--;

             current =iv_ruleEducation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEducation"


    // $ANTLR start "ruleEducation"
    // InternalResume.g:945:1: ruleEducation returns [EObject current=null] : (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* ) ;
    public final EObject ruleEducation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_degrees_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:951:2: ( (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* ) )
            // InternalResume.g:952:2: (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* )
            {
            // InternalResume.g:952:2: (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* )
            // InternalResume.g:953:3: otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEducationAccess().getEducationKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEducationAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:961:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:962:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:962:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:963:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_language_2_0, grammarAccess.getEducationAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEducationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:979:3: ( (lv_degrees_3_0= ruleDegree ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalResume.g:980:4: (lv_degrees_3_0= ruleDegree )
            	    {
            	    // InternalResume.g:980:4: (lv_degrees_3_0= ruleDegree )
            	    // InternalResume.g:981:5: lv_degrees_3_0= ruleDegree
            	    {

            	    					newCompositeNode(grammarAccess.getEducationAccess().getDegreesDegreeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_degrees_3_0=ruleDegree();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEducationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"degrees",
            	    						lv_degrees_3_0,
            	    						"org.xtext.example.resume.Resume.Degree");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEducation"


    // $ANTLR start "entryRuleDegree"
    // InternalResume.g:1002:1: entryRuleDegree returns [EObject current=null] : iv_ruleDegree= ruleDegree EOF ;
    public final EObject entryRuleDegree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDegree = null;


        try {
            // InternalResume.g:1002:47: (iv_ruleDegree= ruleDegree EOF )
            // InternalResume.g:1003:2: iv_ruleDegree= ruleDegree EOF
            {
             newCompositeNode(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDegree=ruleDegree();

            state._fsp--;

             current =iv_ruleDegree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalResume.g:1009:1: ruleDegree returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) ;
    public final EObject ruleDegree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_institution_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_country_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_graduationDate_5_0 = null;

        EObject lv_tags_9_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1015:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) )
            // InternalResume.g:1016:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            {
            // InternalResume.g:1016:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            // InternalResume.g:1017:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDegreeAccess().getTitleKeyword_0());
            		
            // InternalResume.g:1021:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:1022:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:1022:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:1023:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_title_1_0, grammarAccess.getDegreeAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDegreeAccess().getInstitutionKeyword_2());
            		
            // InternalResume.g:1043:3: ( (lv_institution_3_0= RULE_STRING ) )
            // InternalResume.g:1044:4: (lv_institution_3_0= RULE_STRING )
            {
            // InternalResume.g:1044:4: (lv_institution_3_0= RULE_STRING )
            // InternalResume.g:1045:5: lv_institution_3_0= RULE_STRING
            {
            lv_institution_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_institution_3_0, grammarAccess.getDegreeAccess().getInstitutionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"institution",
            						lv_institution_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDegreeAccess().getGraduationDateKeyword_4());
            		
            // InternalResume.g:1065:3: ( (lv_graduationDate_5_0= ruleDate ) )
            // InternalResume.g:1066:4: (lv_graduationDate_5_0= ruleDate )
            {
            // InternalResume.g:1066:4: (lv_graduationDate_5_0= ruleDate )
            // InternalResume.g:1067:5: lv_graduationDate_5_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getDegreeAccess().getGraduationDateDateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_graduationDate_5_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDegreeRule());
            					}
            					set(
            						current,
            						"graduationDate",
            						lv_graduationDate_5_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDegreeAccess().getCountryKeyword_6());
            		
            // InternalResume.g:1088:3: ( (lv_country_7_0= RULE_STRING ) )
            // InternalResume.g:1089:4: (lv_country_7_0= RULE_STRING )
            {
            // InternalResume.g:1089:4: (lv_country_7_0= RULE_STRING )
            // InternalResume.g:1090:5: lv_country_7_0= RULE_STRING
            {
            lv_country_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_country_7_0, grammarAccess.getDegreeAccess().getCountrySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getDegreeAccess().getTagsKeyword_8());
            		
            // InternalResume.g:1110:3: ( (lv_tags_9_0= ruleStringList ) )
            // InternalResume.g:1111:4: (lv_tags_9_0= ruleStringList )
            {
            // InternalResume.g:1111:4: (lv_tags_9_0= ruleStringList )
            // InternalResume.g:1112:5: lv_tags_9_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getDegreeAccess().getTagsStringListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_9_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDegreeRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_9_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleSkills"
    // InternalResume.g:1133:1: entryRuleSkills returns [EObject current=null] : iv_ruleSkills= ruleSkills EOF ;
    public final EObject entryRuleSkills() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkills = null;


        try {
            // InternalResume.g:1133:47: (iv_ruleSkills= ruleSkills EOF )
            // InternalResume.g:1134:2: iv_ruleSkills= ruleSkills EOF
            {
             newCompositeNode(grammarAccess.getSkillsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkills=ruleSkills();

            state._fsp--;

             current =iv_ruleSkills; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkills"


    // $ANTLR start "ruleSkills"
    // InternalResume.g:1140:1: ruleSkills returns [EObject current=null] : (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ ) ;
    public final EObject ruleSkills() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_skills_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1146:2: ( (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ ) )
            // InternalResume.g:1147:2: (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ )
            {
            // InternalResume.g:1147:2: (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ )
            // InternalResume.g:1148:3: otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillsAccess().getSkillsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1156:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1157:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1157:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1158:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_language_2_0, grammarAccess.getSkillsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1174:3: ( (lv_skills_3_0= ruleSkill ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalResume.g:1175:4: (lv_skills_3_0= ruleSkill )
            	    {
            	    // InternalResume.g:1175:4: (lv_skills_3_0= ruleSkill )
            	    // InternalResume.g:1176:5: lv_skills_3_0= ruleSkill
            	    {

            	    					newCompositeNode(grammarAccess.getSkillsAccess().getSkillsSkillParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_skills_3_0=ruleSkill();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skills",
            	    						lv_skills_3_0,
            	    						"org.xtext.example.resume.Resume.Skill");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkills"


    // $ANTLR start "entryRuleSkill"
    // InternalResume.g:1197:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // InternalResume.g:1197:46: (iv_ruleSkill= ruleSkill EOF )
            // InternalResume.g:1198:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkill"


    // $ANTLR start "ruleSkill"
    // InternalResume.g:1204:1: ruleSkill returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1210:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1211:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1211:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1212:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            // InternalResume.g:1212:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalResume.g:1213:4: (lv_name_0_0= RULE_ID )
            {
            // InternalResume.g:1213:4: (lv_name_0_0= RULE_ID )
            // InternalResume.g:1214:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getTitleKeyword_1());
            		
            // InternalResume.g:1234:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalResume.g:1235:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalResume.g:1235:4: (lv_title_2_0= RULE_STRING )
            // InternalResume.g:1236:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_title_2_0, grammarAccess.getSkillAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSkillAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1256:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1257:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1257:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1258:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getSkillAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleInterests"
    // InternalResume.g:1279:1: entryRuleInterests returns [EObject current=null] : iv_ruleInterests= ruleInterests EOF ;
    public final EObject entryRuleInterests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterests = null;


        try {
            // InternalResume.g:1279:50: (iv_ruleInterests= ruleInterests EOF )
            // InternalResume.g:1280:2: iv_ruleInterests= ruleInterests EOF
            {
             newCompositeNode(grammarAccess.getInterestsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterests=ruleInterests();

            state._fsp--;

             current =iv_ruleInterests; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterests"


    // $ANTLR start "ruleInterests"
    // InternalResume.g:1286:1: ruleInterests returns [EObject current=null] : (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleInterests() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1292:2: ( (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1293:2: (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1293:2: (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1294:3: otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInterestsAccess().getInterestsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getInterestsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1302:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1303:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1303:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1304:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_language_2_0, grammarAccess.getInterestsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterestsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getInterestsAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1324:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1325:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1325:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1326:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getInterestsAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterestsRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterests"


    // $ANTLR start "entryRuleLanguages"
    // InternalResume.g:1347:1: entryRuleLanguages returns [EObject current=null] : iv_ruleLanguages= ruleLanguages EOF ;
    public final EObject entryRuleLanguages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguages = null;


        try {
            // InternalResume.g:1347:50: (iv_ruleLanguages= ruleLanguages EOF )
            // InternalResume.g:1348:2: iv_ruleLanguages= ruleLanguages EOF
            {
             newCompositeNode(grammarAccess.getLanguagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguages=ruleLanguages();

            state._fsp--;

             current =iv_ruleLanguages; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguages"


    // $ANTLR start "ruleLanguages"
    // InternalResume.g:1354:1: ruleLanguages returns [EObject current=null] : (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleLanguages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1360:2: ( (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1361:2: (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1361:2: (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1362:3: otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguagesAccess().getLanguagesKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguagesAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1370:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1371:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1371:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1372:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_language_2_0, grammarAccess.getLanguagesAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguagesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLanguagesAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1392:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1393:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1393:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1394:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getLanguagesAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguagesRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguages"


    // $ANTLR start "entryRuleMetrics"
    // InternalResume.g:1415:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // InternalResume.g:1415:48: (iv_ruleMetrics= ruleMetrics EOF )
            // InternalResume.g:1416:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetrics"


    // $ANTLR start "ruleMetrics"
    // InternalResume.g:1422:1: ruleMetrics returns [EObject current=null] : (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ ) ;
    public final EObject ruleMetrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_metrics_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1428:2: ( (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ ) )
            // InternalResume.g:1429:2: (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ )
            {
            // InternalResume.g:1429:2: (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ )
            // InternalResume.g:1430:3: otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getMetricsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMetricsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1438:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1439:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1439:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1440:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_language_2_0, grammarAccess.getMetricsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1456:3: ( (lv_metrics_3_0= ruleMetric ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalResume.g:1457:4: (lv_metrics_3_0= ruleMetric )
            	    {
            	    // InternalResume.g:1457:4: (lv_metrics_3_0= ruleMetric )
            	    // InternalResume.g:1458:5: lv_metrics_3_0= ruleMetric
            	    {

            	    					newCompositeNode(grammarAccess.getMetricsAccess().getMetricsMetricParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_metrics_3_0=ruleMetric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetricsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metrics",
            	    						lv_metrics_3_0,
            	    						"org.xtext.example.resume.Resume.Metric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetrics"


    // $ANTLR start "entryRuleMetric"
    // InternalResume.g:1479:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalResume.g:1479:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalResume.g:1480:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalResume.g:1486:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1492:2: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalResume.g:1493:2: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalResume.g:1493:2: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalResume.g:1494:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getMetricKeyword_0());
            		
            // InternalResume.g:1498:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalResume.g:1499:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalResume.g:1499:4: (lv_name_1_0= RULE_STRING )
            // InternalResume.g:1500:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetricAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getEqualsSignKeyword_2());
            		
            // InternalResume.g:1520:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalResume.g:1521:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalResume.g:1521:4: (lv_expression_3_0= ruleExpression )
            // InternalResume.g:1522:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.example.resume.Resume.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleExpression"
    // InternalResume.g:1543:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalResume.g:1543:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalResume.g:1544:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalResume.g:1550:1: ruleExpression returns [EObject current=null] : this_Subtraction_0= ruleSubtraction ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Subtraction_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1556:2: (this_Subtraction_0= ruleSubtraction )
            // InternalResume.g:1557:2: this_Subtraction_0= ruleSubtraction
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getSubtractionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Subtraction_0=ruleSubtraction();

            state._fsp--;


            		current = this_Subtraction_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSubtraction"
    // InternalResume.g:1568:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // InternalResume.g:1568:52: (iv_ruleSubtraction= ruleSubtraction EOF )
            // InternalResume.g:1569:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalResume.g:1575:1: ruleSubtraction returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NumberLiteral_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1581:2: ( (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* ) )
            // InternalResume.g:1582:2: (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* )
            {
            // InternalResume.g:1582:2: (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* )
            // InternalResume.g:1583:3: this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubtractionAccess().getNumberLiteralParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_NumberLiteral_0=ruleNumberLiteral();

            state._fsp--;


            			current = this_NumberLiteral_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalResume.g:1591:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalResume.g:1592:4: () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) )
            	    {
            	    // InternalResume.g:1592:4: ()
            	    // InternalResume.g:1593:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalResume.g:1603:4: ( (lv_right_3_0= ruleNumberLiteral ) )
            	    // InternalResume.g:1604:5: (lv_right_3_0= ruleNumberLiteral )
            	    {
            	    // InternalResume.g:1604:5: (lv_right_3_0= ruleNumberLiteral )
            	    // InternalResume.g:1605:6: lv_right_3_0= ruleNumberLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getSubtractionAccess().getRightNumberLiteralParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleNumberLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubtractionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.resume.Resume.NumberLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalResume.g:1627:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalResume.g:1627:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalResume.g:1628:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalResume.g:1634:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalResume.g:1640:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalResume.g:1641:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalResume.g:1641:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalResume.g:1642:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalResume.g:1642:3: ()
            // InternalResume.g:1643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
            					current);
            			

            }

            // InternalResume.g:1649:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalResume.g:1650:4: (lv_value_1_0= RULE_INT )
            {
            // InternalResume.g:1650:4: (lv_value_1_0= RULE_INT )
            // InternalResume.g:1651:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleCustomization"
    // InternalResume.g:1671:1: entryRuleCustomization returns [EObject current=null] : iv_ruleCustomization= ruleCustomization EOF ;
    public final EObject entryRuleCustomization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomization = null;


        try {
            // InternalResume.g:1671:54: (iv_ruleCustomization= ruleCustomization EOF )
            // InternalResume.g:1672:2: iv_ruleCustomization= ruleCustomization EOF
            {
             newCompositeNode(grammarAccess.getCustomizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomization=ruleCustomization();

            state._fsp--;

             current =iv_ruleCustomization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomization"


    // $ANTLR start "ruleCustomization"
    // InternalResume.g:1678:1: ruleCustomization returns [EObject current=null] : (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* ) ;
    public final EObject ruleCustomization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_language_5_0=null;
        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1684:2: ( (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* ) )
            // InternalResume.g:1685:2: (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* )
            {
            // InternalResume.g:1685:2: (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* )
            // InternalResume.g:1686:3: otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomizationAccess().getCustomizationKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomizationAccess().getIncludeKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomizationAccess().getProfileKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomizationAccess().getWhereKeyword_3());
            		
            otherlv_4=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomizationAccess().getLanguageKeyword_4());
            		
            // InternalResume.g:1706:3: ( (lv_language_5_0= RULE_STRING ) )
            // InternalResume.g:1707:4: (lv_language_5_0= RULE_STRING )
            {
            // InternalResume.g:1707:4: (lv_language_5_0= RULE_STRING )
            // InternalResume.g:1708:5: lv_language_5_0= RULE_STRING
            {
            lv_language_5_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_language_5_0, grammarAccess.getCustomizationAccess().getLanguageSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1724:3: ( (lv_rules_6_0= ruleRule ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalResume.g:1725:4: (lv_rules_6_0= ruleRule )
            	    {
            	    // InternalResume.g:1725:4: (lv_rules_6_0= ruleRule )
            	    // InternalResume.g:1726:5: lv_rules_6_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getCustomizationAccess().getRulesRuleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomizationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_6_0,
            	    						"org.xtext.example.resume.Resume.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomization"


    // $ANTLR start "entryRuleRule"
    // InternalResume.g:1747:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalResume.g:1747:45: (iv_ruleRule= ruleRule EOF )
            // InternalResume.g:1748:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalResume.g:1754:1: ruleRule returns [EObject current=null] : (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_sectionType_1_0 = null;

        EObject lv_filter_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1760:2: ( (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) ) )
            // InternalResume.g:1761:2: (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) )
            {
            // InternalResume.g:1761:2: (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) )
            // InternalResume.g:1762:3: otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIncludeKeyword_0());
            		
            // InternalResume.g:1766:3: ( (lv_sectionType_1_0= ruleSectionType ) )
            // InternalResume.g:1767:4: (lv_sectionType_1_0= ruleSectionType )
            {
            // InternalResume.g:1767:4: (lv_sectionType_1_0= ruleSectionType )
            // InternalResume.g:1768:5: lv_sectionType_1_0= ruleSectionType
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSectionTypeSectionTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_sectionType_1_0=ruleSectionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"sectionType",
            						lv_sectionType_1_0,
            						"org.xtext.example.resume.Resume.SectionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getWhereKeyword_2());
            		
            // InternalResume.g:1789:3: ( (lv_filter_3_0= ruleFilter ) )
            // InternalResume.g:1790:4: (lv_filter_3_0= ruleFilter )
            {
            // InternalResume.g:1790:4: (lv_filter_3_0= ruleFilter )
            // InternalResume.g:1791:5: lv_filter_3_0= ruleFilter
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_filter_3_0=ruleFilter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"filter",
            						lv_filter_3_0,
            						"org.xtext.example.resume.Resume.Filter");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFilter"
    // InternalResume.g:1812:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalResume.g:1812:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalResume.g:1813:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalResume.g:1819:1: ruleFilter returns [EObject current=null] : (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter | this_AllFilter_2= ruleAllFilter ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralFilter_0 = null;

        EObject this_TemporalFilter_1 = null;

        EObject this_AllFilter_2 = null;



        	enterRule();

        try {
            // InternalResume.g:1825:2: ( (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter | this_AllFilter_2= ruleAllFilter ) )
            // InternalResume.g:1826:2: (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter | this_AllFilter_2= ruleAllFilter )
            {
            // InternalResume.g:1826:2: (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter | this_AllFilter_2= ruleAllFilter )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt12=1;
                }
                break;
            case 51:
            case 53:
                {
                alt12=2;
                }
                break;
            case 55:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalResume.g:1827:3: this_GeneralFilter_0= ruleGeneralFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getGeneralFilterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralFilter_0=ruleGeneralFilter();

                    state._fsp--;


                    			current = this_GeneralFilter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalResume.g:1836:3: this_TemporalFilter_1= ruleTemporalFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getTemporalFilterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalFilter_1=ruleTemporalFilter();

                    state._fsp--;


                    			current = this_TemporalFilter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalResume.g:1845:3: this_AllFilter_2= ruleAllFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getAllFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllFilter_2=ruleAllFilter();

                    state._fsp--;


                    			current = this_AllFilter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleGeneralFilter"
    // InternalResume.g:1857:1: entryRuleGeneralFilter returns [EObject current=null] : iv_ruleGeneralFilter= ruleGeneralFilter EOF ;
    public final EObject entryRuleGeneralFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralFilter = null;


        try {
            // InternalResume.g:1857:54: (iv_ruleGeneralFilter= ruleGeneralFilter EOF )
            // InternalResume.g:1858:2: iv_ruleGeneralFilter= ruleGeneralFilter EOF
            {
             newCompositeNode(grammarAccess.getGeneralFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralFilter=ruleGeneralFilter();

            state._fsp--;

             current =iv_ruleGeneralFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralFilter"


    // $ANTLR start "ruleGeneralFilter"
    // InternalResume.g:1864:1: ruleGeneralFilter returns [EObject current=null] : (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeneralFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tag_2_0=null;


        	enterRule();

        try {
            // InternalResume.g:1870:2: ( (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) ) )
            // InternalResume.g:1871:2: (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) )
            {
            // InternalResume.g:1871:2: (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) )
            // InternalResume.g:1872:3: otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralFilterAccess().getTagsKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralFilterAccess().getIncludeKeyword_1());
            		
            // InternalResume.g:1880:3: ( (lv_tag_2_0= RULE_STRING ) )
            // InternalResume.g:1881:4: (lv_tag_2_0= RULE_STRING )
            {
            // InternalResume.g:1881:4: (lv_tag_2_0= RULE_STRING )
            // InternalResume.g:1882:5: lv_tag_2_0= RULE_STRING
            {
            lv_tag_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_tag_2_0, grammarAccess.getGeneralFilterAccess().getTagSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tag",
            						lv_tag_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralFilter"


    // $ANTLR start "entryRuleTemporalFilter"
    // InternalResume.g:1902:1: entryRuleTemporalFilter returns [EObject current=null] : iv_ruleTemporalFilter= ruleTemporalFilter EOF ;
    public final EObject entryRuleTemporalFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalFilter = null;


        try {
            // InternalResume.g:1902:55: (iv_ruleTemporalFilter= ruleTemporalFilter EOF )
            // InternalResume.g:1903:2: iv_ruleTemporalFilter= ruleTemporalFilter EOF
            {
             newCompositeNode(grammarAccess.getTemporalFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalFilter=ruleTemporalFilter();

            state._fsp--;

             current =iv_ruleTemporalFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalFilter"


    // $ANTLR start "ruleTemporalFilter"
    // InternalResume.g:1909:1: ruleTemporalFilter returns [EObject current=null] : ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) ) ;
    public final EObject ruleTemporalFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_startDate_2_0 = null;

        AntlrDatatypeRuleToken lv_endDate_5_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1915:2: ( ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) ) )
            // InternalResume.g:1916:2: ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) )
            {
            // InternalResume.g:1916:2: ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            else if ( (LA13_0==53) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalResume.g:1917:3: (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) )
                    {
                    // InternalResume.g:1917:3: (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) )
                    // InternalResume.g:1918:4: otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) )
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_44); 

                    				newLeafNode(otherlv_0, grammarAccess.getTemporalFilterAccess().getStartDateKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,52,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getTemporalFilterAccess().getAfterKeyword_0_1());
                    			
                    // InternalResume.g:1926:4: ( (lv_startDate_2_0= ruleDate ) )
                    // InternalResume.g:1927:5: (lv_startDate_2_0= ruleDate )
                    {
                    // InternalResume.g:1927:5: (lv_startDate_2_0= ruleDate )
                    // InternalResume.g:1928:6: lv_startDate_2_0= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getTemporalFilterAccess().getStartDateDateParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_startDate_2_0=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalFilterRule());
                    						}
                    						set(
                    							current,
                    							"startDate",
                    							lv_startDate_2_0,
                    							"org.xtext.example.resume.Resume.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalResume.g:1947:3: (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) )
                    {
                    // InternalResume.g:1947:3: (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) )
                    // InternalResume.g:1948:4: otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_45); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalFilterAccess().getEndDateKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalFilterAccess().getBeforeKeyword_1_1());
                    			
                    // InternalResume.g:1956:4: ( (lv_endDate_5_0= ruleDate ) )
                    // InternalResume.g:1957:5: (lv_endDate_5_0= ruleDate )
                    {
                    // InternalResume.g:1957:5: (lv_endDate_5_0= ruleDate )
                    // InternalResume.g:1958:6: lv_endDate_5_0= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getTemporalFilterAccess().getEndDateDateParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_endDate_5_0=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalFilterRule());
                    						}
                    						set(
                    							current,
                    							"endDate",
                    							lv_endDate_5_0,
                    							"org.xtext.example.resume.Resume.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalFilter"


    // $ANTLR start "entryRuleAllFilter"
    // InternalResume.g:1980:1: entryRuleAllFilter returns [EObject current=null] : iv_ruleAllFilter= ruleAllFilter EOF ;
    public final EObject entryRuleAllFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllFilter = null;


        try {
            // InternalResume.g:1980:50: (iv_ruleAllFilter= ruleAllFilter EOF )
            // InternalResume.g:1981:2: iv_ruleAllFilter= ruleAllFilter EOF
            {
             newCompositeNode(grammarAccess.getAllFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllFilter=ruleAllFilter();

            state._fsp--;

             current =iv_ruleAllFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllFilter"


    // $ANTLR start "ruleAllFilter"
    // InternalResume.g:1987:1: ruleAllFilter returns [EObject current=null] : ( () otherlv_1= 'all' ) ;
    public final EObject ruleAllFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalResume.g:1993:2: ( ( () otherlv_1= 'all' ) )
            // InternalResume.g:1994:2: ( () otherlv_1= 'all' )
            {
            // InternalResume.g:1994:2: ( () otherlv_1= 'all' )
            // InternalResume.g:1995:3: () otherlv_1= 'all'
            {
            // InternalResume.g:1995:3: ()
            // InternalResume.g:1996:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllFilterAccess().getAllFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAllFilterAccess().getAllKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllFilter"


    // $ANTLR start "entryRuleStringList"
    // InternalResume.g:2010:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // InternalResume.g:2010:51: (iv_ruleStringList= ruleStringList EOF )
            // InternalResume.g:2011:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalResume.g:2017:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleStringList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalResume.g:2023:2: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalResume.g:2024:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalResume.g:2024:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalResume.g:2025:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalResume.g:2029:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalResume.g:2030:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalResume.g:2030:4: (lv_values_1_0= RULE_STRING )
            // InternalResume.g:2031:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_values_1_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringListRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:2047:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalResume.g:2048:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalResume.g:2052:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalResume.g:2053:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalResume.g:2053:5: (lv_values_3_0= RULE_STRING )
            	    // InternalResume.g:2054:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStringListRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleDate"
    // InternalResume.g:2079:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalResume.g:2079:44: (iv_ruleDate= ruleDate EOF )
            // InternalResume.g:2080:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalResume.g:2086:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalResume.g:2092:2: (this_STRING_0= RULE_STRING )
            // InternalResume.g:2093:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getDateAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleSectionType"
    // InternalResume.g:2103:1: ruleSectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) | (enumLiteral_6= 'Metrics' ) ) ;
    public final Enumerator ruleSectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalResume.g:2109:2: ( ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) | (enumLiteral_6= 'Metrics' ) ) )
            // InternalResume.g:2110:2: ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) | (enumLiteral_6= 'Metrics' ) )
            {
            // InternalResume.g:2110:2: ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) | (enumLiteral_6= 'Metrics' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 38:
                {
                alt15=4;
                }
                break;
            case 39:
                {
                alt15=5;
                }
                break;
            case 40:
                {
                alt15=6;
                }
                break;
            case 41:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalResume.g:2111:3: (enumLiteral_0= 'Experience' )
                    {
                    // InternalResume.g:2111:3: (enumLiteral_0= 'Experience' )
                    // InternalResume.g:2112:4: enumLiteral_0= 'Experience'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getEXPERIENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSectionTypeAccess().getEXPERIENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalResume.g:2119:3: (enumLiteral_1= 'Projects' )
                    {
                    // InternalResume.g:2119:3: (enumLiteral_1= 'Projects' )
                    // InternalResume.g:2120:4: enumLiteral_1= 'Projects'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getPROJECTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSectionTypeAccess().getPROJECTSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalResume.g:2127:3: (enumLiteral_2= 'Education' )
                    {
                    // InternalResume.g:2127:3: (enumLiteral_2= 'Education' )
                    // InternalResume.g:2128:4: enumLiteral_2= 'Education'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getEDUCATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSectionTypeAccess().getEDUCATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalResume.g:2135:3: (enumLiteral_3= 'Skills' )
                    {
                    // InternalResume.g:2135:3: (enumLiteral_3= 'Skills' )
                    // InternalResume.g:2136:4: enumLiteral_3= 'Skills'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getSKILLSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSectionTypeAccess().getSKILLSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalResume.g:2143:3: (enumLiteral_4= 'Interests' )
                    {
                    // InternalResume.g:2143:3: (enumLiteral_4= 'Interests' )
                    // InternalResume.g:2144:4: enumLiteral_4= 'Interests'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getINTERESTSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSectionTypeAccess().getINTERESTSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalResume.g:2151:3: (enumLiteral_5= 'Languages' )
                    {
                    // InternalResume.g:2151:3: (enumLiteral_5= 'Languages' )
                    // InternalResume.g:2152:4: enumLiteral_5= 'Languages'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getLANGUAGESEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSectionTypeAccess().getLANGUAGESEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalResume.g:2159:3: (enumLiteral_6= 'Metrics' )
                    {
                    // InternalResume.g:2159:3: (enumLiteral_6= 'Metrics' )
                    // InternalResume.g:2160:4: enumLiteral_6= 'Metrics'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getMETRICSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSectionTypeAccess().getMETRICSEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000003C840400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000023C840400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00AC000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000400000000L});

}