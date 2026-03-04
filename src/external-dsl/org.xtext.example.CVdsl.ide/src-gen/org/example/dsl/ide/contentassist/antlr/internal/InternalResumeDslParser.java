package org.example.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.dsl.services.ResumeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalResumeDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Experience'", "'Projects'", "'Education'", "'Skills'", "'Interests'", "'Languages'", "'Metadata'", "'style:'", "'font:'", "'imgPath:'", "'Userdata'", "'name:'", "'email:'", "'telephoneNumber:'", "'direction:'", "'city:'", "'country:'", "'language:'", "'title:'", "'description:'", "'company:'", "'startDate:'", "'endDate:'", "'tags:'", "'technologies:'", "'link:'", "'institution:'", "'graduationDate:'", "'Customization'", "'include'", "'Profile'", "'where'", "'language'", "'tags'", "'startDate'", "'after'", "'endDate'", "'before'", "'['", "']'", "','"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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


        public InternalResumeDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalResumeDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalResumeDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalResumeDsl.g"; }


    	private ResumeDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ResumeDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProfile"
    // InternalResumeDsl.g:53:1: entryRuleProfile : ruleProfile EOF ;
    public final void entryRuleProfile() throws RecognitionException {
        try {
            // InternalResumeDsl.g:54:1: ( ruleProfile EOF )
            // InternalResumeDsl.g:55:1: ruleProfile EOF
            {
             before(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            ruleProfile();

            state._fsp--;

             after(grammarAccess.getProfileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalResumeDsl.g:62:1: ruleProfile : ( ( rule__Profile__Group__0 ) ) ;
    public final void ruleProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:66:2: ( ( ( rule__Profile__Group__0 ) ) )
            // InternalResumeDsl.g:67:2: ( ( rule__Profile__Group__0 ) )
            {
            // InternalResumeDsl.g:67:2: ( ( rule__Profile__Group__0 ) )
            // InternalResumeDsl.g:68:3: ( rule__Profile__Group__0 )
            {
             before(grammarAccess.getProfileAccess().getGroup()); 
            // InternalResumeDsl.g:69:3: ( rule__Profile__Group__0 )
            // InternalResumeDsl.g:69:4: rule__Profile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleMetadata"
    // InternalResumeDsl.g:78:1: entryRuleMetadata : ruleMetadata EOF ;
    public final void entryRuleMetadata() throws RecognitionException {
        try {
            // InternalResumeDsl.g:79:1: ( ruleMetadata EOF )
            // InternalResumeDsl.g:80:1: ruleMetadata EOF
            {
             before(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getMetadataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalResumeDsl.g:87:1: ruleMetadata : ( ( rule__Metadata__Group__0 ) ) ;
    public final void ruleMetadata() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:91:2: ( ( ( rule__Metadata__Group__0 ) ) )
            // InternalResumeDsl.g:92:2: ( ( rule__Metadata__Group__0 ) )
            {
            // InternalResumeDsl.g:92:2: ( ( rule__Metadata__Group__0 ) )
            // InternalResumeDsl.g:93:3: ( rule__Metadata__Group__0 )
            {
             before(grammarAccess.getMetadataAccess().getGroup()); 
            // InternalResumeDsl.g:94:3: ( rule__Metadata__Group__0 )
            // InternalResumeDsl.g:94:4: rule__Metadata__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleUserdata"
    // InternalResumeDsl.g:103:1: entryRuleUserdata : ruleUserdata EOF ;
    public final void entryRuleUserdata() throws RecognitionException {
        try {
            // InternalResumeDsl.g:104:1: ( ruleUserdata EOF )
            // InternalResumeDsl.g:105:1: ruleUserdata EOF
            {
             before(grammarAccess.getUserdataRule()); 
            pushFollow(FOLLOW_1);
            ruleUserdata();

            state._fsp--;

             after(grammarAccess.getUserdataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserdata"


    // $ANTLR start "ruleUserdata"
    // InternalResumeDsl.g:112:1: ruleUserdata : ( ( rule__Userdata__Group__0 ) ) ;
    public final void ruleUserdata() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:116:2: ( ( ( rule__Userdata__Group__0 ) ) )
            // InternalResumeDsl.g:117:2: ( ( rule__Userdata__Group__0 ) )
            {
            // InternalResumeDsl.g:117:2: ( ( rule__Userdata__Group__0 ) )
            // InternalResumeDsl.g:118:3: ( rule__Userdata__Group__0 )
            {
             before(grammarAccess.getUserdataAccess().getGroup()); 
            // InternalResumeDsl.g:119:3: ( rule__Userdata__Group__0 )
            // InternalResumeDsl.g:119:4: rule__Userdata__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserdata"


    // $ANTLR start "entryRuleSection"
    // InternalResumeDsl.g:128:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalResumeDsl.g:129:1: ( ruleSection EOF )
            // InternalResumeDsl.g:130:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalResumeDsl.g:137:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:141:2: ( ( ( rule__Section__Alternatives ) ) )
            // InternalResumeDsl.g:142:2: ( ( rule__Section__Alternatives ) )
            {
            // InternalResumeDsl.g:142:2: ( ( rule__Section__Alternatives ) )
            // InternalResumeDsl.g:143:3: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // InternalResumeDsl.g:144:3: ( rule__Section__Alternatives )
            // InternalResumeDsl.g:144:4: rule__Section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleExperience"
    // InternalResumeDsl.g:153:1: entryRuleExperience : ruleExperience EOF ;
    public final void entryRuleExperience() throws RecognitionException {
        try {
            // InternalResumeDsl.g:154:1: ( ruleExperience EOF )
            // InternalResumeDsl.g:155:1: ruleExperience EOF
            {
             before(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            ruleExperience();

            state._fsp--;

             after(grammarAccess.getExperienceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalResumeDsl.g:162:1: ruleExperience : ( ( rule__Experience__Group__0 ) ) ;
    public final void ruleExperience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:166:2: ( ( ( rule__Experience__Group__0 ) ) )
            // InternalResumeDsl.g:167:2: ( ( rule__Experience__Group__0 ) )
            {
            // InternalResumeDsl.g:167:2: ( ( rule__Experience__Group__0 ) )
            // InternalResumeDsl.g:168:3: ( rule__Experience__Group__0 )
            {
             before(grammarAccess.getExperienceAccess().getGroup()); 
            // InternalResumeDsl.g:169:3: ( rule__Experience__Group__0 )
            // InternalResumeDsl.g:169:4: rule__Experience__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleJob"
    // InternalResumeDsl.g:178:1: entryRuleJob : ruleJob EOF ;
    public final void entryRuleJob() throws RecognitionException {
        try {
            // InternalResumeDsl.g:179:1: ( ruleJob EOF )
            // InternalResumeDsl.g:180:1: ruleJob EOF
            {
             before(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            ruleJob();

            state._fsp--;

             after(grammarAccess.getJobRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalResumeDsl.g:187:1: ruleJob : ( ( rule__Job__Group__0 ) ) ;
    public final void ruleJob() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:191:2: ( ( ( rule__Job__Group__0 ) ) )
            // InternalResumeDsl.g:192:2: ( ( rule__Job__Group__0 ) )
            {
            // InternalResumeDsl.g:192:2: ( ( rule__Job__Group__0 ) )
            // InternalResumeDsl.g:193:3: ( rule__Job__Group__0 )
            {
             before(grammarAccess.getJobAccess().getGroup()); 
            // InternalResumeDsl.g:194:3: ( rule__Job__Group__0 )
            // InternalResumeDsl.g:194:4: rule__Job__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Job__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleProjects"
    // InternalResumeDsl.g:203:1: entryRuleProjects : ruleProjects EOF ;
    public final void entryRuleProjects() throws RecognitionException {
        try {
            // InternalResumeDsl.g:204:1: ( ruleProjects EOF )
            // InternalResumeDsl.g:205:1: ruleProjects EOF
            {
             before(grammarAccess.getProjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleProjects();

            state._fsp--;

             after(grammarAccess.getProjectsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProjects"


    // $ANTLR start "ruleProjects"
    // InternalResumeDsl.g:212:1: ruleProjects : ( ( rule__Projects__Group__0 ) ) ;
    public final void ruleProjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:216:2: ( ( ( rule__Projects__Group__0 ) ) )
            // InternalResumeDsl.g:217:2: ( ( rule__Projects__Group__0 ) )
            {
            // InternalResumeDsl.g:217:2: ( ( rule__Projects__Group__0 ) )
            // InternalResumeDsl.g:218:3: ( rule__Projects__Group__0 )
            {
             before(grammarAccess.getProjectsAccess().getGroup()); 
            // InternalResumeDsl.g:219:3: ( rule__Projects__Group__0 )
            // InternalResumeDsl.g:219:4: rule__Projects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Projects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjects"


    // $ANTLR start "entryRuleProject"
    // InternalResumeDsl.g:228:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalResumeDsl.g:229:1: ( ruleProject EOF )
            // InternalResumeDsl.g:230:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalResumeDsl.g:237:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:241:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalResumeDsl.g:242:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalResumeDsl.g:242:2: ( ( rule__Project__Group__0 ) )
            // InternalResumeDsl.g:243:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalResumeDsl.g:244:3: ( rule__Project__Group__0 )
            // InternalResumeDsl.g:244:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEducation"
    // InternalResumeDsl.g:253:1: entryRuleEducation : ruleEducation EOF ;
    public final void entryRuleEducation() throws RecognitionException {
        try {
            // InternalResumeDsl.g:254:1: ( ruleEducation EOF )
            // InternalResumeDsl.g:255:1: ruleEducation EOF
            {
             before(grammarAccess.getEducationRule()); 
            pushFollow(FOLLOW_1);
            ruleEducation();

            state._fsp--;

             after(grammarAccess.getEducationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEducation"


    // $ANTLR start "ruleEducation"
    // InternalResumeDsl.g:262:1: ruleEducation : ( ( rule__Education__Group__0 ) ) ;
    public final void ruleEducation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:266:2: ( ( ( rule__Education__Group__0 ) ) )
            // InternalResumeDsl.g:267:2: ( ( rule__Education__Group__0 ) )
            {
            // InternalResumeDsl.g:267:2: ( ( rule__Education__Group__0 ) )
            // InternalResumeDsl.g:268:3: ( rule__Education__Group__0 )
            {
             before(grammarAccess.getEducationAccess().getGroup()); 
            // InternalResumeDsl.g:269:3: ( rule__Education__Group__0 )
            // InternalResumeDsl.g:269:4: rule__Education__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Education__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEducationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEducation"


    // $ANTLR start "entryRuleDegree"
    // InternalResumeDsl.g:278:1: entryRuleDegree : ruleDegree EOF ;
    public final void entryRuleDegree() throws RecognitionException {
        try {
            // InternalResumeDsl.g:279:1: ( ruleDegree EOF )
            // InternalResumeDsl.g:280:1: ruleDegree EOF
            {
             before(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            ruleDegree();

            state._fsp--;

             after(grammarAccess.getDegreeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalResumeDsl.g:287:1: ruleDegree : ( ( rule__Degree__Group__0 ) ) ;
    public final void ruleDegree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:291:2: ( ( ( rule__Degree__Group__0 ) ) )
            // InternalResumeDsl.g:292:2: ( ( rule__Degree__Group__0 ) )
            {
            // InternalResumeDsl.g:292:2: ( ( rule__Degree__Group__0 ) )
            // InternalResumeDsl.g:293:3: ( rule__Degree__Group__0 )
            {
             before(grammarAccess.getDegreeAccess().getGroup()); 
            // InternalResumeDsl.g:294:3: ( rule__Degree__Group__0 )
            // InternalResumeDsl.g:294:4: rule__Degree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Degree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleSkills"
    // InternalResumeDsl.g:303:1: entryRuleSkills : ruleSkills EOF ;
    public final void entryRuleSkills() throws RecognitionException {
        try {
            // InternalResumeDsl.g:304:1: ( ruleSkills EOF )
            // InternalResumeDsl.g:305:1: ruleSkills EOF
            {
             before(grammarAccess.getSkillsRule()); 
            pushFollow(FOLLOW_1);
            ruleSkills();

            state._fsp--;

             after(grammarAccess.getSkillsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkills"


    // $ANTLR start "ruleSkills"
    // InternalResumeDsl.g:312:1: ruleSkills : ( ( rule__Skills__Group__0 ) ) ;
    public final void ruleSkills() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:316:2: ( ( ( rule__Skills__Group__0 ) ) )
            // InternalResumeDsl.g:317:2: ( ( rule__Skills__Group__0 ) )
            {
            // InternalResumeDsl.g:317:2: ( ( rule__Skills__Group__0 ) )
            // InternalResumeDsl.g:318:3: ( rule__Skills__Group__0 )
            {
             before(grammarAccess.getSkillsAccess().getGroup()); 
            // InternalResumeDsl.g:319:3: ( rule__Skills__Group__0 )
            // InternalResumeDsl.g:319:4: rule__Skills__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Skills__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkills"


    // $ANTLR start "entryRuleSkill"
    // InternalResumeDsl.g:328:1: entryRuleSkill : ruleSkill EOF ;
    public final void entryRuleSkill() throws RecognitionException {
        try {
            // InternalResumeDsl.g:329:1: ( ruleSkill EOF )
            // InternalResumeDsl.g:330:1: ruleSkill EOF
            {
             before(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_1);
            ruleSkill();

            state._fsp--;

             after(grammarAccess.getSkillRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkill"


    // $ANTLR start "ruleSkill"
    // InternalResumeDsl.g:337:1: ruleSkill : ( ( rule__Skill__Group__0 ) ) ;
    public final void ruleSkill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:341:2: ( ( ( rule__Skill__Group__0 ) ) )
            // InternalResumeDsl.g:342:2: ( ( rule__Skill__Group__0 ) )
            {
            // InternalResumeDsl.g:342:2: ( ( rule__Skill__Group__0 ) )
            // InternalResumeDsl.g:343:3: ( rule__Skill__Group__0 )
            {
             before(grammarAccess.getSkillAccess().getGroup()); 
            // InternalResumeDsl.g:344:3: ( rule__Skill__Group__0 )
            // InternalResumeDsl.g:344:4: rule__Skill__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Skill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleInterests"
    // InternalResumeDsl.g:353:1: entryRuleInterests : ruleInterests EOF ;
    public final void entryRuleInterests() throws RecognitionException {
        try {
            // InternalResumeDsl.g:354:1: ( ruleInterests EOF )
            // InternalResumeDsl.g:355:1: ruleInterests EOF
            {
             before(grammarAccess.getInterestsRule()); 
            pushFollow(FOLLOW_1);
            ruleInterests();

            state._fsp--;

             after(grammarAccess.getInterestsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterests"


    // $ANTLR start "ruleInterests"
    // InternalResumeDsl.g:362:1: ruleInterests : ( ( rule__Interests__Group__0 ) ) ;
    public final void ruleInterests() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:366:2: ( ( ( rule__Interests__Group__0 ) ) )
            // InternalResumeDsl.g:367:2: ( ( rule__Interests__Group__0 ) )
            {
            // InternalResumeDsl.g:367:2: ( ( rule__Interests__Group__0 ) )
            // InternalResumeDsl.g:368:3: ( rule__Interests__Group__0 )
            {
             before(grammarAccess.getInterestsAccess().getGroup()); 
            // InternalResumeDsl.g:369:3: ( rule__Interests__Group__0 )
            // InternalResumeDsl.g:369:4: rule__Interests__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interests__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterestsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterests"


    // $ANTLR start "entryRuleLanguages"
    // InternalResumeDsl.g:378:1: entryRuleLanguages : ruleLanguages EOF ;
    public final void entryRuleLanguages() throws RecognitionException {
        try {
            // InternalResumeDsl.g:379:1: ( ruleLanguages EOF )
            // InternalResumeDsl.g:380:1: ruleLanguages EOF
            {
             before(grammarAccess.getLanguagesRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguages();

            state._fsp--;

             after(grammarAccess.getLanguagesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguages"


    // $ANTLR start "ruleLanguages"
    // InternalResumeDsl.g:387:1: ruleLanguages : ( ( rule__Languages__Group__0 ) ) ;
    public final void ruleLanguages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:391:2: ( ( ( rule__Languages__Group__0 ) ) )
            // InternalResumeDsl.g:392:2: ( ( rule__Languages__Group__0 ) )
            {
            // InternalResumeDsl.g:392:2: ( ( rule__Languages__Group__0 ) )
            // InternalResumeDsl.g:393:3: ( rule__Languages__Group__0 )
            {
             before(grammarAccess.getLanguagesAccess().getGroup()); 
            // InternalResumeDsl.g:394:3: ( rule__Languages__Group__0 )
            // InternalResumeDsl.g:394:4: rule__Languages__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Languages__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguagesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguages"


    // $ANTLR start "entryRuleCustomization"
    // InternalResumeDsl.g:403:1: entryRuleCustomization : ruleCustomization EOF ;
    public final void entryRuleCustomization() throws RecognitionException {
        try {
            // InternalResumeDsl.g:404:1: ( ruleCustomization EOF )
            // InternalResumeDsl.g:405:1: ruleCustomization EOF
            {
             before(grammarAccess.getCustomizationRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomization();

            state._fsp--;

             after(grammarAccess.getCustomizationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomization"


    // $ANTLR start "ruleCustomization"
    // InternalResumeDsl.g:412:1: ruleCustomization : ( ( rule__Customization__Group__0 ) ) ;
    public final void ruleCustomization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:416:2: ( ( ( rule__Customization__Group__0 ) ) )
            // InternalResumeDsl.g:417:2: ( ( rule__Customization__Group__0 ) )
            {
            // InternalResumeDsl.g:417:2: ( ( rule__Customization__Group__0 ) )
            // InternalResumeDsl.g:418:3: ( rule__Customization__Group__0 )
            {
             before(grammarAccess.getCustomizationAccess().getGroup()); 
            // InternalResumeDsl.g:419:3: ( rule__Customization__Group__0 )
            // InternalResumeDsl.g:419:4: rule__Customization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomization"


    // $ANTLR start "entryRuleRule"
    // InternalResumeDsl.g:428:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalResumeDsl.g:429:1: ( ruleRule EOF )
            // InternalResumeDsl.g:430:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalResumeDsl.g:437:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:441:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalResumeDsl.g:442:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalResumeDsl.g:442:2: ( ( rule__Rule__Group__0 ) )
            // InternalResumeDsl.g:443:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalResumeDsl.g:444:3: ( rule__Rule__Group__0 )
            // InternalResumeDsl.g:444:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFilter"
    // InternalResumeDsl.g:453:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalResumeDsl.g:454:1: ( ruleFilter EOF )
            // InternalResumeDsl.g:455:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalResumeDsl.g:462:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:466:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalResumeDsl.g:467:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalResumeDsl.g:467:2: ( ( rule__Filter__Alternatives ) )
            // InternalResumeDsl.g:468:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalResumeDsl.g:469:3: ( rule__Filter__Alternatives )
            // InternalResumeDsl.g:469:4: rule__Filter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleGeneralFilter"
    // InternalResumeDsl.g:478:1: entryRuleGeneralFilter : ruleGeneralFilter EOF ;
    public final void entryRuleGeneralFilter() throws RecognitionException {
        try {
            // InternalResumeDsl.g:479:1: ( ruleGeneralFilter EOF )
            // InternalResumeDsl.g:480:1: ruleGeneralFilter EOF
            {
             before(grammarAccess.getGeneralFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralFilter();

            state._fsp--;

             after(grammarAccess.getGeneralFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralFilter"


    // $ANTLR start "ruleGeneralFilter"
    // InternalResumeDsl.g:487:1: ruleGeneralFilter : ( ( rule__GeneralFilter__Group__0 ) ) ;
    public final void ruleGeneralFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:491:2: ( ( ( rule__GeneralFilter__Group__0 ) ) )
            // InternalResumeDsl.g:492:2: ( ( rule__GeneralFilter__Group__0 ) )
            {
            // InternalResumeDsl.g:492:2: ( ( rule__GeneralFilter__Group__0 ) )
            // InternalResumeDsl.g:493:3: ( rule__GeneralFilter__Group__0 )
            {
             before(grammarAccess.getGeneralFilterAccess().getGroup()); 
            // InternalResumeDsl.g:494:3: ( rule__GeneralFilter__Group__0 )
            // InternalResumeDsl.g:494:4: rule__GeneralFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralFilter"


    // $ANTLR start "entryRuleTemporalFilter"
    // InternalResumeDsl.g:503:1: entryRuleTemporalFilter : ruleTemporalFilter EOF ;
    public final void entryRuleTemporalFilter() throws RecognitionException {
        try {
            // InternalResumeDsl.g:504:1: ( ruleTemporalFilter EOF )
            // InternalResumeDsl.g:505:1: ruleTemporalFilter EOF
            {
             before(grammarAccess.getTemporalFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleTemporalFilter();

            state._fsp--;

             after(grammarAccess.getTemporalFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemporalFilter"


    // $ANTLR start "ruleTemporalFilter"
    // InternalResumeDsl.g:512:1: ruleTemporalFilter : ( ( rule__TemporalFilter__Alternatives ) ) ;
    public final void ruleTemporalFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:516:2: ( ( ( rule__TemporalFilter__Alternatives ) ) )
            // InternalResumeDsl.g:517:2: ( ( rule__TemporalFilter__Alternatives ) )
            {
            // InternalResumeDsl.g:517:2: ( ( rule__TemporalFilter__Alternatives ) )
            // InternalResumeDsl.g:518:3: ( rule__TemporalFilter__Alternatives )
            {
             before(grammarAccess.getTemporalFilterAccess().getAlternatives()); 
            // InternalResumeDsl.g:519:3: ( rule__TemporalFilter__Alternatives )
            // InternalResumeDsl.g:519:4: rule__TemporalFilter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemporalFilter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemporalFilterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporalFilter"


    // $ANTLR start "entryRuleStringList"
    // InternalResumeDsl.g:528:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // InternalResumeDsl.g:529:1: ( ruleStringList EOF )
            // InternalResumeDsl.g:530:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalResumeDsl.g:537:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:541:2: ( ( ( rule__StringList__Group__0 ) ) )
            // InternalResumeDsl.g:542:2: ( ( rule__StringList__Group__0 ) )
            {
            // InternalResumeDsl.g:542:2: ( ( rule__StringList__Group__0 ) )
            // InternalResumeDsl.g:543:3: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // InternalResumeDsl.g:544:3: ( rule__StringList__Group__0 )
            // InternalResumeDsl.g:544:4: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleDate"
    // InternalResumeDsl.g:553:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalResumeDsl.g:554:1: ( ruleDate EOF )
            // InternalResumeDsl.g:555:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalResumeDsl.g:562:1: ruleDate : ( RULE_STRING ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:566:2: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:567:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:567:2: ( RULE_STRING )
            // InternalResumeDsl.g:568:3: RULE_STRING
            {
             before(grammarAccess.getDateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleSectionType"
    // InternalResumeDsl.g:578:1: ruleSectionType : ( ( rule__SectionType__Alternatives ) ) ;
    public final void ruleSectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:582:1: ( ( ( rule__SectionType__Alternatives ) ) )
            // InternalResumeDsl.g:583:2: ( ( rule__SectionType__Alternatives ) )
            {
            // InternalResumeDsl.g:583:2: ( ( rule__SectionType__Alternatives ) )
            // InternalResumeDsl.g:584:3: ( rule__SectionType__Alternatives )
            {
             before(grammarAccess.getSectionTypeAccess().getAlternatives()); 
            // InternalResumeDsl.g:585:3: ( rule__SectionType__Alternatives )
            // InternalResumeDsl.g:585:4: rule__SectionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SectionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionType"


    // $ANTLR start "rule__Section__Alternatives"
    // InternalResumeDsl.g:593:1: rule__Section__Alternatives : ( ( ruleExperience ) | ( ruleProjects ) | ( ruleEducation ) | ( ruleSkills ) | ( ruleInterests ) | ( ruleLanguages ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:597:1: ( ( ruleExperience ) | ( ruleProjects ) | ( ruleEducation ) | ( ruleSkills ) | ( ruleInterests ) | ( ruleLanguages ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalResumeDsl.g:598:2: ( ruleExperience )
                    {
                    // InternalResumeDsl.g:598:2: ( ruleExperience )
                    // InternalResumeDsl.g:599:3: ruleExperience
                    {
                     before(grammarAccess.getSectionAccess().getExperienceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExperience();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getExperienceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalResumeDsl.g:604:2: ( ruleProjects )
                    {
                    // InternalResumeDsl.g:604:2: ( ruleProjects )
                    // InternalResumeDsl.g:605:3: ruleProjects
                    {
                     before(grammarAccess.getSectionAccess().getProjectsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProjects();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getProjectsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalResumeDsl.g:610:2: ( ruleEducation )
                    {
                    // InternalResumeDsl.g:610:2: ( ruleEducation )
                    // InternalResumeDsl.g:611:3: ruleEducation
                    {
                     before(grammarAccess.getSectionAccess().getEducationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEducation();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getEducationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalResumeDsl.g:616:2: ( ruleSkills )
                    {
                    // InternalResumeDsl.g:616:2: ( ruleSkills )
                    // InternalResumeDsl.g:617:3: ruleSkills
                    {
                     before(grammarAccess.getSectionAccess().getSkillsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSkills();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getSkillsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalResumeDsl.g:622:2: ( ruleInterests )
                    {
                    // InternalResumeDsl.g:622:2: ( ruleInterests )
                    // InternalResumeDsl.g:623:3: ruleInterests
                    {
                     before(grammarAccess.getSectionAccess().getInterestsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInterests();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getInterestsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalResumeDsl.g:628:2: ( ruleLanguages )
                    {
                    // InternalResumeDsl.g:628:2: ( ruleLanguages )
                    // InternalResumeDsl.g:629:3: ruleLanguages
                    {
                     before(grammarAccess.getSectionAccess().getLanguagesParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleLanguages();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getLanguagesParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Alternatives"


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalResumeDsl.g:638:1: rule__Filter__Alternatives : ( ( ruleGeneralFilter ) | ( ruleTemporalFilter ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:642:1: ( ( ruleGeneralFilter ) | ( ruleTemporalFilter ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44) ) {
                alt2=1;
            }
            else if ( (LA2_0==45||LA2_0==47) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalResumeDsl.g:643:2: ( ruleGeneralFilter )
                    {
                    // InternalResumeDsl.g:643:2: ( ruleGeneralFilter )
                    // InternalResumeDsl.g:644:3: ruleGeneralFilter
                    {
                     before(grammarAccess.getFilterAccess().getGeneralFilterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getGeneralFilterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalResumeDsl.g:649:2: ( ruleTemporalFilter )
                    {
                    // InternalResumeDsl.g:649:2: ( ruleTemporalFilter )
                    // InternalResumeDsl.g:650:3: ruleTemporalFilter
                    {
                     before(grammarAccess.getFilterAccess().getTemporalFilterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemporalFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getTemporalFilterParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Alternatives"


    // $ANTLR start "rule__TemporalFilter__Alternatives"
    // InternalResumeDsl.g:659:1: rule__TemporalFilter__Alternatives : ( ( ( rule__TemporalFilter__Group_0__0 ) ) | ( ( rule__TemporalFilter__Group_1__0 ) ) );
    public final void rule__TemporalFilter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:663:1: ( ( ( rule__TemporalFilter__Group_0__0 ) ) | ( ( rule__TemporalFilter__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalResumeDsl.g:664:2: ( ( rule__TemporalFilter__Group_0__0 ) )
                    {
                    // InternalResumeDsl.g:664:2: ( ( rule__TemporalFilter__Group_0__0 ) )
                    // InternalResumeDsl.g:665:3: ( rule__TemporalFilter__Group_0__0 )
                    {
                     before(grammarAccess.getTemporalFilterAccess().getGroup_0()); 
                    // InternalResumeDsl.g:666:3: ( rule__TemporalFilter__Group_0__0 )
                    // InternalResumeDsl.g:666:4: rule__TemporalFilter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalFilter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalFilterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalResumeDsl.g:670:2: ( ( rule__TemporalFilter__Group_1__0 ) )
                    {
                    // InternalResumeDsl.g:670:2: ( ( rule__TemporalFilter__Group_1__0 ) )
                    // InternalResumeDsl.g:671:3: ( rule__TemporalFilter__Group_1__0 )
                    {
                     before(grammarAccess.getTemporalFilterAccess().getGroup_1()); 
                    // InternalResumeDsl.g:672:3: ( rule__TemporalFilter__Group_1__0 )
                    // InternalResumeDsl.g:672:4: rule__TemporalFilter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalFilter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalFilterAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Alternatives"


    // $ANTLR start "rule__SectionType__Alternatives"
    // InternalResumeDsl.g:680:1: rule__SectionType__Alternatives : ( ( ( 'Experience' ) ) | ( ( 'Projects' ) ) | ( ( 'Education' ) ) | ( ( 'Skills' ) ) | ( ( 'Interests' ) ) | ( ( 'Languages' ) ) );
    public final void rule__SectionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:684:1: ( ( ( 'Experience' ) ) | ( ( 'Projects' ) ) | ( ( 'Education' ) ) | ( ( 'Skills' ) ) | ( ( 'Interests' ) ) | ( ( 'Languages' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalResumeDsl.g:685:2: ( ( 'Experience' ) )
                    {
                    // InternalResumeDsl.g:685:2: ( ( 'Experience' ) )
                    // InternalResumeDsl.g:686:3: ( 'Experience' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getEXPERIENCEEnumLiteralDeclaration_0()); 
                    // InternalResumeDsl.g:687:3: ( 'Experience' )
                    // InternalResumeDsl.g:687:4: 'Experience'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getEXPERIENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalResumeDsl.g:691:2: ( ( 'Projects' ) )
                    {
                    // InternalResumeDsl.g:691:2: ( ( 'Projects' ) )
                    // InternalResumeDsl.g:692:3: ( 'Projects' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getPROJECTSEnumLiteralDeclaration_1()); 
                    // InternalResumeDsl.g:693:3: ( 'Projects' )
                    // InternalResumeDsl.g:693:4: 'Projects'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getPROJECTSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalResumeDsl.g:697:2: ( ( 'Education' ) )
                    {
                    // InternalResumeDsl.g:697:2: ( ( 'Education' ) )
                    // InternalResumeDsl.g:698:3: ( 'Education' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getEDUCATIONEnumLiteralDeclaration_2()); 
                    // InternalResumeDsl.g:699:3: ( 'Education' )
                    // InternalResumeDsl.g:699:4: 'Education'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getEDUCATIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalResumeDsl.g:703:2: ( ( 'Skills' ) )
                    {
                    // InternalResumeDsl.g:703:2: ( ( 'Skills' ) )
                    // InternalResumeDsl.g:704:3: ( 'Skills' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getSKILLSEnumLiteralDeclaration_3()); 
                    // InternalResumeDsl.g:705:3: ( 'Skills' )
                    // InternalResumeDsl.g:705:4: 'Skills'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getSKILLSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalResumeDsl.g:709:2: ( ( 'Interests' ) )
                    {
                    // InternalResumeDsl.g:709:2: ( ( 'Interests' ) )
                    // InternalResumeDsl.g:710:3: ( 'Interests' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getINTERESTSEnumLiteralDeclaration_4()); 
                    // InternalResumeDsl.g:711:3: ( 'Interests' )
                    // InternalResumeDsl.g:711:4: 'Interests'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getINTERESTSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalResumeDsl.g:715:2: ( ( 'Languages' ) )
                    {
                    // InternalResumeDsl.g:715:2: ( ( 'Languages' ) )
                    // InternalResumeDsl.g:716:3: ( 'Languages' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getLANGUAGESEnumLiteralDeclaration_5()); 
                    // InternalResumeDsl.g:717:3: ( 'Languages' )
                    // InternalResumeDsl.g:717:4: 'Languages'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getLANGUAGESEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionType__Alternatives"


    // $ANTLR start "rule__Profile__Group__0"
    // InternalResumeDsl.g:725:1: rule__Profile__Group__0 : rule__Profile__Group__0__Impl rule__Profile__Group__1 ;
    public final void rule__Profile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:729:1: ( rule__Profile__Group__0__Impl rule__Profile__Group__1 )
            // InternalResumeDsl.g:730:2: rule__Profile__Group__0__Impl rule__Profile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__0"


    // $ANTLR start "rule__Profile__Group__0__Impl"
    // InternalResumeDsl.g:737:1: rule__Profile__Group__0__Impl : ( ( rule__Profile__MetadataAssignment_0 ) ) ;
    public final void rule__Profile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:741:1: ( ( ( rule__Profile__MetadataAssignment_0 ) ) )
            // InternalResumeDsl.g:742:1: ( ( rule__Profile__MetadataAssignment_0 ) )
            {
            // InternalResumeDsl.g:742:1: ( ( rule__Profile__MetadataAssignment_0 ) )
            // InternalResumeDsl.g:743:2: ( rule__Profile__MetadataAssignment_0 )
            {
             before(grammarAccess.getProfileAccess().getMetadataAssignment_0()); 
            // InternalResumeDsl.g:744:2: ( rule__Profile__MetadataAssignment_0 )
            // InternalResumeDsl.g:744:3: rule__Profile__MetadataAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__MetadataAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__0__Impl"


    // $ANTLR start "rule__Profile__Group__1"
    // InternalResumeDsl.g:752:1: rule__Profile__Group__1 : rule__Profile__Group__1__Impl rule__Profile__Group__2 ;
    public final void rule__Profile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:756:1: ( rule__Profile__Group__1__Impl rule__Profile__Group__2 )
            // InternalResumeDsl.g:757:2: rule__Profile__Group__1__Impl rule__Profile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Profile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__1"


    // $ANTLR start "rule__Profile__Group__1__Impl"
    // InternalResumeDsl.g:764:1: rule__Profile__Group__1__Impl : ( ( rule__Profile__UserdataAssignment_1 ) ) ;
    public final void rule__Profile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:768:1: ( ( ( rule__Profile__UserdataAssignment_1 ) ) )
            // InternalResumeDsl.g:769:1: ( ( rule__Profile__UserdataAssignment_1 ) )
            {
            // InternalResumeDsl.g:769:1: ( ( rule__Profile__UserdataAssignment_1 ) )
            // InternalResumeDsl.g:770:2: ( rule__Profile__UserdataAssignment_1 )
            {
             before(grammarAccess.getProfileAccess().getUserdataAssignment_1()); 
            // InternalResumeDsl.g:771:2: ( rule__Profile__UserdataAssignment_1 )
            // InternalResumeDsl.g:771:3: rule__Profile__UserdataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Profile__UserdataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getUserdataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__1__Impl"


    // $ANTLR start "rule__Profile__Group__2"
    // InternalResumeDsl.g:779:1: rule__Profile__Group__2 : rule__Profile__Group__2__Impl rule__Profile__Group__3 ;
    public final void rule__Profile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:783:1: ( rule__Profile__Group__2__Impl rule__Profile__Group__3 )
            // InternalResumeDsl.g:784:2: rule__Profile__Group__2__Impl rule__Profile__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Profile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__2"


    // $ANTLR start "rule__Profile__Group__2__Impl"
    // InternalResumeDsl.g:791:1: rule__Profile__Group__2__Impl : ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) ) ;
    public final void rule__Profile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:795:1: ( ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) ) )
            // InternalResumeDsl.g:796:1: ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) )
            {
            // InternalResumeDsl.g:796:1: ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) )
            // InternalResumeDsl.g:797:2: ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* )
            {
            // InternalResumeDsl.g:797:2: ( ( rule__Profile__SectionsAssignment_2 ) )
            // InternalResumeDsl.g:798:3: ( rule__Profile__SectionsAssignment_2 )
            {
             before(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 
            // InternalResumeDsl.g:799:3: ( rule__Profile__SectionsAssignment_2 )
            // InternalResumeDsl.g:799:4: rule__Profile__SectionsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Profile__SectionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 

            }

            // InternalResumeDsl.g:802:2: ( ( rule__Profile__SectionsAssignment_2 )* )
            // InternalResumeDsl.g:803:3: ( rule__Profile__SectionsAssignment_2 )*
            {
             before(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 
            // InternalResumeDsl.g:804:3: ( rule__Profile__SectionsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalResumeDsl.g:804:4: rule__Profile__SectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Profile__SectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__2__Impl"


    // $ANTLR start "rule__Profile__Group__3"
    // InternalResumeDsl.g:813:1: rule__Profile__Group__3 : rule__Profile__Group__3__Impl ;
    public final void rule__Profile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:817:1: ( rule__Profile__Group__3__Impl )
            // InternalResumeDsl.g:818:2: rule__Profile__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__3"


    // $ANTLR start "rule__Profile__Group__3__Impl"
    // InternalResumeDsl.g:824:1: rule__Profile__Group__3__Impl : ( ( rule__Profile__CustomizationAssignment_3 ) ) ;
    public final void rule__Profile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:828:1: ( ( ( rule__Profile__CustomizationAssignment_3 ) ) )
            // InternalResumeDsl.g:829:1: ( ( rule__Profile__CustomizationAssignment_3 ) )
            {
            // InternalResumeDsl.g:829:1: ( ( rule__Profile__CustomizationAssignment_3 ) )
            // InternalResumeDsl.g:830:2: ( rule__Profile__CustomizationAssignment_3 )
            {
             before(grammarAccess.getProfileAccess().getCustomizationAssignment_3()); 
            // InternalResumeDsl.g:831:2: ( rule__Profile__CustomizationAssignment_3 )
            // InternalResumeDsl.g:831:3: rule__Profile__CustomizationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Profile__CustomizationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getCustomizationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__3__Impl"


    // $ANTLR start "rule__Metadata__Group__0"
    // InternalResumeDsl.g:840:1: rule__Metadata__Group__0 : rule__Metadata__Group__0__Impl rule__Metadata__Group__1 ;
    public final void rule__Metadata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:844:1: ( rule__Metadata__Group__0__Impl rule__Metadata__Group__1 )
            // InternalResumeDsl.g:845:2: rule__Metadata__Group__0__Impl rule__Metadata__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Metadata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0"


    // $ANTLR start "rule__Metadata__Group__0__Impl"
    // InternalResumeDsl.g:852:1: rule__Metadata__Group__0__Impl : ( 'Metadata' ) ;
    public final void rule__Metadata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:856:1: ( ( 'Metadata' ) )
            // InternalResumeDsl.g:857:1: ( 'Metadata' )
            {
            // InternalResumeDsl.g:857:1: ( 'Metadata' )
            // InternalResumeDsl.g:858:2: 'Metadata'
            {
             before(grammarAccess.getMetadataAccess().getMetadataKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getMetadataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0__Impl"


    // $ANTLR start "rule__Metadata__Group__1"
    // InternalResumeDsl.g:867:1: rule__Metadata__Group__1 : rule__Metadata__Group__1__Impl rule__Metadata__Group__2 ;
    public final void rule__Metadata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:871:1: ( rule__Metadata__Group__1__Impl rule__Metadata__Group__2 )
            // InternalResumeDsl.g:872:2: rule__Metadata__Group__1__Impl rule__Metadata__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1"


    // $ANTLR start "rule__Metadata__Group__1__Impl"
    // InternalResumeDsl.g:879:1: rule__Metadata__Group__1__Impl : ( 'style:' ) ;
    public final void rule__Metadata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:883:1: ( ( 'style:' ) )
            // InternalResumeDsl.g:884:1: ( 'style:' )
            {
            // InternalResumeDsl.g:884:1: ( 'style:' )
            // InternalResumeDsl.g:885:2: 'style:'
            {
             before(grammarAccess.getMetadataAccess().getStyleKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getStyleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1__Impl"


    // $ANTLR start "rule__Metadata__Group__2"
    // InternalResumeDsl.g:894:1: rule__Metadata__Group__2 : rule__Metadata__Group__2__Impl rule__Metadata__Group__3 ;
    public final void rule__Metadata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:898:1: ( rule__Metadata__Group__2__Impl rule__Metadata__Group__3 )
            // InternalResumeDsl.g:899:2: rule__Metadata__Group__2__Impl rule__Metadata__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Metadata__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__2"


    // $ANTLR start "rule__Metadata__Group__2__Impl"
    // InternalResumeDsl.g:906:1: rule__Metadata__Group__2__Impl : ( ( rule__Metadata__StyleAssignment_2 ) ) ;
    public final void rule__Metadata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:910:1: ( ( ( rule__Metadata__StyleAssignment_2 ) ) )
            // InternalResumeDsl.g:911:1: ( ( rule__Metadata__StyleAssignment_2 ) )
            {
            // InternalResumeDsl.g:911:1: ( ( rule__Metadata__StyleAssignment_2 ) )
            // InternalResumeDsl.g:912:2: ( rule__Metadata__StyleAssignment_2 )
            {
             before(grammarAccess.getMetadataAccess().getStyleAssignment_2()); 
            // InternalResumeDsl.g:913:2: ( rule__Metadata__StyleAssignment_2 )
            // InternalResumeDsl.g:913:3: rule__Metadata__StyleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__StyleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getStyleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__2__Impl"


    // $ANTLR start "rule__Metadata__Group__3"
    // InternalResumeDsl.g:921:1: rule__Metadata__Group__3 : rule__Metadata__Group__3__Impl rule__Metadata__Group__4 ;
    public final void rule__Metadata__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:925:1: ( rule__Metadata__Group__3__Impl rule__Metadata__Group__4 )
            // InternalResumeDsl.g:926:2: rule__Metadata__Group__3__Impl rule__Metadata__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__3"


    // $ANTLR start "rule__Metadata__Group__3__Impl"
    // InternalResumeDsl.g:933:1: rule__Metadata__Group__3__Impl : ( 'font:' ) ;
    public final void rule__Metadata__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:937:1: ( ( 'font:' ) )
            // InternalResumeDsl.g:938:1: ( 'font:' )
            {
            // InternalResumeDsl.g:938:1: ( 'font:' )
            // InternalResumeDsl.g:939:2: 'font:'
            {
             before(grammarAccess.getMetadataAccess().getFontKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getFontKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__3__Impl"


    // $ANTLR start "rule__Metadata__Group__4"
    // InternalResumeDsl.g:948:1: rule__Metadata__Group__4 : rule__Metadata__Group__4__Impl rule__Metadata__Group__5 ;
    public final void rule__Metadata__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:952:1: ( rule__Metadata__Group__4__Impl rule__Metadata__Group__5 )
            // InternalResumeDsl.g:953:2: rule__Metadata__Group__4__Impl rule__Metadata__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Metadata__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__4"


    // $ANTLR start "rule__Metadata__Group__4__Impl"
    // InternalResumeDsl.g:960:1: rule__Metadata__Group__4__Impl : ( ( rule__Metadata__FontAssignment_4 ) ) ;
    public final void rule__Metadata__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:964:1: ( ( ( rule__Metadata__FontAssignment_4 ) ) )
            // InternalResumeDsl.g:965:1: ( ( rule__Metadata__FontAssignment_4 ) )
            {
            // InternalResumeDsl.g:965:1: ( ( rule__Metadata__FontAssignment_4 ) )
            // InternalResumeDsl.g:966:2: ( rule__Metadata__FontAssignment_4 )
            {
             before(grammarAccess.getMetadataAccess().getFontAssignment_4()); 
            // InternalResumeDsl.g:967:2: ( rule__Metadata__FontAssignment_4 )
            // InternalResumeDsl.g:967:3: rule__Metadata__FontAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__FontAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getFontAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__4__Impl"


    // $ANTLR start "rule__Metadata__Group__5"
    // InternalResumeDsl.g:975:1: rule__Metadata__Group__5 : rule__Metadata__Group__5__Impl rule__Metadata__Group__6 ;
    public final void rule__Metadata__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:979:1: ( rule__Metadata__Group__5__Impl rule__Metadata__Group__6 )
            // InternalResumeDsl.g:980:2: rule__Metadata__Group__5__Impl rule__Metadata__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__5"


    // $ANTLR start "rule__Metadata__Group__5__Impl"
    // InternalResumeDsl.g:987:1: rule__Metadata__Group__5__Impl : ( 'imgPath:' ) ;
    public final void rule__Metadata__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:991:1: ( ( 'imgPath:' ) )
            // InternalResumeDsl.g:992:1: ( 'imgPath:' )
            {
            // InternalResumeDsl.g:992:1: ( 'imgPath:' )
            // InternalResumeDsl.g:993:2: 'imgPath:'
            {
             before(grammarAccess.getMetadataAccess().getImgPathKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getImgPathKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__5__Impl"


    // $ANTLR start "rule__Metadata__Group__6"
    // InternalResumeDsl.g:1002:1: rule__Metadata__Group__6 : rule__Metadata__Group__6__Impl ;
    public final void rule__Metadata__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1006:1: ( rule__Metadata__Group__6__Impl )
            // InternalResumeDsl.g:1007:2: rule__Metadata__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__6"


    // $ANTLR start "rule__Metadata__Group__6__Impl"
    // InternalResumeDsl.g:1013:1: rule__Metadata__Group__6__Impl : ( ( rule__Metadata__ImgPathAssignment_6 ) ) ;
    public final void rule__Metadata__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1017:1: ( ( ( rule__Metadata__ImgPathAssignment_6 ) ) )
            // InternalResumeDsl.g:1018:1: ( ( rule__Metadata__ImgPathAssignment_6 ) )
            {
            // InternalResumeDsl.g:1018:1: ( ( rule__Metadata__ImgPathAssignment_6 ) )
            // InternalResumeDsl.g:1019:2: ( rule__Metadata__ImgPathAssignment_6 )
            {
             before(grammarAccess.getMetadataAccess().getImgPathAssignment_6()); 
            // InternalResumeDsl.g:1020:2: ( rule__Metadata__ImgPathAssignment_6 )
            // InternalResumeDsl.g:1020:3: rule__Metadata__ImgPathAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__ImgPathAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getImgPathAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__6__Impl"


    // $ANTLR start "rule__Userdata__Group__0"
    // InternalResumeDsl.g:1029:1: rule__Userdata__Group__0 : rule__Userdata__Group__0__Impl rule__Userdata__Group__1 ;
    public final void rule__Userdata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1033:1: ( rule__Userdata__Group__0__Impl rule__Userdata__Group__1 )
            // InternalResumeDsl.g:1034:2: rule__Userdata__Group__0__Impl rule__Userdata__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Userdata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__0"


    // $ANTLR start "rule__Userdata__Group__0__Impl"
    // InternalResumeDsl.g:1041:1: rule__Userdata__Group__0__Impl : ( 'Userdata' ) ;
    public final void rule__Userdata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1045:1: ( ( 'Userdata' ) )
            // InternalResumeDsl.g:1046:1: ( 'Userdata' )
            {
            // InternalResumeDsl.g:1046:1: ( 'Userdata' )
            // InternalResumeDsl.g:1047:2: 'Userdata'
            {
             before(grammarAccess.getUserdataAccess().getUserdataKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getUserdataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__0__Impl"


    // $ANTLR start "rule__Userdata__Group__1"
    // InternalResumeDsl.g:1056:1: rule__Userdata__Group__1 : rule__Userdata__Group__1__Impl rule__Userdata__Group__2 ;
    public final void rule__Userdata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1060:1: ( rule__Userdata__Group__1__Impl rule__Userdata__Group__2 )
            // InternalResumeDsl.g:1061:2: rule__Userdata__Group__1__Impl rule__Userdata__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__1"


    // $ANTLR start "rule__Userdata__Group__1__Impl"
    // InternalResumeDsl.g:1068:1: rule__Userdata__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Userdata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1072:1: ( ( 'name:' ) )
            // InternalResumeDsl.g:1073:1: ( 'name:' )
            {
            // InternalResumeDsl.g:1073:1: ( 'name:' )
            // InternalResumeDsl.g:1074:2: 'name:'
            {
             before(grammarAccess.getUserdataAccess().getNameKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__1__Impl"


    // $ANTLR start "rule__Userdata__Group__2"
    // InternalResumeDsl.g:1083:1: rule__Userdata__Group__2 : rule__Userdata__Group__2__Impl rule__Userdata__Group__3 ;
    public final void rule__Userdata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1087:1: ( rule__Userdata__Group__2__Impl rule__Userdata__Group__3 )
            // InternalResumeDsl.g:1088:2: rule__Userdata__Group__2__Impl rule__Userdata__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Userdata__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__2"


    // $ANTLR start "rule__Userdata__Group__2__Impl"
    // InternalResumeDsl.g:1095:1: rule__Userdata__Group__2__Impl : ( ( rule__Userdata__NameAssignment_2 ) ) ;
    public final void rule__Userdata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1099:1: ( ( ( rule__Userdata__NameAssignment_2 ) ) )
            // InternalResumeDsl.g:1100:1: ( ( rule__Userdata__NameAssignment_2 ) )
            {
            // InternalResumeDsl.g:1100:1: ( ( rule__Userdata__NameAssignment_2 ) )
            // InternalResumeDsl.g:1101:2: ( rule__Userdata__NameAssignment_2 )
            {
             before(grammarAccess.getUserdataAccess().getNameAssignment_2()); 
            // InternalResumeDsl.g:1102:2: ( rule__Userdata__NameAssignment_2 )
            // InternalResumeDsl.g:1102:3: rule__Userdata__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__2__Impl"


    // $ANTLR start "rule__Userdata__Group__3"
    // InternalResumeDsl.g:1110:1: rule__Userdata__Group__3 : rule__Userdata__Group__3__Impl rule__Userdata__Group__4 ;
    public final void rule__Userdata__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1114:1: ( rule__Userdata__Group__3__Impl rule__Userdata__Group__4 )
            // InternalResumeDsl.g:1115:2: rule__Userdata__Group__3__Impl rule__Userdata__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__3"


    // $ANTLR start "rule__Userdata__Group__3__Impl"
    // InternalResumeDsl.g:1122:1: rule__Userdata__Group__3__Impl : ( 'email:' ) ;
    public final void rule__Userdata__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1126:1: ( ( 'email:' ) )
            // InternalResumeDsl.g:1127:1: ( 'email:' )
            {
            // InternalResumeDsl.g:1127:1: ( 'email:' )
            // InternalResumeDsl.g:1128:2: 'email:'
            {
             before(grammarAccess.getUserdataAccess().getEmailKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getEmailKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__3__Impl"


    // $ANTLR start "rule__Userdata__Group__4"
    // InternalResumeDsl.g:1137:1: rule__Userdata__Group__4 : rule__Userdata__Group__4__Impl rule__Userdata__Group__5 ;
    public final void rule__Userdata__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1141:1: ( rule__Userdata__Group__4__Impl rule__Userdata__Group__5 )
            // InternalResumeDsl.g:1142:2: rule__Userdata__Group__4__Impl rule__Userdata__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Userdata__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__4"


    // $ANTLR start "rule__Userdata__Group__4__Impl"
    // InternalResumeDsl.g:1149:1: rule__Userdata__Group__4__Impl : ( ( rule__Userdata__EmailAssignment_4 ) ) ;
    public final void rule__Userdata__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1153:1: ( ( ( rule__Userdata__EmailAssignment_4 ) ) )
            // InternalResumeDsl.g:1154:1: ( ( rule__Userdata__EmailAssignment_4 ) )
            {
            // InternalResumeDsl.g:1154:1: ( ( rule__Userdata__EmailAssignment_4 ) )
            // InternalResumeDsl.g:1155:2: ( rule__Userdata__EmailAssignment_4 )
            {
             before(grammarAccess.getUserdataAccess().getEmailAssignment_4()); 
            // InternalResumeDsl.g:1156:2: ( rule__Userdata__EmailAssignment_4 )
            // InternalResumeDsl.g:1156:3: rule__Userdata__EmailAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__EmailAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getEmailAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__4__Impl"


    // $ANTLR start "rule__Userdata__Group__5"
    // InternalResumeDsl.g:1164:1: rule__Userdata__Group__5 : rule__Userdata__Group__5__Impl rule__Userdata__Group__6 ;
    public final void rule__Userdata__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1168:1: ( rule__Userdata__Group__5__Impl rule__Userdata__Group__6 )
            // InternalResumeDsl.g:1169:2: rule__Userdata__Group__5__Impl rule__Userdata__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__5"


    // $ANTLR start "rule__Userdata__Group__5__Impl"
    // InternalResumeDsl.g:1176:1: rule__Userdata__Group__5__Impl : ( 'telephoneNumber:' ) ;
    public final void rule__Userdata__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1180:1: ( ( 'telephoneNumber:' ) )
            // InternalResumeDsl.g:1181:1: ( 'telephoneNumber:' )
            {
            // InternalResumeDsl.g:1181:1: ( 'telephoneNumber:' )
            // InternalResumeDsl.g:1182:2: 'telephoneNumber:'
            {
             before(grammarAccess.getUserdataAccess().getTelephoneNumberKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getTelephoneNumberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__5__Impl"


    // $ANTLR start "rule__Userdata__Group__6"
    // InternalResumeDsl.g:1191:1: rule__Userdata__Group__6 : rule__Userdata__Group__6__Impl rule__Userdata__Group__7 ;
    public final void rule__Userdata__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1195:1: ( rule__Userdata__Group__6__Impl rule__Userdata__Group__7 )
            // InternalResumeDsl.g:1196:2: rule__Userdata__Group__6__Impl rule__Userdata__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Userdata__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__6"


    // $ANTLR start "rule__Userdata__Group__6__Impl"
    // InternalResumeDsl.g:1203:1: rule__Userdata__Group__6__Impl : ( ( rule__Userdata__TelephoneNumberAssignment_6 ) ) ;
    public final void rule__Userdata__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1207:1: ( ( ( rule__Userdata__TelephoneNumberAssignment_6 ) ) )
            // InternalResumeDsl.g:1208:1: ( ( rule__Userdata__TelephoneNumberAssignment_6 ) )
            {
            // InternalResumeDsl.g:1208:1: ( ( rule__Userdata__TelephoneNumberAssignment_6 ) )
            // InternalResumeDsl.g:1209:2: ( rule__Userdata__TelephoneNumberAssignment_6 )
            {
             before(grammarAccess.getUserdataAccess().getTelephoneNumberAssignment_6()); 
            // InternalResumeDsl.g:1210:2: ( rule__Userdata__TelephoneNumberAssignment_6 )
            // InternalResumeDsl.g:1210:3: rule__Userdata__TelephoneNumberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__TelephoneNumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getTelephoneNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__6__Impl"


    // $ANTLR start "rule__Userdata__Group__7"
    // InternalResumeDsl.g:1218:1: rule__Userdata__Group__7 : rule__Userdata__Group__7__Impl rule__Userdata__Group__8 ;
    public final void rule__Userdata__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1222:1: ( rule__Userdata__Group__7__Impl rule__Userdata__Group__8 )
            // InternalResumeDsl.g:1223:2: rule__Userdata__Group__7__Impl rule__Userdata__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__7"


    // $ANTLR start "rule__Userdata__Group__7__Impl"
    // InternalResumeDsl.g:1230:1: rule__Userdata__Group__7__Impl : ( 'direction:' ) ;
    public final void rule__Userdata__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1234:1: ( ( 'direction:' ) )
            // InternalResumeDsl.g:1235:1: ( 'direction:' )
            {
            // InternalResumeDsl.g:1235:1: ( 'direction:' )
            // InternalResumeDsl.g:1236:2: 'direction:'
            {
             before(grammarAccess.getUserdataAccess().getDirectionKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getDirectionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__7__Impl"


    // $ANTLR start "rule__Userdata__Group__8"
    // InternalResumeDsl.g:1245:1: rule__Userdata__Group__8 : rule__Userdata__Group__8__Impl rule__Userdata__Group__9 ;
    public final void rule__Userdata__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1249:1: ( rule__Userdata__Group__8__Impl rule__Userdata__Group__9 )
            // InternalResumeDsl.g:1250:2: rule__Userdata__Group__8__Impl rule__Userdata__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Userdata__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__8"


    // $ANTLR start "rule__Userdata__Group__8__Impl"
    // InternalResumeDsl.g:1257:1: rule__Userdata__Group__8__Impl : ( ( rule__Userdata__DirectionAssignment_8 ) ) ;
    public final void rule__Userdata__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1261:1: ( ( ( rule__Userdata__DirectionAssignment_8 ) ) )
            // InternalResumeDsl.g:1262:1: ( ( rule__Userdata__DirectionAssignment_8 ) )
            {
            // InternalResumeDsl.g:1262:1: ( ( rule__Userdata__DirectionAssignment_8 ) )
            // InternalResumeDsl.g:1263:2: ( rule__Userdata__DirectionAssignment_8 )
            {
             before(grammarAccess.getUserdataAccess().getDirectionAssignment_8()); 
            // InternalResumeDsl.g:1264:2: ( rule__Userdata__DirectionAssignment_8 )
            // InternalResumeDsl.g:1264:3: rule__Userdata__DirectionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__DirectionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getDirectionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__8__Impl"


    // $ANTLR start "rule__Userdata__Group__9"
    // InternalResumeDsl.g:1272:1: rule__Userdata__Group__9 : rule__Userdata__Group__9__Impl rule__Userdata__Group__10 ;
    public final void rule__Userdata__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1276:1: ( rule__Userdata__Group__9__Impl rule__Userdata__Group__10 )
            // InternalResumeDsl.g:1277:2: rule__Userdata__Group__9__Impl rule__Userdata__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__9"


    // $ANTLR start "rule__Userdata__Group__9__Impl"
    // InternalResumeDsl.g:1284:1: rule__Userdata__Group__9__Impl : ( 'city:' ) ;
    public final void rule__Userdata__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1288:1: ( ( 'city:' ) )
            // InternalResumeDsl.g:1289:1: ( 'city:' )
            {
            // InternalResumeDsl.g:1289:1: ( 'city:' )
            // InternalResumeDsl.g:1290:2: 'city:'
            {
             before(grammarAccess.getUserdataAccess().getCityKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCityKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__9__Impl"


    // $ANTLR start "rule__Userdata__Group__10"
    // InternalResumeDsl.g:1299:1: rule__Userdata__Group__10 : rule__Userdata__Group__10__Impl rule__Userdata__Group__11 ;
    public final void rule__Userdata__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1303:1: ( rule__Userdata__Group__10__Impl rule__Userdata__Group__11 )
            // InternalResumeDsl.g:1304:2: rule__Userdata__Group__10__Impl rule__Userdata__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Userdata__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__10"


    // $ANTLR start "rule__Userdata__Group__10__Impl"
    // InternalResumeDsl.g:1311:1: rule__Userdata__Group__10__Impl : ( ( rule__Userdata__CityAssignment_10 ) ) ;
    public final void rule__Userdata__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1315:1: ( ( ( rule__Userdata__CityAssignment_10 ) ) )
            // InternalResumeDsl.g:1316:1: ( ( rule__Userdata__CityAssignment_10 ) )
            {
            // InternalResumeDsl.g:1316:1: ( ( rule__Userdata__CityAssignment_10 ) )
            // InternalResumeDsl.g:1317:2: ( rule__Userdata__CityAssignment_10 )
            {
             before(grammarAccess.getUserdataAccess().getCityAssignment_10()); 
            // InternalResumeDsl.g:1318:2: ( rule__Userdata__CityAssignment_10 )
            // InternalResumeDsl.g:1318:3: rule__Userdata__CityAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__CityAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getCityAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__10__Impl"


    // $ANTLR start "rule__Userdata__Group__11"
    // InternalResumeDsl.g:1326:1: rule__Userdata__Group__11 : rule__Userdata__Group__11__Impl rule__Userdata__Group__12 ;
    public final void rule__Userdata__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1330:1: ( rule__Userdata__Group__11__Impl rule__Userdata__Group__12 )
            // InternalResumeDsl.g:1331:2: rule__Userdata__Group__11__Impl rule__Userdata__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__11"


    // $ANTLR start "rule__Userdata__Group__11__Impl"
    // InternalResumeDsl.g:1338:1: rule__Userdata__Group__11__Impl : ( 'country:' ) ;
    public final void rule__Userdata__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1342:1: ( ( 'country:' ) )
            // InternalResumeDsl.g:1343:1: ( 'country:' )
            {
            // InternalResumeDsl.g:1343:1: ( 'country:' )
            // InternalResumeDsl.g:1344:2: 'country:'
            {
             before(grammarAccess.getUserdataAccess().getCountryKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCountryKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__11__Impl"


    // $ANTLR start "rule__Userdata__Group__12"
    // InternalResumeDsl.g:1353:1: rule__Userdata__Group__12 : rule__Userdata__Group__12__Impl ;
    public final void rule__Userdata__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1357:1: ( rule__Userdata__Group__12__Impl )
            // InternalResumeDsl.g:1358:2: rule__Userdata__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__12"


    // $ANTLR start "rule__Userdata__Group__12__Impl"
    // InternalResumeDsl.g:1364:1: rule__Userdata__Group__12__Impl : ( ( rule__Userdata__CountryAssignment_12 ) ) ;
    public final void rule__Userdata__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1368:1: ( ( ( rule__Userdata__CountryAssignment_12 ) ) )
            // InternalResumeDsl.g:1369:1: ( ( rule__Userdata__CountryAssignment_12 ) )
            {
            // InternalResumeDsl.g:1369:1: ( ( rule__Userdata__CountryAssignment_12 ) )
            // InternalResumeDsl.g:1370:2: ( rule__Userdata__CountryAssignment_12 )
            {
             before(grammarAccess.getUserdataAccess().getCountryAssignment_12()); 
            // InternalResumeDsl.g:1371:2: ( rule__Userdata__CountryAssignment_12 )
            // InternalResumeDsl.g:1371:3: rule__Userdata__CountryAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__CountryAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getCountryAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__12__Impl"


    // $ANTLR start "rule__Experience__Group__0"
    // InternalResumeDsl.g:1380:1: rule__Experience__Group__0 : rule__Experience__Group__0__Impl rule__Experience__Group__1 ;
    public final void rule__Experience__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1384:1: ( rule__Experience__Group__0__Impl rule__Experience__Group__1 )
            // InternalResumeDsl.g:1385:2: rule__Experience__Group__0__Impl rule__Experience__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Experience__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__0"


    // $ANTLR start "rule__Experience__Group__0__Impl"
    // InternalResumeDsl.g:1392:1: rule__Experience__Group__0__Impl : ( 'Experience' ) ;
    public final void rule__Experience__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1396:1: ( ( 'Experience' ) )
            // InternalResumeDsl.g:1397:1: ( 'Experience' )
            {
            // InternalResumeDsl.g:1397:1: ( 'Experience' )
            // InternalResumeDsl.g:1398:2: 'Experience'
            {
             before(grammarAccess.getExperienceAccess().getExperienceKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getExperienceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__0__Impl"


    // $ANTLR start "rule__Experience__Group__1"
    // InternalResumeDsl.g:1407:1: rule__Experience__Group__1 : rule__Experience__Group__1__Impl rule__Experience__Group__2 ;
    public final void rule__Experience__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1411:1: ( rule__Experience__Group__1__Impl rule__Experience__Group__2 )
            // InternalResumeDsl.g:1412:2: rule__Experience__Group__1__Impl rule__Experience__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Experience__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__1"


    // $ANTLR start "rule__Experience__Group__1__Impl"
    // InternalResumeDsl.g:1419:1: rule__Experience__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Experience__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1423:1: ( ( 'language:' ) )
            // InternalResumeDsl.g:1424:1: ( 'language:' )
            {
            // InternalResumeDsl.g:1424:1: ( 'language:' )
            // InternalResumeDsl.g:1425:2: 'language:'
            {
             before(grammarAccess.getExperienceAccess().getLanguageKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__1__Impl"


    // $ANTLR start "rule__Experience__Group__2"
    // InternalResumeDsl.g:1434:1: rule__Experience__Group__2 : rule__Experience__Group__2__Impl rule__Experience__Group__3 ;
    public final void rule__Experience__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1438:1: ( rule__Experience__Group__2__Impl rule__Experience__Group__3 )
            // InternalResumeDsl.g:1439:2: rule__Experience__Group__2__Impl rule__Experience__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Experience__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__2"


    // $ANTLR start "rule__Experience__Group__2__Impl"
    // InternalResumeDsl.g:1446:1: rule__Experience__Group__2__Impl : ( ( rule__Experience__LanguageAssignment_2 ) ) ;
    public final void rule__Experience__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1450:1: ( ( ( rule__Experience__LanguageAssignment_2 ) ) )
            // InternalResumeDsl.g:1451:1: ( ( rule__Experience__LanguageAssignment_2 ) )
            {
            // InternalResumeDsl.g:1451:1: ( ( rule__Experience__LanguageAssignment_2 ) )
            // InternalResumeDsl.g:1452:2: ( rule__Experience__LanguageAssignment_2 )
            {
             before(grammarAccess.getExperienceAccess().getLanguageAssignment_2()); 
            // InternalResumeDsl.g:1453:2: ( rule__Experience__LanguageAssignment_2 )
            // InternalResumeDsl.g:1453:3: rule__Experience__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Experience__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__2__Impl"


    // $ANTLR start "rule__Experience__Group__3"
    // InternalResumeDsl.g:1461:1: rule__Experience__Group__3 : rule__Experience__Group__3__Impl ;
    public final void rule__Experience__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1465:1: ( rule__Experience__Group__3__Impl )
            // InternalResumeDsl.g:1466:2: rule__Experience__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__3"


    // $ANTLR start "rule__Experience__Group__3__Impl"
    // InternalResumeDsl.g:1472:1: rule__Experience__Group__3__Impl : ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) ) ;
    public final void rule__Experience__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1476:1: ( ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) ) )
            // InternalResumeDsl.g:1477:1: ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) )
            {
            // InternalResumeDsl.g:1477:1: ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) )
            // InternalResumeDsl.g:1478:2: ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* )
            {
            // InternalResumeDsl.g:1478:2: ( ( rule__Experience__JobsAssignment_3 ) )
            // InternalResumeDsl.g:1479:3: ( rule__Experience__JobsAssignment_3 )
            {
             before(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 
            // InternalResumeDsl.g:1480:3: ( rule__Experience__JobsAssignment_3 )
            // InternalResumeDsl.g:1480:4: rule__Experience__JobsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__Experience__JobsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 

            }

            // InternalResumeDsl.g:1483:2: ( ( rule__Experience__JobsAssignment_3 )* )
            // InternalResumeDsl.g:1484:3: ( rule__Experience__JobsAssignment_3 )*
            {
             before(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 
            // InternalResumeDsl.g:1485:3: ( rule__Experience__JobsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalResumeDsl.g:1485:4: rule__Experience__JobsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Experience__JobsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__3__Impl"


    // $ANTLR start "rule__Job__Group__0"
    // InternalResumeDsl.g:1495:1: rule__Job__Group__0 : rule__Job__Group__0__Impl rule__Job__Group__1 ;
    public final void rule__Job__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1499:1: ( rule__Job__Group__0__Impl rule__Job__Group__1 )
            // InternalResumeDsl.g:1500:2: rule__Job__Group__0__Impl rule__Job__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__0"


    // $ANTLR start "rule__Job__Group__0__Impl"
    // InternalResumeDsl.g:1507:1: rule__Job__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Job__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1511:1: ( ( 'title:' ) )
            // InternalResumeDsl.g:1512:1: ( 'title:' )
            {
            // InternalResumeDsl.g:1512:1: ( 'title:' )
            // InternalResumeDsl.g:1513:2: 'title:'
            {
             before(grammarAccess.getJobAccess().getTitleKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__0__Impl"


    // $ANTLR start "rule__Job__Group__1"
    // InternalResumeDsl.g:1522:1: rule__Job__Group__1 : rule__Job__Group__1__Impl rule__Job__Group__2 ;
    public final void rule__Job__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1526:1: ( rule__Job__Group__1__Impl rule__Job__Group__2 )
            // InternalResumeDsl.g:1527:2: rule__Job__Group__1__Impl rule__Job__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Job__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__1"


    // $ANTLR start "rule__Job__Group__1__Impl"
    // InternalResumeDsl.g:1534:1: rule__Job__Group__1__Impl : ( ( rule__Job__TitleAssignment_1 ) ) ;
    public final void rule__Job__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1538:1: ( ( ( rule__Job__TitleAssignment_1 ) ) )
            // InternalResumeDsl.g:1539:1: ( ( rule__Job__TitleAssignment_1 ) )
            {
            // InternalResumeDsl.g:1539:1: ( ( rule__Job__TitleAssignment_1 ) )
            // InternalResumeDsl.g:1540:2: ( rule__Job__TitleAssignment_1 )
            {
             before(grammarAccess.getJobAccess().getTitleAssignment_1()); 
            // InternalResumeDsl.g:1541:2: ( rule__Job__TitleAssignment_1 )
            // InternalResumeDsl.g:1541:3: rule__Job__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Job__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__1__Impl"


    // $ANTLR start "rule__Job__Group__2"
    // InternalResumeDsl.g:1549:1: rule__Job__Group__2 : rule__Job__Group__2__Impl rule__Job__Group__3 ;
    public final void rule__Job__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1553:1: ( rule__Job__Group__2__Impl rule__Job__Group__3 )
            // InternalResumeDsl.g:1554:2: rule__Job__Group__2__Impl rule__Job__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Job__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__2"


    // $ANTLR start "rule__Job__Group__2__Impl"
    // InternalResumeDsl.g:1561:1: rule__Job__Group__2__Impl : ( 'description:' ) ;
    public final void rule__Job__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1565:1: ( ( 'description:' ) )
            // InternalResumeDsl.g:1566:1: ( 'description:' )
            {
            // InternalResumeDsl.g:1566:1: ( 'description:' )
            // InternalResumeDsl.g:1567:2: 'description:'
            {
             before(grammarAccess.getJobAccess().getDescriptionKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getDescriptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__2__Impl"


    // $ANTLR start "rule__Job__Group__3"
    // InternalResumeDsl.g:1576:1: rule__Job__Group__3 : rule__Job__Group__3__Impl rule__Job__Group__4 ;
    public final void rule__Job__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1580:1: ( rule__Job__Group__3__Impl rule__Job__Group__4 )
            // InternalResumeDsl.g:1581:2: rule__Job__Group__3__Impl rule__Job__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Job__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__3"


    // $ANTLR start "rule__Job__Group__3__Impl"
    // InternalResumeDsl.g:1588:1: rule__Job__Group__3__Impl : ( ( rule__Job__DescriptionAssignment_3 ) ) ;
    public final void rule__Job__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1592:1: ( ( ( rule__Job__DescriptionAssignment_3 ) ) )
            // InternalResumeDsl.g:1593:1: ( ( rule__Job__DescriptionAssignment_3 ) )
            {
            // InternalResumeDsl.g:1593:1: ( ( rule__Job__DescriptionAssignment_3 ) )
            // InternalResumeDsl.g:1594:2: ( rule__Job__DescriptionAssignment_3 )
            {
             before(grammarAccess.getJobAccess().getDescriptionAssignment_3()); 
            // InternalResumeDsl.g:1595:2: ( rule__Job__DescriptionAssignment_3 )
            // InternalResumeDsl.g:1595:3: rule__Job__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Job__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__3__Impl"


    // $ANTLR start "rule__Job__Group__4"
    // InternalResumeDsl.g:1603:1: rule__Job__Group__4 : rule__Job__Group__4__Impl rule__Job__Group__5 ;
    public final void rule__Job__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1607:1: ( rule__Job__Group__4__Impl rule__Job__Group__5 )
            // InternalResumeDsl.g:1608:2: rule__Job__Group__4__Impl rule__Job__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__4"


    // $ANTLR start "rule__Job__Group__4__Impl"
    // InternalResumeDsl.g:1615:1: rule__Job__Group__4__Impl : ( 'company:' ) ;
    public final void rule__Job__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1619:1: ( ( 'company:' ) )
            // InternalResumeDsl.g:1620:1: ( 'company:' )
            {
            // InternalResumeDsl.g:1620:1: ( 'company:' )
            // InternalResumeDsl.g:1621:2: 'company:'
            {
             before(grammarAccess.getJobAccess().getCompanyKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getCompanyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__4__Impl"


    // $ANTLR start "rule__Job__Group__5"
    // InternalResumeDsl.g:1630:1: rule__Job__Group__5 : rule__Job__Group__5__Impl rule__Job__Group__6 ;
    public final void rule__Job__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1634:1: ( rule__Job__Group__5__Impl rule__Job__Group__6 )
            // InternalResumeDsl.g:1635:2: rule__Job__Group__5__Impl rule__Job__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Job__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__5"


    // $ANTLR start "rule__Job__Group__5__Impl"
    // InternalResumeDsl.g:1642:1: rule__Job__Group__5__Impl : ( ( rule__Job__CompanyAssignment_5 ) ) ;
    public final void rule__Job__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1646:1: ( ( ( rule__Job__CompanyAssignment_5 ) ) )
            // InternalResumeDsl.g:1647:1: ( ( rule__Job__CompanyAssignment_5 ) )
            {
            // InternalResumeDsl.g:1647:1: ( ( rule__Job__CompanyAssignment_5 ) )
            // InternalResumeDsl.g:1648:2: ( rule__Job__CompanyAssignment_5 )
            {
             before(grammarAccess.getJobAccess().getCompanyAssignment_5()); 
            // InternalResumeDsl.g:1649:2: ( rule__Job__CompanyAssignment_5 )
            // InternalResumeDsl.g:1649:3: rule__Job__CompanyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Job__CompanyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getCompanyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__5__Impl"


    // $ANTLR start "rule__Job__Group__6"
    // InternalResumeDsl.g:1657:1: rule__Job__Group__6 : rule__Job__Group__6__Impl rule__Job__Group__7 ;
    public final void rule__Job__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1661:1: ( rule__Job__Group__6__Impl rule__Job__Group__7 )
            // InternalResumeDsl.g:1662:2: rule__Job__Group__6__Impl rule__Job__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__6"


    // $ANTLR start "rule__Job__Group__6__Impl"
    // InternalResumeDsl.g:1669:1: rule__Job__Group__6__Impl : ( 'startDate:' ) ;
    public final void rule__Job__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1673:1: ( ( 'startDate:' ) )
            // InternalResumeDsl.g:1674:1: ( 'startDate:' )
            {
            // InternalResumeDsl.g:1674:1: ( 'startDate:' )
            // InternalResumeDsl.g:1675:2: 'startDate:'
            {
             before(grammarAccess.getJobAccess().getStartDateKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getStartDateKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__6__Impl"


    // $ANTLR start "rule__Job__Group__7"
    // InternalResumeDsl.g:1684:1: rule__Job__Group__7 : rule__Job__Group__7__Impl rule__Job__Group__8 ;
    public final void rule__Job__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1688:1: ( rule__Job__Group__7__Impl rule__Job__Group__8 )
            // InternalResumeDsl.g:1689:2: rule__Job__Group__7__Impl rule__Job__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Job__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__7"


    // $ANTLR start "rule__Job__Group__7__Impl"
    // InternalResumeDsl.g:1696:1: rule__Job__Group__7__Impl : ( ( rule__Job__StartDateAssignment_7 ) ) ;
    public final void rule__Job__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1700:1: ( ( ( rule__Job__StartDateAssignment_7 ) ) )
            // InternalResumeDsl.g:1701:1: ( ( rule__Job__StartDateAssignment_7 ) )
            {
            // InternalResumeDsl.g:1701:1: ( ( rule__Job__StartDateAssignment_7 ) )
            // InternalResumeDsl.g:1702:2: ( rule__Job__StartDateAssignment_7 )
            {
             before(grammarAccess.getJobAccess().getStartDateAssignment_7()); 
            // InternalResumeDsl.g:1703:2: ( rule__Job__StartDateAssignment_7 )
            // InternalResumeDsl.g:1703:3: rule__Job__StartDateAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Job__StartDateAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getStartDateAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__7__Impl"


    // $ANTLR start "rule__Job__Group__8"
    // InternalResumeDsl.g:1711:1: rule__Job__Group__8 : rule__Job__Group__8__Impl rule__Job__Group__9 ;
    public final void rule__Job__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1715:1: ( rule__Job__Group__8__Impl rule__Job__Group__9 )
            // InternalResumeDsl.g:1716:2: rule__Job__Group__8__Impl rule__Job__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__8"


    // $ANTLR start "rule__Job__Group__8__Impl"
    // InternalResumeDsl.g:1723:1: rule__Job__Group__8__Impl : ( 'endDate:' ) ;
    public final void rule__Job__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1727:1: ( ( 'endDate:' ) )
            // InternalResumeDsl.g:1728:1: ( 'endDate:' )
            {
            // InternalResumeDsl.g:1728:1: ( 'endDate:' )
            // InternalResumeDsl.g:1729:2: 'endDate:'
            {
             before(grammarAccess.getJobAccess().getEndDateKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getEndDateKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__8__Impl"


    // $ANTLR start "rule__Job__Group__9"
    // InternalResumeDsl.g:1738:1: rule__Job__Group__9 : rule__Job__Group__9__Impl rule__Job__Group__10 ;
    public final void rule__Job__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1742:1: ( rule__Job__Group__9__Impl rule__Job__Group__10 )
            // InternalResumeDsl.g:1743:2: rule__Job__Group__9__Impl rule__Job__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Job__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__9"


    // $ANTLR start "rule__Job__Group__9__Impl"
    // InternalResumeDsl.g:1750:1: rule__Job__Group__9__Impl : ( ( rule__Job__EndDateAssignment_9 ) ) ;
    public final void rule__Job__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1754:1: ( ( ( rule__Job__EndDateAssignment_9 ) ) )
            // InternalResumeDsl.g:1755:1: ( ( rule__Job__EndDateAssignment_9 ) )
            {
            // InternalResumeDsl.g:1755:1: ( ( rule__Job__EndDateAssignment_9 ) )
            // InternalResumeDsl.g:1756:2: ( rule__Job__EndDateAssignment_9 )
            {
             before(grammarAccess.getJobAccess().getEndDateAssignment_9()); 
            // InternalResumeDsl.g:1757:2: ( rule__Job__EndDateAssignment_9 )
            // InternalResumeDsl.g:1757:3: rule__Job__EndDateAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Job__EndDateAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getEndDateAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__9__Impl"


    // $ANTLR start "rule__Job__Group__10"
    // InternalResumeDsl.g:1765:1: rule__Job__Group__10 : rule__Job__Group__10__Impl rule__Job__Group__11 ;
    public final void rule__Job__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1769:1: ( rule__Job__Group__10__Impl rule__Job__Group__11 )
            // InternalResumeDsl.g:1770:2: rule__Job__Group__10__Impl rule__Job__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Job__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__10"


    // $ANTLR start "rule__Job__Group__10__Impl"
    // InternalResumeDsl.g:1777:1: rule__Job__Group__10__Impl : ( 'tags:' ) ;
    public final void rule__Job__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1781:1: ( ( 'tags:' ) )
            // InternalResumeDsl.g:1782:1: ( 'tags:' )
            {
            // InternalResumeDsl.g:1782:1: ( 'tags:' )
            // InternalResumeDsl.g:1783:2: 'tags:'
            {
             before(grammarAccess.getJobAccess().getTagsKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getTagsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__10__Impl"


    // $ANTLR start "rule__Job__Group__11"
    // InternalResumeDsl.g:1792:1: rule__Job__Group__11 : rule__Job__Group__11__Impl ;
    public final void rule__Job__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1796:1: ( rule__Job__Group__11__Impl )
            // InternalResumeDsl.g:1797:2: rule__Job__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Job__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__11"


    // $ANTLR start "rule__Job__Group__11__Impl"
    // InternalResumeDsl.g:1803:1: rule__Job__Group__11__Impl : ( ( rule__Job__TagsAssignment_11 ) ) ;
    public final void rule__Job__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1807:1: ( ( ( rule__Job__TagsAssignment_11 ) ) )
            // InternalResumeDsl.g:1808:1: ( ( rule__Job__TagsAssignment_11 ) )
            {
            // InternalResumeDsl.g:1808:1: ( ( rule__Job__TagsAssignment_11 ) )
            // InternalResumeDsl.g:1809:2: ( rule__Job__TagsAssignment_11 )
            {
             before(grammarAccess.getJobAccess().getTagsAssignment_11()); 
            // InternalResumeDsl.g:1810:2: ( rule__Job__TagsAssignment_11 )
            // InternalResumeDsl.g:1810:3: rule__Job__TagsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Job__TagsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getTagsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__11__Impl"


    // $ANTLR start "rule__Projects__Group__0"
    // InternalResumeDsl.g:1819:1: rule__Projects__Group__0 : rule__Projects__Group__0__Impl rule__Projects__Group__1 ;
    public final void rule__Projects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1823:1: ( rule__Projects__Group__0__Impl rule__Projects__Group__1 )
            // InternalResumeDsl.g:1824:2: rule__Projects__Group__0__Impl rule__Projects__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Projects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__0"


    // $ANTLR start "rule__Projects__Group__0__Impl"
    // InternalResumeDsl.g:1831:1: rule__Projects__Group__0__Impl : ( 'Projects' ) ;
    public final void rule__Projects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1835:1: ( ( 'Projects' ) )
            // InternalResumeDsl.g:1836:1: ( 'Projects' )
            {
            // InternalResumeDsl.g:1836:1: ( 'Projects' )
            // InternalResumeDsl.g:1837:2: 'Projects'
            {
             before(grammarAccess.getProjectsAccess().getProjectsKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProjectsAccess().getProjectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__0__Impl"


    // $ANTLR start "rule__Projects__Group__1"
    // InternalResumeDsl.g:1846:1: rule__Projects__Group__1 : rule__Projects__Group__1__Impl rule__Projects__Group__2 ;
    public final void rule__Projects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1850:1: ( rule__Projects__Group__1__Impl rule__Projects__Group__2 )
            // InternalResumeDsl.g:1851:2: rule__Projects__Group__1__Impl rule__Projects__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Projects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projects__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__1"


    // $ANTLR start "rule__Projects__Group__1__Impl"
    // InternalResumeDsl.g:1858:1: rule__Projects__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Projects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1862:1: ( ( 'language:' ) )
            // InternalResumeDsl.g:1863:1: ( 'language:' )
            {
            // InternalResumeDsl.g:1863:1: ( 'language:' )
            // InternalResumeDsl.g:1864:2: 'language:'
            {
             before(grammarAccess.getProjectsAccess().getLanguageKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProjectsAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__1__Impl"


    // $ANTLR start "rule__Projects__Group__2"
    // InternalResumeDsl.g:1873:1: rule__Projects__Group__2 : rule__Projects__Group__2__Impl rule__Projects__Group__3 ;
    public final void rule__Projects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1877:1: ( rule__Projects__Group__2__Impl rule__Projects__Group__3 )
            // InternalResumeDsl.g:1878:2: rule__Projects__Group__2__Impl rule__Projects__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Projects__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projects__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__2"


    // $ANTLR start "rule__Projects__Group__2__Impl"
    // InternalResumeDsl.g:1885:1: rule__Projects__Group__2__Impl : ( ( rule__Projects__LanguageAssignment_2 ) ) ;
    public final void rule__Projects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1889:1: ( ( ( rule__Projects__LanguageAssignment_2 ) ) )
            // InternalResumeDsl.g:1890:1: ( ( rule__Projects__LanguageAssignment_2 ) )
            {
            // InternalResumeDsl.g:1890:1: ( ( rule__Projects__LanguageAssignment_2 ) )
            // InternalResumeDsl.g:1891:2: ( rule__Projects__LanguageAssignment_2 )
            {
             before(grammarAccess.getProjectsAccess().getLanguageAssignment_2()); 
            // InternalResumeDsl.g:1892:2: ( rule__Projects__LanguageAssignment_2 )
            // InternalResumeDsl.g:1892:3: rule__Projects__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Projects__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectsAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__2__Impl"


    // $ANTLR start "rule__Projects__Group__3"
    // InternalResumeDsl.g:1900:1: rule__Projects__Group__3 : rule__Projects__Group__3__Impl ;
    public final void rule__Projects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1904:1: ( rule__Projects__Group__3__Impl )
            // InternalResumeDsl.g:1905:2: rule__Projects__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Projects__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__3"


    // $ANTLR start "rule__Projects__Group__3__Impl"
    // InternalResumeDsl.g:1911:1: rule__Projects__Group__3__Impl : ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) ) ;
    public final void rule__Projects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1915:1: ( ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) ) )
            // InternalResumeDsl.g:1916:1: ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) )
            {
            // InternalResumeDsl.g:1916:1: ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) )
            // InternalResumeDsl.g:1917:2: ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* )
            {
            // InternalResumeDsl.g:1917:2: ( ( rule__Projects__ProjectsAssignment_3 ) )
            // InternalResumeDsl.g:1918:3: ( rule__Projects__ProjectsAssignment_3 )
            {
             before(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 
            // InternalResumeDsl.g:1919:3: ( rule__Projects__ProjectsAssignment_3 )
            // InternalResumeDsl.g:1919:4: rule__Projects__ProjectsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__Projects__ProjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 

            }

            // InternalResumeDsl.g:1922:2: ( ( rule__Projects__ProjectsAssignment_3 )* )
            // InternalResumeDsl.g:1923:3: ( rule__Projects__ProjectsAssignment_3 )*
            {
             before(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 
            // InternalResumeDsl.g:1924:3: ( rule__Projects__ProjectsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalResumeDsl.g:1924:4: rule__Projects__ProjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Projects__ProjectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalResumeDsl.g:1934:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1938:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalResumeDsl.g:1939:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalResumeDsl.g:1946:1: rule__Project__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1950:1: ( ( 'title:' ) )
            // InternalResumeDsl.g:1951:1: ( 'title:' )
            {
            // InternalResumeDsl.g:1951:1: ( 'title:' )
            // InternalResumeDsl.g:1952:2: 'title:'
            {
             before(grammarAccess.getProjectAccess().getTitleKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalResumeDsl.g:1961:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1965:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalResumeDsl.g:1966:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalResumeDsl.g:1973:1: rule__Project__Group__1__Impl : ( ( rule__Project__TitleAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1977:1: ( ( ( rule__Project__TitleAssignment_1 ) ) )
            // InternalResumeDsl.g:1978:1: ( ( rule__Project__TitleAssignment_1 ) )
            {
            // InternalResumeDsl.g:1978:1: ( ( rule__Project__TitleAssignment_1 ) )
            // InternalResumeDsl.g:1979:2: ( rule__Project__TitleAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getTitleAssignment_1()); 
            // InternalResumeDsl.g:1980:2: ( rule__Project__TitleAssignment_1 )
            // InternalResumeDsl.g:1980:3: rule__Project__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalResumeDsl.g:1988:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:1992:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalResumeDsl.g:1993:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalResumeDsl.g:2000:1: rule__Project__Group__2__Impl : ( 'description:' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2004:1: ( ( 'description:' ) )
            // InternalResumeDsl.g:2005:1: ( 'description:' )
            {
            // InternalResumeDsl.g:2005:1: ( 'description:' )
            // InternalResumeDsl.g:2006:2: 'description:'
            {
             before(grammarAccess.getProjectAccess().getDescriptionKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getDescriptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalResumeDsl.g:2015:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2019:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalResumeDsl.g:2020:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalResumeDsl.g:2027:1: rule__Project__Group__3__Impl : ( ( rule__Project__DescriptionAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2031:1: ( ( ( rule__Project__DescriptionAssignment_3 ) ) )
            // InternalResumeDsl.g:2032:1: ( ( rule__Project__DescriptionAssignment_3 ) )
            {
            // InternalResumeDsl.g:2032:1: ( ( rule__Project__DescriptionAssignment_3 ) )
            // InternalResumeDsl.g:2033:2: ( rule__Project__DescriptionAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getDescriptionAssignment_3()); 
            // InternalResumeDsl.g:2034:2: ( rule__Project__DescriptionAssignment_3 )
            // InternalResumeDsl.g:2034:3: rule__Project__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalResumeDsl.g:2042:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2046:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalResumeDsl.g:2047:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalResumeDsl.g:2054:1: rule__Project__Group__4__Impl : ( 'technologies:' ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2058:1: ( ( 'technologies:' ) )
            // InternalResumeDsl.g:2059:1: ( 'technologies:' )
            {
            // InternalResumeDsl.g:2059:1: ( 'technologies:' )
            // InternalResumeDsl.g:2060:2: 'technologies:'
            {
             before(grammarAccess.getProjectAccess().getTechnologiesKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTechnologiesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalResumeDsl.g:2069:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2073:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalResumeDsl.g:2074:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalResumeDsl.g:2081:1: rule__Project__Group__5__Impl : ( ( rule__Project__TechnologiesAssignment_5 ) ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2085:1: ( ( ( rule__Project__TechnologiesAssignment_5 ) ) )
            // InternalResumeDsl.g:2086:1: ( ( rule__Project__TechnologiesAssignment_5 ) )
            {
            // InternalResumeDsl.g:2086:1: ( ( rule__Project__TechnologiesAssignment_5 ) )
            // InternalResumeDsl.g:2087:2: ( rule__Project__TechnologiesAssignment_5 )
            {
             before(grammarAccess.getProjectAccess().getTechnologiesAssignment_5()); 
            // InternalResumeDsl.g:2088:2: ( rule__Project__TechnologiesAssignment_5 )
            // InternalResumeDsl.g:2088:3: rule__Project__TechnologiesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Project__TechnologiesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTechnologiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalResumeDsl.g:2096:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2100:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // InternalResumeDsl.g:2101:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalResumeDsl.g:2108:1: rule__Project__Group__6__Impl : ( 'link:' ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2112:1: ( ( 'link:' ) )
            // InternalResumeDsl.g:2113:1: ( 'link:' )
            {
            // InternalResumeDsl.g:2113:1: ( 'link:' )
            // InternalResumeDsl.g:2114:2: 'link:'
            {
             before(grammarAccess.getProjectAccess().getLinkKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLinkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // InternalResumeDsl.g:2123:1: rule__Project__Group__7 : rule__Project__Group__7__Impl rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2127:1: ( rule__Project__Group__7__Impl rule__Project__Group__8 )
            // InternalResumeDsl.g:2128:2: rule__Project__Group__7__Impl rule__Project__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Project__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // InternalResumeDsl.g:2135:1: rule__Project__Group__7__Impl : ( ( rule__Project__LinkAssignment_7 ) ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2139:1: ( ( ( rule__Project__LinkAssignment_7 ) ) )
            // InternalResumeDsl.g:2140:1: ( ( rule__Project__LinkAssignment_7 ) )
            {
            // InternalResumeDsl.g:2140:1: ( ( rule__Project__LinkAssignment_7 ) )
            // InternalResumeDsl.g:2141:2: ( rule__Project__LinkAssignment_7 )
            {
             before(grammarAccess.getProjectAccess().getLinkAssignment_7()); 
            // InternalResumeDsl.g:2142:2: ( rule__Project__LinkAssignment_7 )
            // InternalResumeDsl.g:2142:3: rule__Project__LinkAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Project__LinkAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getLinkAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group__8"
    // InternalResumeDsl.g:2150:1: rule__Project__Group__8 : rule__Project__Group__8__Impl rule__Project__Group__9 ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2154:1: ( rule__Project__Group__8__Impl rule__Project__Group__9 )
            // InternalResumeDsl.g:2155:2: rule__Project__Group__8__Impl rule__Project__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Project__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__8"


    // $ANTLR start "rule__Project__Group__8__Impl"
    // InternalResumeDsl.g:2162:1: rule__Project__Group__8__Impl : ( 'tags:' ) ;
    public final void rule__Project__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2166:1: ( ( 'tags:' ) )
            // InternalResumeDsl.g:2167:1: ( 'tags:' )
            {
            // InternalResumeDsl.g:2167:1: ( 'tags:' )
            // InternalResumeDsl.g:2168:2: 'tags:'
            {
             before(grammarAccess.getProjectAccess().getTagsKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTagsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__8__Impl"


    // $ANTLR start "rule__Project__Group__9"
    // InternalResumeDsl.g:2177:1: rule__Project__Group__9 : rule__Project__Group__9__Impl ;
    public final void rule__Project__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2181:1: ( rule__Project__Group__9__Impl )
            // InternalResumeDsl.g:2182:2: rule__Project__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__9"


    // $ANTLR start "rule__Project__Group__9__Impl"
    // InternalResumeDsl.g:2188:1: rule__Project__Group__9__Impl : ( ( rule__Project__TagsAssignment_9 ) ) ;
    public final void rule__Project__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2192:1: ( ( ( rule__Project__TagsAssignment_9 ) ) )
            // InternalResumeDsl.g:2193:1: ( ( rule__Project__TagsAssignment_9 ) )
            {
            // InternalResumeDsl.g:2193:1: ( ( rule__Project__TagsAssignment_9 ) )
            // InternalResumeDsl.g:2194:2: ( rule__Project__TagsAssignment_9 )
            {
             before(grammarAccess.getProjectAccess().getTagsAssignment_9()); 
            // InternalResumeDsl.g:2195:2: ( rule__Project__TagsAssignment_9 )
            // InternalResumeDsl.g:2195:3: rule__Project__TagsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Project__TagsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTagsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__9__Impl"


    // $ANTLR start "rule__Education__Group__0"
    // InternalResumeDsl.g:2204:1: rule__Education__Group__0 : rule__Education__Group__0__Impl rule__Education__Group__1 ;
    public final void rule__Education__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2208:1: ( rule__Education__Group__0__Impl rule__Education__Group__1 )
            // InternalResumeDsl.g:2209:2: rule__Education__Group__0__Impl rule__Education__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Education__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Education__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__0"


    // $ANTLR start "rule__Education__Group__0__Impl"
    // InternalResumeDsl.g:2216:1: rule__Education__Group__0__Impl : ( 'Education' ) ;
    public final void rule__Education__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2220:1: ( ( 'Education' ) )
            // InternalResumeDsl.g:2221:1: ( 'Education' )
            {
            // InternalResumeDsl.g:2221:1: ( 'Education' )
            // InternalResumeDsl.g:2222:2: 'Education'
            {
             before(grammarAccess.getEducationAccess().getEducationKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEducationAccess().getEducationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__0__Impl"


    // $ANTLR start "rule__Education__Group__1"
    // InternalResumeDsl.g:2231:1: rule__Education__Group__1 : rule__Education__Group__1__Impl rule__Education__Group__2 ;
    public final void rule__Education__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2235:1: ( rule__Education__Group__1__Impl rule__Education__Group__2 )
            // InternalResumeDsl.g:2236:2: rule__Education__Group__1__Impl rule__Education__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Education__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Education__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__1"


    // $ANTLR start "rule__Education__Group__1__Impl"
    // InternalResumeDsl.g:2243:1: rule__Education__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Education__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2247:1: ( ( 'language:' ) )
            // InternalResumeDsl.g:2248:1: ( 'language:' )
            {
            // InternalResumeDsl.g:2248:1: ( 'language:' )
            // InternalResumeDsl.g:2249:2: 'language:'
            {
             before(grammarAccess.getEducationAccess().getLanguageKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEducationAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__1__Impl"


    // $ANTLR start "rule__Education__Group__2"
    // InternalResumeDsl.g:2258:1: rule__Education__Group__2 : rule__Education__Group__2__Impl rule__Education__Group__3 ;
    public final void rule__Education__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2262:1: ( rule__Education__Group__2__Impl rule__Education__Group__3 )
            // InternalResumeDsl.g:2263:2: rule__Education__Group__2__Impl rule__Education__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Education__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Education__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__2"


    // $ANTLR start "rule__Education__Group__2__Impl"
    // InternalResumeDsl.g:2270:1: rule__Education__Group__2__Impl : ( ( rule__Education__LanguageAssignment_2 ) ) ;
    public final void rule__Education__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2274:1: ( ( ( rule__Education__LanguageAssignment_2 ) ) )
            // InternalResumeDsl.g:2275:1: ( ( rule__Education__LanguageAssignment_2 ) )
            {
            // InternalResumeDsl.g:2275:1: ( ( rule__Education__LanguageAssignment_2 ) )
            // InternalResumeDsl.g:2276:2: ( rule__Education__LanguageAssignment_2 )
            {
             before(grammarAccess.getEducationAccess().getLanguageAssignment_2()); 
            // InternalResumeDsl.g:2277:2: ( rule__Education__LanguageAssignment_2 )
            // InternalResumeDsl.g:2277:3: rule__Education__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Education__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEducationAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__2__Impl"


    // $ANTLR start "rule__Education__Group__3"
    // InternalResumeDsl.g:2285:1: rule__Education__Group__3 : rule__Education__Group__3__Impl ;
    public final void rule__Education__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2289:1: ( rule__Education__Group__3__Impl )
            // InternalResumeDsl.g:2290:2: rule__Education__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Education__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__3"


    // $ANTLR start "rule__Education__Group__3__Impl"
    // InternalResumeDsl.g:2296:1: rule__Education__Group__3__Impl : ( ( rule__Education__DegreesAssignment_3 )* ) ;
    public final void rule__Education__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2300:1: ( ( ( rule__Education__DegreesAssignment_3 )* ) )
            // InternalResumeDsl.g:2301:1: ( ( rule__Education__DegreesAssignment_3 )* )
            {
            // InternalResumeDsl.g:2301:1: ( ( rule__Education__DegreesAssignment_3 )* )
            // InternalResumeDsl.g:2302:2: ( rule__Education__DegreesAssignment_3 )*
            {
             before(grammarAccess.getEducationAccess().getDegreesAssignment_3()); 
            // InternalResumeDsl.g:2303:2: ( rule__Education__DegreesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalResumeDsl.g:2303:3: rule__Education__DegreesAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Education__DegreesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEducationAccess().getDegreesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__3__Impl"


    // $ANTLR start "rule__Degree__Group__0"
    // InternalResumeDsl.g:2312:1: rule__Degree__Group__0 : rule__Degree__Group__0__Impl rule__Degree__Group__1 ;
    public final void rule__Degree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2316:1: ( rule__Degree__Group__0__Impl rule__Degree__Group__1 )
            // InternalResumeDsl.g:2317:2: rule__Degree__Group__0__Impl rule__Degree__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__0"


    // $ANTLR start "rule__Degree__Group__0__Impl"
    // InternalResumeDsl.g:2324:1: rule__Degree__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Degree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2328:1: ( ( 'title:' ) )
            // InternalResumeDsl.g:2329:1: ( 'title:' )
            {
            // InternalResumeDsl.g:2329:1: ( 'title:' )
            // InternalResumeDsl.g:2330:2: 'title:'
            {
             before(grammarAccess.getDegreeAccess().getTitleKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__0__Impl"


    // $ANTLR start "rule__Degree__Group__1"
    // InternalResumeDsl.g:2339:1: rule__Degree__Group__1 : rule__Degree__Group__1__Impl rule__Degree__Group__2 ;
    public final void rule__Degree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2343:1: ( rule__Degree__Group__1__Impl rule__Degree__Group__2 )
            // InternalResumeDsl.g:2344:2: rule__Degree__Group__1__Impl rule__Degree__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Degree__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__1"


    // $ANTLR start "rule__Degree__Group__1__Impl"
    // InternalResumeDsl.g:2351:1: rule__Degree__Group__1__Impl : ( ( rule__Degree__TitleAssignment_1 ) ) ;
    public final void rule__Degree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2355:1: ( ( ( rule__Degree__TitleAssignment_1 ) ) )
            // InternalResumeDsl.g:2356:1: ( ( rule__Degree__TitleAssignment_1 ) )
            {
            // InternalResumeDsl.g:2356:1: ( ( rule__Degree__TitleAssignment_1 ) )
            // InternalResumeDsl.g:2357:2: ( rule__Degree__TitleAssignment_1 )
            {
             before(grammarAccess.getDegreeAccess().getTitleAssignment_1()); 
            // InternalResumeDsl.g:2358:2: ( rule__Degree__TitleAssignment_1 )
            // InternalResumeDsl.g:2358:3: rule__Degree__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Degree__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__1__Impl"


    // $ANTLR start "rule__Degree__Group__2"
    // InternalResumeDsl.g:2366:1: rule__Degree__Group__2 : rule__Degree__Group__2__Impl rule__Degree__Group__3 ;
    public final void rule__Degree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2370:1: ( rule__Degree__Group__2__Impl rule__Degree__Group__3 )
            // InternalResumeDsl.g:2371:2: rule__Degree__Group__2__Impl rule__Degree__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__2"


    // $ANTLR start "rule__Degree__Group__2__Impl"
    // InternalResumeDsl.g:2378:1: rule__Degree__Group__2__Impl : ( 'institution:' ) ;
    public final void rule__Degree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2382:1: ( ( 'institution:' ) )
            // InternalResumeDsl.g:2383:1: ( 'institution:' )
            {
            // InternalResumeDsl.g:2383:1: ( 'institution:' )
            // InternalResumeDsl.g:2384:2: 'institution:'
            {
             before(grammarAccess.getDegreeAccess().getInstitutionKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getInstitutionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__2__Impl"


    // $ANTLR start "rule__Degree__Group__3"
    // InternalResumeDsl.g:2393:1: rule__Degree__Group__3 : rule__Degree__Group__3__Impl rule__Degree__Group__4 ;
    public final void rule__Degree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2397:1: ( rule__Degree__Group__3__Impl rule__Degree__Group__4 )
            // InternalResumeDsl.g:2398:2: rule__Degree__Group__3__Impl rule__Degree__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Degree__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__3"


    // $ANTLR start "rule__Degree__Group__3__Impl"
    // InternalResumeDsl.g:2405:1: rule__Degree__Group__3__Impl : ( ( rule__Degree__InstitutionAssignment_3 ) ) ;
    public final void rule__Degree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2409:1: ( ( ( rule__Degree__InstitutionAssignment_3 ) ) )
            // InternalResumeDsl.g:2410:1: ( ( rule__Degree__InstitutionAssignment_3 ) )
            {
            // InternalResumeDsl.g:2410:1: ( ( rule__Degree__InstitutionAssignment_3 ) )
            // InternalResumeDsl.g:2411:2: ( rule__Degree__InstitutionAssignment_3 )
            {
             before(grammarAccess.getDegreeAccess().getInstitutionAssignment_3()); 
            // InternalResumeDsl.g:2412:2: ( rule__Degree__InstitutionAssignment_3 )
            // InternalResumeDsl.g:2412:3: rule__Degree__InstitutionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Degree__InstitutionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getInstitutionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__3__Impl"


    // $ANTLR start "rule__Degree__Group__4"
    // InternalResumeDsl.g:2420:1: rule__Degree__Group__4 : rule__Degree__Group__4__Impl rule__Degree__Group__5 ;
    public final void rule__Degree__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2424:1: ( rule__Degree__Group__4__Impl rule__Degree__Group__5 )
            // InternalResumeDsl.g:2425:2: rule__Degree__Group__4__Impl rule__Degree__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__4"


    // $ANTLR start "rule__Degree__Group__4__Impl"
    // InternalResumeDsl.g:2432:1: rule__Degree__Group__4__Impl : ( 'graduationDate:' ) ;
    public final void rule__Degree__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2436:1: ( ( 'graduationDate:' ) )
            // InternalResumeDsl.g:2437:1: ( 'graduationDate:' )
            {
            // InternalResumeDsl.g:2437:1: ( 'graduationDate:' )
            // InternalResumeDsl.g:2438:2: 'graduationDate:'
            {
             before(grammarAccess.getDegreeAccess().getGraduationDateKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getGraduationDateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__4__Impl"


    // $ANTLR start "rule__Degree__Group__5"
    // InternalResumeDsl.g:2447:1: rule__Degree__Group__5 : rule__Degree__Group__5__Impl rule__Degree__Group__6 ;
    public final void rule__Degree__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2451:1: ( rule__Degree__Group__5__Impl rule__Degree__Group__6 )
            // InternalResumeDsl.g:2452:2: rule__Degree__Group__5__Impl rule__Degree__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Degree__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__5"


    // $ANTLR start "rule__Degree__Group__5__Impl"
    // InternalResumeDsl.g:2459:1: rule__Degree__Group__5__Impl : ( ( rule__Degree__GraduationDateAssignment_5 ) ) ;
    public final void rule__Degree__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2463:1: ( ( ( rule__Degree__GraduationDateAssignment_5 ) ) )
            // InternalResumeDsl.g:2464:1: ( ( rule__Degree__GraduationDateAssignment_5 ) )
            {
            // InternalResumeDsl.g:2464:1: ( ( rule__Degree__GraduationDateAssignment_5 ) )
            // InternalResumeDsl.g:2465:2: ( rule__Degree__GraduationDateAssignment_5 )
            {
             before(grammarAccess.getDegreeAccess().getGraduationDateAssignment_5()); 
            // InternalResumeDsl.g:2466:2: ( rule__Degree__GraduationDateAssignment_5 )
            // InternalResumeDsl.g:2466:3: rule__Degree__GraduationDateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Degree__GraduationDateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getGraduationDateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__5__Impl"


    // $ANTLR start "rule__Degree__Group__6"
    // InternalResumeDsl.g:2474:1: rule__Degree__Group__6 : rule__Degree__Group__6__Impl rule__Degree__Group__7 ;
    public final void rule__Degree__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2478:1: ( rule__Degree__Group__6__Impl rule__Degree__Group__7 )
            // InternalResumeDsl.g:2479:2: rule__Degree__Group__6__Impl rule__Degree__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__6"


    // $ANTLR start "rule__Degree__Group__6__Impl"
    // InternalResumeDsl.g:2486:1: rule__Degree__Group__6__Impl : ( 'country:' ) ;
    public final void rule__Degree__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2490:1: ( ( 'country:' ) )
            // InternalResumeDsl.g:2491:1: ( 'country:' )
            {
            // InternalResumeDsl.g:2491:1: ( 'country:' )
            // InternalResumeDsl.g:2492:2: 'country:'
            {
             before(grammarAccess.getDegreeAccess().getCountryKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getCountryKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__6__Impl"


    // $ANTLR start "rule__Degree__Group__7"
    // InternalResumeDsl.g:2501:1: rule__Degree__Group__7 : rule__Degree__Group__7__Impl rule__Degree__Group__8 ;
    public final void rule__Degree__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2505:1: ( rule__Degree__Group__7__Impl rule__Degree__Group__8 )
            // InternalResumeDsl.g:2506:2: rule__Degree__Group__7__Impl rule__Degree__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Degree__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__7"


    // $ANTLR start "rule__Degree__Group__7__Impl"
    // InternalResumeDsl.g:2513:1: rule__Degree__Group__7__Impl : ( ( rule__Degree__CountryAssignment_7 ) ) ;
    public final void rule__Degree__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2517:1: ( ( ( rule__Degree__CountryAssignment_7 ) ) )
            // InternalResumeDsl.g:2518:1: ( ( rule__Degree__CountryAssignment_7 ) )
            {
            // InternalResumeDsl.g:2518:1: ( ( rule__Degree__CountryAssignment_7 ) )
            // InternalResumeDsl.g:2519:2: ( rule__Degree__CountryAssignment_7 )
            {
             before(grammarAccess.getDegreeAccess().getCountryAssignment_7()); 
            // InternalResumeDsl.g:2520:2: ( rule__Degree__CountryAssignment_7 )
            // InternalResumeDsl.g:2520:3: rule__Degree__CountryAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Degree__CountryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getCountryAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__7__Impl"


    // $ANTLR start "rule__Degree__Group__8"
    // InternalResumeDsl.g:2528:1: rule__Degree__Group__8 : rule__Degree__Group__8__Impl rule__Degree__Group__9 ;
    public final void rule__Degree__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2532:1: ( rule__Degree__Group__8__Impl rule__Degree__Group__9 )
            // InternalResumeDsl.g:2533:2: rule__Degree__Group__8__Impl rule__Degree__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Degree__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__8"


    // $ANTLR start "rule__Degree__Group__8__Impl"
    // InternalResumeDsl.g:2540:1: rule__Degree__Group__8__Impl : ( 'tags:' ) ;
    public final void rule__Degree__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2544:1: ( ( 'tags:' ) )
            // InternalResumeDsl.g:2545:1: ( 'tags:' )
            {
            // InternalResumeDsl.g:2545:1: ( 'tags:' )
            // InternalResumeDsl.g:2546:2: 'tags:'
            {
             before(grammarAccess.getDegreeAccess().getTagsKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getTagsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__8__Impl"


    // $ANTLR start "rule__Degree__Group__9"
    // InternalResumeDsl.g:2555:1: rule__Degree__Group__9 : rule__Degree__Group__9__Impl ;
    public final void rule__Degree__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2559:1: ( rule__Degree__Group__9__Impl )
            // InternalResumeDsl.g:2560:2: rule__Degree__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Degree__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__9"


    // $ANTLR start "rule__Degree__Group__9__Impl"
    // InternalResumeDsl.g:2566:1: rule__Degree__Group__9__Impl : ( ( rule__Degree__TagsAssignment_9 ) ) ;
    public final void rule__Degree__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2570:1: ( ( ( rule__Degree__TagsAssignment_9 ) ) )
            // InternalResumeDsl.g:2571:1: ( ( rule__Degree__TagsAssignment_9 ) )
            {
            // InternalResumeDsl.g:2571:1: ( ( rule__Degree__TagsAssignment_9 ) )
            // InternalResumeDsl.g:2572:2: ( rule__Degree__TagsAssignment_9 )
            {
             before(grammarAccess.getDegreeAccess().getTagsAssignment_9()); 
            // InternalResumeDsl.g:2573:2: ( rule__Degree__TagsAssignment_9 )
            // InternalResumeDsl.g:2573:3: rule__Degree__TagsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Degree__TagsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getTagsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__9__Impl"


    // $ANTLR start "rule__Skills__Group__0"
    // InternalResumeDsl.g:2582:1: rule__Skills__Group__0 : rule__Skills__Group__0__Impl rule__Skills__Group__1 ;
    public final void rule__Skills__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2586:1: ( rule__Skills__Group__0__Impl rule__Skills__Group__1 )
            // InternalResumeDsl.g:2587:2: rule__Skills__Group__0__Impl rule__Skills__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Skills__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skills__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__0"


    // $ANTLR start "rule__Skills__Group__0__Impl"
    // InternalResumeDsl.g:2594:1: rule__Skills__Group__0__Impl : ( 'Skills' ) ;
    public final void rule__Skills__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2598:1: ( ( 'Skills' ) )
            // InternalResumeDsl.g:2599:1: ( 'Skills' )
            {
            // InternalResumeDsl.g:2599:1: ( 'Skills' )
            // InternalResumeDsl.g:2600:2: 'Skills'
            {
             before(grammarAccess.getSkillsAccess().getSkillsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSkillsAccess().getSkillsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__0__Impl"


    // $ANTLR start "rule__Skills__Group__1"
    // InternalResumeDsl.g:2609:1: rule__Skills__Group__1 : rule__Skills__Group__1__Impl rule__Skills__Group__2 ;
    public final void rule__Skills__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2613:1: ( rule__Skills__Group__1__Impl rule__Skills__Group__2 )
            // InternalResumeDsl.g:2614:2: rule__Skills__Group__1__Impl rule__Skills__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Skills__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skills__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__1"


    // $ANTLR start "rule__Skills__Group__1__Impl"
    // InternalResumeDsl.g:2621:1: rule__Skills__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Skills__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2625:1: ( ( 'language:' ) )
            // InternalResumeDsl.g:2626:1: ( 'language:' )
            {
            // InternalResumeDsl.g:2626:1: ( 'language:' )
            // InternalResumeDsl.g:2627:2: 'language:'
            {
             before(grammarAccess.getSkillsAccess().getLanguageKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSkillsAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__1__Impl"


    // $ANTLR start "rule__Skills__Group__2"
    // InternalResumeDsl.g:2636:1: rule__Skills__Group__2 : rule__Skills__Group__2__Impl rule__Skills__Group__3 ;
    public final void rule__Skills__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2640:1: ( rule__Skills__Group__2__Impl rule__Skills__Group__3 )
            // InternalResumeDsl.g:2641:2: rule__Skills__Group__2__Impl rule__Skills__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Skills__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skills__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__2"


    // $ANTLR start "rule__Skills__Group__2__Impl"
    // InternalResumeDsl.g:2648:1: rule__Skills__Group__2__Impl : ( ( rule__Skills__LanguageAssignment_2 ) ) ;
    public final void rule__Skills__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2652:1: ( ( ( rule__Skills__LanguageAssignment_2 ) ) )
            // InternalResumeDsl.g:2653:1: ( ( rule__Skills__LanguageAssignment_2 ) )
            {
            // InternalResumeDsl.g:2653:1: ( ( rule__Skills__LanguageAssignment_2 ) )
            // InternalResumeDsl.g:2654:2: ( rule__Skills__LanguageAssignment_2 )
            {
             before(grammarAccess.getSkillsAccess().getLanguageAssignment_2()); 
            // InternalResumeDsl.g:2655:2: ( rule__Skills__LanguageAssignment_2 )
            // InternalResumeDsl.g:2655:3: rule__Skills__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Skills__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSkillsAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__2__Impl"


    // $ANTLR start "rule__Skills__Group__3"
    // InternalResumeDsl.g:2663:1: rule__Skills__Group__3 : rule__Skills__Group__3__Impl ;
    public final void rule__Skills__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2667:1: ( rule__Skills__Group__3__Impl )
            // InternalResumeDsl.g:2668:2: rule__Skills__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Skills__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__3"


    // $ANTLR start "rule__Skills__Group__3__Impl"
    // InternalResumeDsl.g:2674:1: rule__Skills__Group__3__Impl : ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) ) ;
    public final void rule__Skills__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2678:1: ( ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) ) )
            // InternalResumeDsl.g:2679:1: ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) )
            {
            // InternalResumeDsl.g:2679:1: ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) )
            // InternalResumeDsl.g:2680:2: ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* )
            {
            // InternalResumeDsl.g:2680:2: ( ( rule__Skills__SkillsAssignment_3 ) )
            // InternalResumeDsl.g:2681:3: ( rule__Skills__SkillsAssignment_3 )
            {
             before(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 
            // InternalResumeDsl.g:2682:3: ( rule__Skills__SkillsAssignment_3 )
            // InternalResumeDsl.g:2682:4: rule__Skills__SkillsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__Skills__SkillsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 

            }

            // InternalResumeDsl.g:2685:2: ( ( rule__Skills__SkillsAssignment_3 )* )
            // InternalResumeDsl.g:2686:3: ( rule__Skills__SkillsAssignment_3 )*
            {
             before(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 
            // InternalResumeDsl.g:2687:3: ( rule__Skills__SkillsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalResumeDsl.g:2687:4: rule__Skills__SkillsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Skills__SkillsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__3__Impl"


    // $ANTLR start "rule__Skill__Group__0"
    // InternalResumeDsl.g:2697:1: rule__Skill__Group__0 : rule__Skill__Group__0__Impl rule__Skill__Group__1 ;
    public final void rule__Skill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2701:1: ( rule__Skill__Group__0__Impl rule__Skill__Group__1 )
            // InternalResumeDsl.g:2702:2: rule__Skill__Group__0__Impl rule__Skill__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Skill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__0"


    // $ANTLR start "rule__Skill__Group__0__Impl"
    // InternalResumeDsl.g:2709:1: rule__Skill__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Skill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2713:1: ( ( 'title:' ) )
            // InternalResumeDsl.g:2714:1: ( 'title:' )
            {
            // InternalResumeDsl.g:2714:1: ( 'title:' )
            // InternalResumeDsl.g:2715:2: 'title:'
            {
             before(grammarAccess.getSkillAccess().getTitleKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSkillAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__0__Impl"


    // $ANTLR start "rule__Skill__Group__1"
    // InternalResumeDsl.g:2724:1: rule__Skill__Group__1 : rule__Skill__Group__1__Impl rule__Skill__Group__2 ;
    public final void rule__Skill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2728:1: ( rule__Skill__Group__1__Impl rule__Skill__Group__2 )
            // InternalResumeDsl.g:2729:2: rule__Skill__Group__1__Impl rule__Skill__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Skill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__1"


    // $ANTLR start "rule__Skill__Group__1__Impl"
    // InternalResumeDsl.g:2736:1: rule__Skill__Group__1__Impl : ( ( rule__Skill__TitleAssignment_1 ) ) ;
    public final void rule__Skill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2740:1: ( ( ( rule__Skill__TitleAssignment_1 ) ) )
            // InternalResumeDsl.g:2741:1: ( ( rule__Skill__TitleAssignment_1 ) )
            {
            // InternalResumeDsl.g:2741:1: ( ( rule__Skill__TitleAssignment_1 ) )
            // InternalResumeDsl.g:2742:2: ( rule__Skill__TitleAssignment_1 )
            {
             before(grammarAccess.getSkillAccess().getTitleAssignment_1()); 
            // InternalResumeDsl.g:2743:2: ( rule__Skill__TitleAssignment_1 )
            // InternalResumeDsl.g:2743:3: rule__Skill__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Skill__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__1__Impl"


    // $ANTLR start "rule__Skill__Group__2"
    // InternalResumeDsl.g:2751:1: rule__Skill__Group__2 : rule__Skill__Group__2__Impl rule__Skill__Group__3 ;
    public final void rule__Skill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2755:1: ( rule__Skill__Group__2__Impl rule__Skill__Group__3 )
            // InternalResumeDsl.g:2756:2: rule__Skill__Group__2__Impl rule__Skill__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Skill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skill__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__2"


    // $ANTLR start "rule__Skill__Group__2__Impl"
    // InternalResumeDsl.g:2763:1: rule__Skill__Group__2__Impl : ( 'tags:' ) ;
    public final void rule__Skill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2767:1: ( ( 'tags:' ) )
            // InternalResumeDsl.g:2768:1: ( 'tags:' )
            {
            // InternalResumeDsl.g:2768:1: ( 'tags:' )
            // InternalResumeDsl.g:2769:2: 'tags:'
            {
             before(grammarAccess.getSkillAccess().getTagsKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSkillAccess().getTagsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__2__Impl"


    // $ANTLR start "rule__Skill__Group__3"
    // InternalResumeDsl.g:2778:1: rule__Skill__Group__3 : rule__Skill__Group__3__Impl ;
    public final void rule__Skill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2782:1: ( rule__Skill__Group__3__Impl )
            // InternalResumeDsl.g:2783:2: rule__Skill__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Skill__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__3"


    // $ANTLR start "rule__Skill__Group__3__Impl"
    // InternalResumeDsl.g:2789:1: rule__Skill__Group__3__Impl : ( ( rule__Skill__TagsAssignment_3 ) ) ;
    public final void rule__Skill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2793:1: ( ( ( rule__Skill__TagsAssignment_3 ) ) )
            // InternalResumeDsl.g:2794:1: ( ( rule__Skill__TagsAssignment_3 ) )
            {
            // InternalResumeDsl.g:2794:1: ( ( rule__Skill__TagsAssignment_3 ) )
            // InternalResumeDsl.g:2795:2: ( rule__Skill__TagsAssignment_3 )
            {
             before(grammarAccess.getSkillAccess().getTagsAssignment_3()); 
            // InternalResumeDsl.g:2796:2: ( rule__Skill__TagsAssignment_3 )
            // InternalResumeDsl.g:2796:3: rule__Skill__TagsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Skill__TagsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getTagsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__3__Impl"


    // $ANTLR start "rule__Interests__Group__0"
    // InternalResumeDsl.g:2805:1: rule__Interests__Group__0 : rule__Interests__Group__0__Impl rule__Interests__Group__1 ;
    public final void rule__Interests__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2809:1: ( rule__Interests__Group__0__Impl rule__Interests__Group__1 )
            // InternalResumeDsl.g:2810:2: rule__Interests__Group__0__Impl rule__Interests__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Interests__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__0"


    // $ANTLR start "rule__Interests__Group__0__Impl"
    // InternalResumeDsl.g:2817:1: rule__Interests__Group__0__Impl : ( 'Interests' ) ;
    public final void rule__Interests__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2821:1: ( ( 'Interests' ) )
            // InternalResumeDsl.g:2822:1: ( 'Interests' )
            {
            // InternalResumeDsl.g:2822:1: ( 'Interests' )
            // InternalResumeDsl.g:2823:2: 'Interests'
            {
             before(grammarAccess.getInterestsAccess().getInterestsKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getInterestsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__0__Impl"


    // $ANTLR start "rule__Interests__Group__1"
    // InternalResumeDsl.g:2832:1: rule__Interests__Group__1 : rule__Interests__Group__1__Impl rule__Interests__Group__2 ;
    public final void rule__Interests__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2836:1: ( rule__Interests__Group__1__Impl rule__Interests__Group__2 )
            // InternalResumeDsl.g:2837:2: rule__Interests__Group__1__Impl rule__Interests__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Interests__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__1"


    // $ANTLR start "rule__Interests__Group__1__Impl"
    // InternalResumeDsl.g:2844:1: rule__Interests__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Interests__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2848:1: ( ( 'language:' ) )
            // InternalResumeDsl.g:2849:1: ( 'language:' )
            {
            // InternalResumeDsl.g:2849:1: ( 'language:' )
            // InternalResumeDsl.g:2850:2: 'language:'
            {
             before(grammarAccess.getInterestsAccess().getLanguageKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__1__Impl"


    // $ANTLR start "rule__Interests__Group__2"
    // InternalResumeDsl.g:2859:1: rule__Interests__Group__2 : rule__Interests__Group__2__Impl rule__Interests__Group__3 ;
    public final void rule__Interests__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2863:1: ( rule__Interests__Group__2__Impl rule__Interests__Group__3 )
            // InternalResumeDsl.g:2864:2: rule__Interests__Group__2__Impl rule__Interests__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Interests__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__2"


    // $ANTLR start "rule__Interests__Group__2__Impl"
    // InternalResumeDsl.g:2871:1: rule__Interests__Group__2__Impl : ( ( rule__Interests__LanguageAssignment_2 ) ) ;
    public final void rule__Interests__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2875:1: ( ( ( rule__Interests__LanguageAssignment_2 ) ) )
            // InternalResumeDsl.g:2876:1: ( ( rule__Interests__LanguageAssignment_2 ) )
            {
            // InternalResumeDsl.g:2876:1: ( ( rule__Interests__LanguageAssignment_2 ) )
            // InternalResumeDsl.g:2877:2: ( rule__Interests__LanguageAssignment_2 )
            {
             before(grammarAccess.getInterestsAccess().getLanguageAssignment_2()); 
            // InternalResumeDsl.g:2878:2: ( rule__Interests__LanguageAssignment_2 )
            // InternalResumeDsl.g:2878:3: rule__Interests__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interests__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterestsAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__2__Impl"


    // $ANTLR start "rule__Interests__Group__3"
    // InternalResumeDsl.g:2886:1: rule__Interests__Group__3 : rule__Interests__Group__3__Impl rule__Interests__Group__4 ;
    public final void rule__Interests__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2890:1: ( rule__Interests__Group__3__Impl rule__Interests__Group__4 )
            // InternalResumeDsl.g:2891:2: rule__Interests__Group__3__Impl rule__Interests__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Interests__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__3"


    // $ANTLR start "rule__Interests__Group__3__Impl"
    // InternalResumeDsl.g:2898:1: rule__Interests__Group__3__Impl : ( 'tags:' ) ;
    public final void rule__Interests__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2902:1: ( ( 'tags:' ) )
            // InternalResumeDsl.g:2903:1: ( 'tags:' )
            {
            // InternalResumeDsl.g:2903:1: ( 'tags:' )
            // InternalResumeDsl.g:2904:2: 'tags:'
            {
             before(grammarAccess.getInterestsAccess().getTagsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getTagsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__3__Impl"


    // $ANTLR start "rule__Interests__Group__4"
    // InternalResumeDsl.g:2913:1: rule__Interests__Group__4 : rule__Interests__Group__4__Impl ;
    public final void rule__Interests__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2917:1: ( rule__Interests__Group__4__Impl )
            // InternalResumeDsl.g:2918:2: rule__Interests__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interests__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__4"


    // $ANTLR start "rule__Interests__Group__4__Impl"
    // InternalResumeDsl.g:2924:1: rule__Interests__Group__4__Impl : ( ( rule__Interests__TagsAssignment_4 ) ) ;
    public final void rule__Interests__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2928:1: ( ( ( rule__Interests__TagsAssignment_4 ) ) )
            // InternalResumeDsl.g:2929:1: ( ( rule__Interests__TagsAssignment_4 ) )
            {
            // InternalResumeDsl.g:2929:1: ( ( rule__Interests__TagsAssignment_4 ) )
            // InternalResumeDsl.g:2930:2: ( rule__Interests__TagsAssignment_4 )
            {
             before(grammarAccess.getInterestsAccess().getTagsAssignment_4()); 
            // InternalResumeDsl.g:2931:2: ( rule__Interests__TagsAssignment_4 )
            // InternalResumeDsl.g:2931:3: rule__Interests__TagsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Interests__TagsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInterestsAccess().getTagsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__4__Impl"


    // $ANTLR start "rule__Languages__Group__0"
    // InternalResumeDsl.g:2940:1: rule__Languages__Group__0 : rule__Languages__Group__0__Impl rule__Languages__Group__1 ;
    public final void rule__Languages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2944:1: ( rule__Languages__Group__0__Impl rule__Languages__Group__1 )
            // InternalResumeDsl.g:2945:2: rule__Languages__Group__0__Impl rule__Languages__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Languages__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__0"


    // $ANTLR start "rule__Languages__Group__0__Impl"
    // InternalResumeDsl.g:2952:1: rule__Languages__Group__0__Impl : ( 'Languages' ) ;
    public final void rule__Languages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2956:1: ( ( 'Languages' ) )
            // InternalResumeDsl.g:2957:1: ( 'Languages' )
            {
            // InternalResumeDsl.g:2957:1: ( 'Languages' )
            // InternalResumeDsl.g:2958:2: 'Languages'
            {
             before(grammarAccess.getLanguagesAccess().getLanguagesKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getLanguagesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__0__Impl"


    // $ANTLR start "rule__Languages__Group__1"
    // InternalResumeDsl.g:2967:1: rule__Languages__Group__1 : rule__Languages__Group__1__Impl rule__Languages__Group__2 ;
    public final void rule__Languages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2971:1: ( rule__Languages__Group__1__Impl rule__Languages__Group__2 )
            // InternalResumeDsl.g:2972:2: rule__Languages__Group__1__Impl rule__Languages__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Languages__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__1"


    // $ANTLR start "rule__Languages__Group__1__Impl"
    // InternalResumeDsl.g:2979:1: rule__Languages__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Languages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2983:1: ( ( 'language:' ) )
            // InternalResumeDsl.g:2984:1: ( 'language:' )
            {
            // InternalResumeDsl.g:2984:1: ( 'language:' )
            // InternalResumeDsl.g:2985:2: 'language:'
            {
             before(grammarAccess.getLanguagesAccess().getLanguageKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__1__Impl"


    // $ANTLR start "rule__Languages__Group__2"
    // InternalResumeDsl.g:2994:1: rule__Languages__Group__2 : rule__Languages__Group__2__Impl rule__Languages__Group__3 ;
    public final void rule__Languages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:2998:1: ( rule__Languages__Group__2__Impl rule__Languages__Group__3 )
            // InternalResumeDsl.g:2999:2: rule__Languages__Group__2__Impl rule__Languages__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Languages__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__2"


    // $ANTLR start "rule__Languages__Group__2__Impl"
    // InternalResumeDsl.g:3006:1: rule__Languages__Group__2__Impl : ( ( rule__Languages__LanguageAssignment_2 ) ) ;
    public final void rule__Languages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3010:1: ( ( ( rule__Languages__LanguageAssignment_2 ) ) )
            // InternalResumeDsl.g:3011:1: ( ( rule__Languages__LanguageAssignment_2 ) )
            {
            // InternalResumeDsl.g:3011:1: ( ( rule__Languages__LanguageAssignment_2 ) )
            // InternalResumeDsl.g:3012:2: ( rule__Languages__LanguageAssignment_2 )
            {
             before(grammarAccess.getLanguagesAccess().getLanguageAssignment_2()); 
            // InternalResumeDsl.g:3013:2: ( rule__Languages__LanguageAssignment_2 )
            // InternalResumeDsl.g:3013:3: rule__Languages__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Languages__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguagesAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__2__Impl"


    // $ANTLR start "rule__Languages__Group__3"
    // InternalResumeDsl.g:3021:1: rule__Languages__Group__3 : rule__Languages__Group__3__Impl rule__Languages__Group__4 ;
    public final void rule__Languages__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3025:1: ( rule__Languages__Group__3__Impl rule__Languages__Group__4 )
            // InternalResumeDsl.g:3026:2: rule__Languages__Group__3__Impl rule__Languages__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Languages__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__3"


    // $ANTLR start "rule__Languages__Group__3__Impl"
    // InternalResumeDsl.g:3033:1: rule__Languages__Group__3__Impl : ( 'tags:' ) ;
    public final void rule__Languages__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3037:1: ( ( 'tags:' ) )
            // InternalResumeDsl.g:3038:1: ( 'tags:' )
            {
            // InternalResumeDsl.g:3038:1: ( 'tags:' )
            // InternalResumeDsl.g:3039:2: 'tags:'
            {
             before(grammarAccess.getLanguagesAccess().getTagsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getTagsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__3__Impl"


    // $ANTLR start "rule__Languages__Group__4"
    // InternalResumeDsl.g:3048:1: rule__Languages__Group__4 : rule__Languages__Group__4__Impl ;
    public final void rule__Languages__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3052:1: ( rule__Languages__Group__4__Impl )
            // InternalResumeDsl.g:3053:2: rule__Languages__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Languages__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__4"


    // $ANTLR start "rule__Languages__Group__4__Impl"
    // InternalResumeDsl.g:3059:1: rule__Languages__Group__4__Impl : ( ( rule__Languages__TagsAssignment_4 ) ) ;
    public final void rule__Languages__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3063:1: ( ( ( rule__Languages__TagsAssignment_4 ) ) )
            // InternalResumeDsl.g:3064:1: ( ( rule__Languages__TagsAssignment_4 ) )
            {
            // InternalResumeDsl.g:3064:1: ( ( rule__Languages__TagsAssignment_4 ) )
            // InternalResumeDsl.g:3065:2: ( rule__Languages__TagsAssignment_4 )
            {
             before(grammarAccess.getLanguagesAccess().getTagsAssignment_4()); 
            // InternalResumeDsl.g:3066:2: ( rule__Languages__TagsAssignment_4 )
            // InternalResumeDsl.g:3066:3: rule__Languages__TagsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Languages__TagsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLanguagesAccess().getTagsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__4__Impl"


    // $ANTLR start "rule__Customization__Group__0"
    // InternalResumeDsl.g:3075:1: rule__Customization__Group__0 : rule__Customization__Group__0__Impl rule__Customization__Group__1 ;
    public final void rule__Customization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3079:1: ( rule__Customization__Group__0__Impl rule__Customization__Group__1 )
            // InternalResumeDsl.g:3080:2: rule__Customization__Group__0__Impl rule__Customization__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Customization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__0"


    // $ANTLR start "rule__Customization__Group__0__Impl"
    // InternalResumeDsl.g:3087:1: rule__Customization__Group__0__Impl : ( 'Customization' ) ;
    public final void rule__Customization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3091:1: ( ( 'Customization' ) )
            // InternalResumeDsl.g:3092:1: ( 'Customization' )
            {
            // InternalResumeDsl.g:3092:1: ( 'Customization' )
            // InternalResumeDsl.g:3093:2: 'Customization'
            {
             before(grammarAccess.getCustomizationAccess().getCustomizationKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getCustomizationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__0__Impl"


    // $ANTLR start "rule__Customization__Group__1"
    // InternalResumeDsl.g:3102:1: rule__Customization__Group__1 : rule__Customization__Group__1__Impl rule__Customization__Group__2 ;
    public final void rule__Customization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3106:1: ( rule__Customization__Group__1__Impl rule__Customization__Group__2 )
            // InternalResumeDsl.g:3107:2: rule__Customization__Group__1__Impl rule__Customization__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Customization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__1"


    // $ANTLR start "rule__Customization__Group__1__Impl"
    // InternalResumeDsl.g:3114:1: rule__Customization__Group__1__Impl : ( 'include' ) ;
    public final void rule__Customization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3118:1: ( ( 'include' ) )
            // InternalResumeDsl.g:3119:1: ( 'include' )
            {
            // InternalResumeDsl.g:3119:1: ( 'include' )
            // InternalResumeDsl.g:3120:2: 'include'
            {
             before(grammarAccess.getCustomizationAccess().getIncludeKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getIncludeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__1__Impl"


    // $ANTLR start "rule__Customization__Group__2"
    // InternalResumeDsl.g:3129:1: rule__Customization__Group__2 : rule__Customization__Group__2__Impl rule__Customization__Group__3 ;
    public final void rule__Customization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3133:1: ( rule__Customization__Group__2__Impl rule__Customization__Group__3 )
            // InternalResumeDsl.g:3134:2: rule__Customization__Group__2__Impl rule__Customization__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Customization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__2"


    // $ANTLR start "rule__Customization__Group__2__Impl"
    // InternalResumeDsl.g:3141:1: rule__Customization__Group__2__Impl : ( 'Profile' ) ;
    public final void rule__Customization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3145:1: ( ( 'Profile' ) )
            // InternalResumeDsl.g:3146:1: ( 'Profile' )
            {
            // InternalResumeDsl.g:3146:1: ( 'Profile' )
            // InternalResumeDsl.g:3147:2: 'Profile'
            {
             before(grammarAccess.getCustomizationAccess().getProfileKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getProfileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__2__Impl"


    // $ANTLR start "rule__Customization__Group__3"
    // InternalResumeDsl.g:3156:1: rule__Customization__Group__3 : rule__Customization__Group__3__Impl rule__Customization__Group__4 ;
    public final void rule__Customization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3160:1: ( rule__Customization__Group__3__Impl rule__Customization__Group__4 )
            // InternalResumeDsl.g:3161:2: rule__Customization__Group__3__Impl rule__Customization__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Customization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__3"


    // $ANTLR start "rule__Customization__Group__3__Impl"
    // InternalResumeDsl.g:3168:1: rule__Customization__Group__3__Impl : ( 'where' ) ;
    public final void rule__Customization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3172:1: ( ( 'where' ) )
            // InternalResumeDsl.g:3173:1: ( 'where' )
            {
            // InternalResumeDsl.g:3173:1: ( 'where' )
            // InternalResumeDsl.g:3174:2: 'where'
            {
             before(grammarAccess.getCustomizationAccess().getWhereKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getWhereKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__3__Impl"


    // $ANTLR start "rule__Customization__Group__4"
    // InternalResumeDsl.g:3183:1: rule__Customization__Group__4 : rule__Customization__Group__4__Impl rule__Customization__Group__5 ;
    public final void rule__Customization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3187:1: ( rule__Customization__Group__4__Impl rule__Customization__Group__5 )
            // InternalResumeDsl.g:3188:2: rule__Customization__Group__4__Impl rule__Customization__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Customization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__4"


    // $ANTLR start "rule__Customization__Group__4__Impl"
    // InternalResumeDsl.g:3195:1: rule__Customization__Group__4__Impl : ( 'language' ) ;
    public final void rule__Customization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3199:1: ( ( 'language' ) )
            // InternalResumeDsl.g:3200:1: ( 'language' )
            {
            // InternalResumeDsl.g:3200:1: ( 'language' )
            // InternalResumeDsl.g:3201:2: 'language'
            {
             before(grammarAccess.getCustomizationAccess().getLanguageKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getLanguageKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__4__Impl"


    // $ANTLR start "rule__Customization__Group__5"
    // InternalResumeDsl.g:3210:1: rule__Customization__Group__5 : rule__Customization__Group__5__Impl rule__Customization__Group__6 ;
    public final void rule__Customization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3214:1: ( rule__Customization__Group__5__Impl rule__Customization__Group__6 )
            // InternalResumeDsl.g:3215:2: rule__Customization__Group__5__Impl rule__Customization__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Customization__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__5"


    // $ANTLR start "rule__Customization__Group__5__Impl"
    // InternalResumeDsl.g:3222:1: rule__Customization__Group__5__Impl : ( ( rule__Customization__LanguageAssignment_5 ) ) ;
    public final void rule__Customization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3226:1: ( ( ( rule__Customization__LanguageAssignment_5 ) ) )
            // InternalResumeDsl.g:3227:1: ( ( rule__Customization__LanguageAssignment_5 ) )
            {
            // InternalResumeDsl.g:3227:1: ( ( rule__Customization__LanguageAssignment_5 ) )
            // InternalResumeDsl.g:3228:2: ( rule__Customization__LanguageAssignment_5 )
            {
             before(grammarAccess.getCustomizationAccess().getLanguageAssignment_5()); 
            // InternalResumeDsl.g:3229:2: ( rule__Customization__LanguageAssignment_5 )
            // InternalResumeDsl.g:3229:3: rule__Customization__LanguageAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Customization__LanguageAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCustomizationAccess().getLanguageAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__5__Impl"


    // $ANTLR start "rule__Customization__Group__6"
    // InternalResumeDsl.g:3237:1: rule__Customization__Group__6 : rule__Customization__Group__6__Impl ;
    public final void rule__Customization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3241:1: ( rule__Customization__Group__6__Impl )
            // InternalResumeDsl.g:3242:2: rule__Customization__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customization__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__6"


    // $ANTLR start "rule__Customization__Group__6__Impl"
    // InternalResumeDsl.g:3248:1: rule__Customization__Group__6__Impl : ( ( rule__Customization__RulesAssignment_6 )* ) ;
    public final void rule__Customization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3252:1: ( ( ( rule__Customization__RulesAssignment_6 )* ) )
            // InternalResumeDsl.g:3253:1: ( ( rule__Customization__RulesAssignment_6 )* )
            {
            // InternalResumeDsl.g:3253:1: ( ( rule__Customization__RulesAssignment_6 )* )
            // InternalResumeDsl.g:3254:2: ( rule__Customization__RulesAssignment_6 )*
            {
             before(grammarAccess.getCustomizationAccess().getRulesAssignment_6()); 
            // InternalResumeDsl.g:3255:2: ( rule__Customization__RulesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalResumeDsl.g:3255:3: rule__Customization__RulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Customization__RulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCustomizationAccess().getRulesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalResumeDsl.g:3264:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3268:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalResumeDsl.g:3269:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalResumeDsl.g:3276:1: rule__Rule__Group__0__Impl : ( 'include' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3280:1: ( ( 'include' ) )
            // InternalResumeDsl.g:3281:1: ( 'include' )
            {
            // InternalResumeDsl.g:3281:1: ( 'include' )
            // InternalResumeDsl.g:3282:2: 'include'
            {
             before(grammarAccess.getRuleAccess().getIncludeKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalResumeDsl.g:3291:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3295:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalResumeDsl.g:3296:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalResumeDsl.g:3303:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__SectionTypeAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3307:1: ( ( ( rule__Rule__SectionTypeAssignment_1 ) ) )
            // InternalResumeDsl.g:3308:1: ( ( rule__Rule__SectionTypeAssignment_1 ) )
            {
            // InternalResumeDsl.g:3308:1: ( ( rule__Rule__SectionTypeAssignment_1 ) )
            // InternalResumeDsl.g:3309:2: ( rule__Rule__SectionTypeAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getSectionTypeAssignment_1()); 
            // InternalResumeDsl.g:3310:2: ( rule__Rule__SectionTypeAssignment_1 )
            // InternalResumeDsl.g:3310:3: rule__Rule__SectionTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SectionTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSectionTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalResumeDsl.g:3318:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3322:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalResumeDsl.g:3323:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalResumeDsl.g:3330:1: rule__Rule__Group__2__Impl : ( 'where' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3334:1: ( ( 'where' ) )
            // InternalResumeDsl.g:3335:1: ( 'where' )
            {
            // InternalResumeDsl.g:3335:1: ( 'where' )
            // InternalResumeDsl.g:3336:2: 'where'
            {
             before(grammarAccess.getRuleAccess().getWhereKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWhereKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalResumeDsl.g:3345:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3349:1: ( rule__Rule__Group__3__Impl )
            // InternalResumeDsl.g:3350:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalResumeDsl.g:3356:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__FilterAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3360:1: ( ( ( rule__Rule__FilterAssignment_3 ) ) )
            // InternalResumeDsl.g:3361:1: ( ( rule__Rule__FilterAssignment_3 ) )
            {
            // InternalResumeDsl.g:3361:1: ( ( rule__Rule__FilterAssignment_3 ) )
            // InternalResumeDsl.g:3362:2: ( rule__Rule__FilterAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getFilterAssignment_3()); 
            // InternalResumeDsl.g:3363:2: ( rule__Rule__FilterAssignment_3 )
            // InternalResumeDsl.g:3363:3: rule__Rule__FilterAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__FilterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getFilterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__GeneralFilter__Group__0"
    // InternalResumeDsl.g:3372:1: rule__GeneralFilter__Group__0 : rule__GeneralFilter__Group__0__Impl rule__GeneralFilter__Group__1 ;
    public final void rule__GeneralFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3376:1: ( rule__GeneralFilter__Group__0__Impl rule__GeneralFilter__Group__1 )
            // InternalResumeDsl.g:3377:2: rule__GeneralFilter__Group__0__Impl rule__GeneralFilter__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__GeneralFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralFilter__Group__0"


    // $ANTLR start "rule__GeneralFilter__Group__0__Impl"
    // InternalResumeDsl.g:3384:1: rule__GeneralFilter__Group__0__Impl : ( 'tags' ) ;
    public final void rule__GeneralFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3388:1: ( ( 'tags' ) )
            // InternalResumeDsl.g:3389:1: ( 'tags' )
            {
            // InternalResumeDsl.g:3389:1: ( 'tags' )
            // InternalResumeDsl.g:3390:2: 'tags'
            {
             before(grammarAccess.getGeneralFilterAccess().getTagsKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGeneralFilterAccess().getTagsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralFilter__Group__0__Impl"


    // $ANTLR start "rule__GeneralFilter__Group__1"
    // InternalResumeDsl.g:3399:1: rule__GeneralFilter__Group__1 : rule__GeneralFilter__Group__1__Impl rule__GeneralFilter__Group__2 ;
    public final void rule__GeneralFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3403:1: ( rule__GeneralFilter__Group__1__Impl rule__GeneralFilter__Group__2 )
            // InternalResumeDsl.g:3404:2: rule__GeneralFilter__Group__1__Impl rule__GeneralFilter__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GeneralFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralFilter__Group__1"


    // $ANTLR start "rule__GeneralFilter__Group__1__Impl"
    // InternalResumeDsl.g:3411:1: rule__GeneralFilter__Group__1__Impl : ( 'include' ) ;
    public final void rule__GeneralFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3415:1: ( ( 'include' ) )
            // InternalResumeDsl.g:3416:1: ( 'include' )
            {
            // InternalResumeDsl.g:3416:1: ( 'include' )
            // InternalResumeDsl.g:3417:2: 'include'
            {
             before(grammarAccess.getGeneralFilterAccess().getIncludeKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGeneralFilterAccess().getIncludeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralFilter__Group__1__Impl"


    // $ANTLR start "rule__GeneralFilter__Group__2"
    // InternalResumeDsl.g:3426:1: rule__GeneralFilter__Group__2 : rule__GeneralFilter__Group__2__Impl ;
    public final void rule__GeneralFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3430:1: ( rule__GeneralFilter__Group__2__Impl )
            // InternalResumeDsl.g:3431:2: rule__GeneralFilter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralFilter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralFilter__Group__2"


    // $ANTLR start "rule__GeneralFilter__Group__2__Impl"
    // InternalResumeDsl.g:3437:1: rule__GeneralFilter__Group__2__Impl : ( ( rule__GeneralFilter__TagAssignment_2 ) ) ;
    public final void rule__GeneralFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3441:1: ( ( ( rule__GeneralFilter__TagAssignment_2 ) ) )
            // InternalResumeDsl.g:3442:1: ( ( rule__GeneralFilter__TagAssignment_2 ) )
            {
            // InternalResumeDsl.g:3442:1: ( ( rule__GeneralFilter__TagAssignment_2 ) )
            // InternalResumeDsl.g:3443:2: ( rule__GeneralFilter__TagAssignment_2 )
            {
             before(grammarAccess.getGeneralFilterAccess().getTagAssignment_2()); 
            // InternalResumeDsl.g:3444:2: ( rule__GeneralFilter__TagAssignment_2 )
            // InternalResumeDsl.g:3444:3: rule__GeneralFilter__TagAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GeneralFilter__TagAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneralFilterAccess().getTagAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralFilter__Group__2__Impl"


    // $ANTLR start "rule__TemporalFilter__Group_0__0"
    // InternalResumeDsl.g:3453:1: rule__TemporalFilter__Group_0__0 : rule__TemporalFilter__Group_0__0__Impl rule__TemporalFilter__Group_0__1 ;
    public final void rule__TemporalFilter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3457:1: ( rule__TemporalFilter__Group_0__0__Impl rule__TemporalFilter__Group_0__1 )
            // InternalResumeDsl.g:3458:2: rule__TemporalFilter__Group_0__0__Impl rule__TemporalFilter__Group_0__1
            {
            pushFollow(FOLLOW_36);
            rule__TemporalFilter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalFilter__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_0__0"


    // $ANTLR start "rule__TemporalFilter__Group_0__0__Impl"
    // InternalResumeDsl.g:3465:1: rule__TemporalFilter__Group_0__0__Impl : ( 'startDate' ) ;
    public final void rule__TemporalFilter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3469:1: ( ( 'startDate' ) )
            // InternalResumeDsl.g:3470:1: ( 'startDate' )
            {
            // InternalResumeDsl.g:3470:1: ( 'startDate' )
            // InternalResumeDsl.g:3471:2: 'startDate'
            {
             before(grammarAccess.getTemporalFilterAccess().getStartDateKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTemporalFilterAccess().getStartDateKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_0__0__Impl"


    // $ANTLR start "rule__TemporalFilter__Group_0__1"
    // InternalResumeDsl.g:3480:1: rule__TemporalFilter__Group_0__1 : rule__TemporalFilter__Group_0__1__Impl rule__TemporalFilter__Group_0__2 ;
    public final void rule__TemporalFilter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3484:1: ( rule__TemporalFilter__Group_0__1__Impl rule__TemporalFilter__Group_0__2 )
            // InternalResumeDsl.g:3485:2: rule__TemporalFilter__Group_0__1__Impl rule__TemporalFilter__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__TemporalFilter__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalFilter__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_0__1"


    // $ANTLR start "rule__TemporalFilter__Group_0__1__Impl"
    // InternalResumeDsl.g:3492:1: rule__TemporalFilter__Group_0__1__Impl : ( 'after' ) ;
    public final void rule__TemporalFilter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3496:1: ( ( 'after' ) )
            // InternalResumeDsl.g:3497:1: ( 'after' )
            {
            // InternalResumeDsl.g:3497:1: ( 'after' )
            // InternalResumeDsl.g:3498:2: 'after'
            {
             before(grammarAccess.getTemporalFilterAccess().getAfterKeyword_0_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTemporalFilterAccess().getAfterKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_0__1__Impl"


    // $ANTLR start "rule__TemporalFilter__Group_0__2"
    // InternalResumeDsl.g:3507:1: rule__TemporalFilter__Group_0__2 : rule__TemporalFilter__Group_0__2__Impl ;
    public final void rule__TemporalFilter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3511:1: ( rule__TemporalFilter__Group_0__2__Impl )
            // InternalResumeDsl.g:3512:2: rule__TemporalFilter__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalFilter__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_0__2"


    // $ANTLR start "rule__TemporalFilter__Group_0__2__Impl"
    // InternalResumeDsl.g:3518:1: rule__TemporalFilter__Group_0__2__Impl : ( ( rule__TemporalFilter__StartDateAssignment_0_2 ) ) ;
    public final void rule__TemporalFilter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3522:1: ( ( ( rule__TemporalFilter__StartDateAssignment_0_2 ) ) )
            // InternalResumeDsl.g:3523:1: ( ( rule__TemporalFilter__StartDateAssignment_0_2 ) )
            {
            // InternalResumeDsl.g:3523:1: ( ( rule__TemporalFilter__StartDateAssignment_0_2 ) )
            // InternalResumeDsl.g:3524:2: ( rule__TemporalFilter__StartDateAssignment_0_2 )
            {
             before(grammarAccess.getTemporalFilterAccess().getStartDateAssignment_0_2()); 
            // InternalResumeDsl.g:3525:2: ( rule__TemporalFilter__StartDateAssignment_0_2 )
            // InternalResumeDsl.g:3525:3: rule__TemporalFilter__StartDateAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TemporalFilter__StartDateAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTemporalFilterAccess().getStartDateAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_0__2__Impl"


    // $ANTLR start "rule__TemporalFilter__Group_1__0"
    // InternalResumeDsl.g:3534:1: rule__TemporalFilter__Group_1__0 : rule__TemporalFilter__Group_1__0__Impl rule__TemporalFilter__Group_1__1 ;
    public final void rule__TemporalFilter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3538:1: ( rule__TemporalFilter__Group_1__0__Impl rule__TemporalFilter__Group_1__1 )
            // InternalResumeDsl.g:3539:2: rule__TemporalFilter__Group_1__0__Impl rule__TemporalFilter__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__TemporalFilter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalFilter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_1__0"


    // $ANTLR start "rule__TemporalFilter__Group_1__0__Impl"
    // InternalResumeDsl.g:3546:1: rule__TemporalFilter__Group_1__0__Impl : ( 'endDate' ) ;
    public final void rule__TemporalFilter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3550:1: ( ( 'endDate' ) )
            // InternalResumeDsl.g:3551:1: ( 'endDate' )
            {
            // InternalResumeDsl.g:3551:1: ( 'endDate' )
            // InternalResumeDsl.g:3552:2: 'endDate'
            {
             before(grammarAccess.getTemporalFilterAccess().getEndDateKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTemporalFilterAccess().getEndDateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_1__0__Impl"


    // $ANTLR start "rule__TemporalFilter__Group_1__1"
    // InternalResumeDsl.g:3561:1: rule__TemporalFilter__Group_1__1 : rule__TemporalFilter__Group_1__1__Impl rule__TemporalFilter__Group_1__2 ;
    public final void rule__TemporalFilter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3565:1: ( rule__TemporalFilter__Group_1__1__Impl rule__TemporalFilter__Group_1__2 )
            // InternalResumeDsl.g:3566:2: rule__TemporalFilter__Group_1__1__Impl rule__TemporalFilter__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__TemporalFilter__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalFilter__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_1__1"


    // $ANTLR start "rule__TemporalFilter__Group_1__1__Impl"
    // InternalResumeDsl.g:3573:1: rule__TemporalFilter__Group_1__1__Impl : ( 'before' ) ;
    public final void rule__TemporalFilter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3577:1: ( ( 'before' ) )
            // InternalResumeDsl.g:3578:1: ( 'before' )
            {
            // InternalResumeDsl.g:3578:1: ( 'before' )
            // InternalResumeDsl.g:3579:2: 'before'
            {
             before(grammarAccess.getTemporalFilterAccess().getBeforeKeyword_1_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTemporalFilterAccess().getBeforeKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_1__1__Impl"


    // $ANTLR start "rule__TemporalFilter__Group_1__2"
    // InternalResumeDsl.g:3588:1: rule__TemporalFilter__Group_1__2 : rule__TemporalFilter__Group_1__2__Impl ;
    public final void rule__TemporalFilter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3592:1: ( rule__TemporalFilter__Group_1__2__Impl )
            // InternalResumeDsl.g:3593:2: rule__TemporalFilter__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalFilter__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_1__2"


    // $ANTLR start "rule__TemporalFilter__Group_1__2__Impl"
    // InternalResumeDsl.g:3599:1: rule__TemporalFilter__Group_1__2__Impl : ( ( rule__TemporalFilter__EndDateAssignment_1_2 ) ) ;
    public final void rule__TemporalFilter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3603:1: ( ( ( rule__TemporalFilter__EndDateAssignment_1_2 ) ) )
            // InternalResumeDsl.g:3604:1: ( ( rule__TemporalFilter__EndDateAssignment_1_2 ) )
            {
            // InternalResumeDsl.g:3604:1: ( ( rule__TemporalFilter__EndDateAssignment_1_2 ) )
            // InternalResumeDsl.g:3605:2: ( rule__TemporalFilter__EndDateAssignment_1_2 )
            {
             before(grammarAccess.getTemporalFilterAccess().getEndDateAssignment_1_2()); 
            // InternalResumeDsl.g:3606:2: ( rule__TemporalFilter__EndDateAssignment_1_2 )
            // InternalResumeDsl.g:3606:3: rule__TemporalFilter__EndDateAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TemporalFilter__EndDateAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTemporalFilterAccess().getEndDateAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__Group_1__2__Impl"


    // $ANTLR start "rule__StringList__Group__0"
    // InternalResumeDsl.g:3615:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3619:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // InternalResumeDsl.g:3620:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0"


    // $ANTLR start "rule__StringList__Group__0__Impl"
    // InternalResumeDsl.g:3627:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3631:1: ( ( '[' ) )
            // InternalResumeDsl.g:3632:1: ( '[' )
            {
            // InternalResumeDsl.g:3632:1: ( '[' )
            // InternalResumeDsl.g:3633:2: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0__Impl"


    // $ANTLR start "rule__StringList__Group__1"
    // InternalResumeDsl.g:3642:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3646:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // InternalResumeDsl.g:3647:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1"


    // $ANTLR start "rule__StringList__Group__1__Impl"
    // InternalResumeDsl.g:3654:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3658:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // InternalResumeDsl.g:3659:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // InternalResumeDsl.g:3659:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // InternalResumeDsl.g:3660:2: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // InternalResumeDsl.g:3661:2: ( rule__StringList__ValuesAssignment_1 )
            // InternalResumeDsl.g:3661:3: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringList__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1__Impl"


    // $ANTLR start "rule__StringList__Group__2"
    // InternalResumeDsl.g:3669:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3673:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // InternalResumeDsl.g:3674:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__2"


    // $ANTLR start "rule__StringList__Group__2__Impl"
    // InternalResumeDsl.g:3681:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3685:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // InternalResumeDsl.g:3686:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // InternalResumeDsl.g:3686:1: ( ( rule__StringList__Group_2__0 )* )
            // InternalResumeDsl.g:3687:2: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // InternalResumeDsl.g:3688:2: ( rule__StringList__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalResumeDsl.g:3688:3: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStringListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__2__Impl"


    // $ANTLR start "rule__StringList__Group__3"
    // InternalResumeDsl.g:3696:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3700:1: ( rule__StringList__Group__3__Impl )
            // InternalResumeDsl.g:3701:2: rule__StringList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__3"


    // $ANTLR start "rule__StringList__Group__3__Impl"
    // InternalResumeDsl.g:3707:1: rule__StringList__Group__3__Impl : ( ']' ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3711:1: ( ( ']' ) )
            // InternalResumeDsl.g:3712:1: ( ']' )
            {
            // InternalResumeDsl.g:3712:1: ( ']' )
            // InternalResumeDsl.g:3713:2: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__3__Impl"


    // $ANTLR start "rule__StringList__Group_2__0"
    // InternalResumeDsl.g:3723:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3727:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // InternalResumeDsl.g:3728:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__0"


    // $ANTLR start "rule__StringList__Group_2__0__Impl"
    // InternalResumeDsl.g:3735:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3739:1: ( ( ',' ) )
            // InternalResumeDsl.g:3740:1: ( ',' )
            {
            // InternalResumeDsl.g:3740:1: ( ',' )
            // InternalResumeDsl.g:3741:2: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__0__Impl"


    // $ANTLR start "rule__StringList__Group_2__1"
    // InternalResumeDsl.g:3750:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3754:1: ( rule__StringList__Group_2__1__Impl )
            // InternalResumeDsl.g:3755:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__1"


    // $ANTLR start "rule__StringList__Group_2__1__Impl"
    // InternalResumeDsl.g:3761:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3765:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // InternalResumeDsl.g:3766:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // InternalResumeDsl.g:3766:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // InternalResumeDsl.g:3767:2: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // InternalResumeDsl.g:3768:2: ( rule__StringList__ValuesAssignment_2_1 )
            // InternalResumeDsl.g:3768:3: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StringList__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__1__Impl"


    // $ANTLR start "rule__Profile__MetadataAssignment_0"
    // InternalResumeDsl.g:3777:1: rule__Profile__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__Profile__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3781:1: ( ( ruleMetadata ) )
            // InternalResumeDsl.g:3782:2: ( ruleMetadata )
            {
            // InternalResumeDsl.g:3782:2: ( ruleMetadata )
            // InternalResumeDsl.g:3783:3: ruleMetadata
            {
             before(grammarAccess.getProfileAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__MetadataAssignment_0"


    // $ANTLR start "rule__Profile__UserdataAssignment_1"
    // InternalResumeDsl.g:3792:1: rule__Profile__UserdataAssignment_1 : ( ruleUserdata ) ;
    public final void rule__Profile__UserdataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3796:1: ( ( ruleUserdata ) )
            // InternalResumeDsl.g:3797:2: ( ruleUserdata )
            {
            // InternalResumeDsl.g:3797:2: ( ruleUserdata )
            // InternalResumeDsl.g:3798:3: ruleUserdata
            {
             before(grammarAccess.getProfileAccess().getUserdataUserdataParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserdata();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getUserdataUserdataParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__UserdataAssignment_1"


    // $ANTLR start "rule__Profile__SectionsAssignment_2"
    // InternalResumeDsl.g:3807:1: rule__Profile__SectionsAssignment_2 : ( ruleSection ) ;
    public final void rule__Profile__SectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3811:1: ( ( ruleSection ) )
            // InternalResumeDsl.g:3812:2: ( ruleSection )
            {
            // InternalResumeDsl.g:3812:2: ( ruleSection )
            // InternalResumeDsl.g:3813:3: ruleSection
            {
             before(grammarAccess.getProfileAccess().getSectionsSectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getSectionsSectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__SectionsAssignment_2"


    // $ANTLR start "rule__Profile__CustomizationAssignment_3"
    // InternalResumeDsl.g:3822:1: rule__Profile__CustomizationAssignment_3 : ( ruleCustomization ) ;
    public final void rule__Profile__CustomizationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3826:1: ( ( ruleCustomization ) )
            // InternalResumeDsl.g:3827:2: ( ruleCustomization )
            {
            // InternalResumeDsl.g:3827:2: ( ruleCustomization )
            // InternalResumeDsl.g:3828:3: ruleCustomization
            {
             before(grammarAccess.getProfileAccess().getCustomizationCustomizationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomization();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getCustomizationCustomizationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__CustomizationAssignment_3"


    // $ANTLR start "rule__Metadata__StyleAssignment_2"
    // InternalResumeDsl.g:3837:1: rule__Metadata__StyleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Metadata__StyleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3841:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3842:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3842:2: ( RULE_STRING )
            // InternalResumeDsl.g:3843:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getStyleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getStyleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__StyleAssignment_2"


    // $ANTLR start "rule__Metadata__FontAssignment_4"
    // InternalResumeDsl.g:3852:1: rule__Metadata__FontAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Metadata__FontAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3856:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3857:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3857:2: ( RULE_STRING )
            // InternalResumeDsl.g:3858:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getFontSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getFontSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__FontAssignment_4"


    // $ANTLR start "rule__Metadata__ImgPathAssignment_6"
    // InternalResumeDsl.g:3867:1: rule__Metadata__ImgPathAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Metadata__ImgPathAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3871:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3872:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3872:2: ( RULE_STRING )
            // InternalResumeDsl.g:3873:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getImgPathSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getImgPathSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__ImgPathAssignment_6"


    // $ANTLR start "rule__Userdata__NameAssignment_2"
    // InternalResumeDsl.g:3882:1: rule__Userdata__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Userdata__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3886:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3887:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3887:2: ( RULE_STRING )
            // InternalResumeDsl.g:3888:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__NameAssignment_2"


    // $ANTLR start "rule__Userdata__EmailAssignment_4"
    // InternalResumeDsl.g:3897:1: rule__Userdata__EmailAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Userdata__EmailAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3901:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3902:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3902:2: ( RULE_STRING )
            // InternalResumeDsl.g:3903:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getEmailSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getEmailSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__EmailAssignment_4"


    // $ANTLR start "rule__Userdata__TelephoneNumberAssignment_6"
    // InternalResumeDsl.g:3912:1: rule__Userdata__TelephoneNumberAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Userdata__TelephoneNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3916:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3917:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3917:2: ( RULE_STRING )
            // InternalResumeDsl.g:3918:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getTelephoneNumberSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getTelephoneNumberSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__TelephoneNumberAssignment_6"


    // $ANTLR start "rule__Userdata__DirectionAssignment_8"
    // InternalResumeDsl.g:3927:1: rule__Userdata__DirectionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Userdata__DirectionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3931:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3932:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3932:2: ( RULE_STRING )
            // InternalResumeDsl.g:3933:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getDirectionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getDirectionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__DirectionAssignment_8"


    // $ANTLR start "rule__Userdata__CityAssignment_10"
    // InternalResumeDsl.g:3942:1: rule__Userdata__CityAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Userdata__CityAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3946:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3947:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3947:2: ( RULE_STRING )
            // InternalResumeDsl.g:3948:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getCitySTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCitySTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__CityAssignment_10"


    // $ANTLR start "rule__Userdata__CountryAssignment_12"
    // InternalResumeDsl.g:3957:1: rule__Userdata__CountryAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Userdata__CountryAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3961:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3962:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3962:2: ( RULE_STRING )
            // InternalResumeDsl.g:3963:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getCountrySTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCountrySTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__CountryAssignment_12"


    // $ANTLR start "rule__Experience__LanguageAssignment_2"
    // InternalResumeDsl.g:3972:1: rule__Experience__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Experience__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3976:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:3977:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:3977:2: ( RULE_STRING )
            // InternalResumeDsl.g:3978:3: RULE_STRING
            {
             before(grammarAccess.getExperienceAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__LanguageAssignment_2"


    // $ANTLR start "rule__Experience__JobsAssignment_3"
    // InternalResumeDsl.g:3987:1: rule__Experience__JobsAssignment_3 : ( ruleJob ) ;
    public final void rule__Experience__JobsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:3991:1: ( ( ruleJob ) )
            // InternalResumeDsl.g:3992:2: ( ruleJob )
            {
            // InternalResumeDsl.g:3992:2: ( ruleJob )
            // InternalResumeDsl.g:3993:3: ruleJob
            {
             before(grammarAccess.getExperienceAccess().getJobsJobParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJob();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getJobsJobParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__JobsAssignment_3"


    // $ANTLR start "rule__Job__TitleAssignment_1"
    // InternalResumeDsl.g:4002:1: rule__Job__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Job__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4006:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4007:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4007:2: ( RULE_STRING )
            // InternalResumeDsl.g:4008:3: RULE_STRING
            {
             before(grammarAccess.getJobAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__TitleAssignment_1"


    // $ANTLR start "rule__Job__DescriptionAssignment_3"
    // InternalResumeDsl.g:4017:1: rule__Job__DescriptionAssignment_3 : ( ruleStringList ) ;
    public final void rule__Job__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4021:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4022:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4022:2: ( ruleStringList )
            // InternalResumeDsl.g:4023:3: ruleStringList
            {
             before(grammarAccess.getJobAccess().getDescriptionStringListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getJobAccess().getDescriptionStringListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__DescriptionAssignment_3"


    // $ANTLR start "rule__Job__CompanyAssignment_5"
    // InternalResumeDsl.g:4032:1: rule__Job__CompanyAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Job__CompanyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4036:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4037:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4037:2: ( RULE_STRING )
            // InternalResumeDsl.g:4038:3: RULE_STRING
            {
             before(grammarAccess.getJobAccess().getCompanySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getCompanySTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__CompanyAssignment_5"


    // $ANTLR start "rule__Job__StartDateAssignment_7"
    // InternalResumeDsl.g:4047:1: rule__Job__StartDateAssignment_7 : ( ruleDate ) ;
    public final void rule__Job__StartDateAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4051:1: ( ( ruleDate ) )
            // InternalResumeDsl.g:4052:2: ( ruleDate )
            {
            // InternalResumeDsl.g:4052:2: ( ruleDate )
            // InternalResumeDsl.g:4053:3: ruleDate
            {
             before(grammarAccess.getJobAccess().getStartDateDateParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getJobAccess().getStartDateDateParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__StartDateAssignment_7"


    // $ANTLR start "rule__Job__EndDateAssignment_9"
    // InternalResumeDsl.g:4062:1: rule__Job__EndDateAssignment_9 : ( ruleDate ) ;
    public final void rule__Job__EndDateAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4066:1: ( ( ruleDate ) )
            // InternalResumeDsl.g:4067:2: ( ruleDate )
            {
            // InternalResumeDsl.g:4067:2: ( ruleDate )
            // InternalResumeDsl.g:4068:3: ruleDate
            {
             before(grammarAccess.getJobAccess().getEndDateDateParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getJobAccess().getEndDateDateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__EndDateAssignment_9"


    // $ANTLR start "rule__Job__TagsAssignment_11"
    // InternalResumeDsl.g:4077:1: rule__Job__TagsAssignment_11 : ( ruleStringList ) ;
    public final void rule__Job__TagsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4081:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4082:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4082:2: ( ruleStringList )
            // InternalResumeDsl.g:4083:3: ruleStringList
            {
             before(grammarAccess.getJobAccess().getTagsStringListParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getJobAccess().getTagsStringListParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__TagsAssignment_11"


    // $ANTLR start "rule__Projects__LanguageAssignment_2"
    // InternalResumeDsl.g:4092:1: rule__Projects__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Projects__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4096:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4097:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4097:2: ( RULE_STRING )
            // InternalResumeDsl.g:4098:3: RULE_STRING
            {
             before(grammarAccess.getProjectsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__LanguageAssignment_2"


    // $ANTLR start "rule__Projects__ProjectsAssignment_3"
    // InternalResumeDsl.g:4107:1: rule__Projects__ProjectsAssignment_3 : ( ruleProject ) ;
    public final void rule__Projects__ProjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4111:1: ( ( ruleProject ) )
            // InternalResumeDsl.g:4112:2: ( ruleProject )
            {
            // InternalResumeDsl.g:4112:2: ( ruleProject )
            // InternalResumeDsl.g:4113:3: ruleProject
            {
             before(grammarAccess.getProjectsAccess().getProjectsProjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectsAccess().getProjectsProjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__ProjectsAssignment_3"


    // $ANTLR start "rule__Project__TitleAssignment_1"
    // InternalResumeDsl.g:4122:1: rule__Project__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4126:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4127:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4127:2: ( RULE_STRING )
            // InternalResumeDsl.g:4128:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TitleAssignment_1"


    // $ANTLR start "rule__Project__DescriptionAssignment_3"
    // InternalResumeDsl.g:4137:1: rule__Project__DescriptionAssignment_3 : ( ruleStringList ) ;
    public final void rule__Project__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4141:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4142:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4142:2: ( ruleStringList )
            // InternalResumeDsl.g:4143:3: ruleStringList
            {
             before(grammarAccess.getProjectAccess().getDescriptionStringListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getDescriptionStringListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__DescriptionAssignment_3"


    // $ANTLR start "rule__Project__TechnologiesAssignment_5"
    // InternalResumeDsl.g:4152:1: rule__Project__TechnologiesAssignment_5 : ( ruleStringList ) ;
    public final void rule__Project__TechnologiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4156:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4157:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4157:2: ( ruleStringList )
            // InternalResumeDsl.g:4158:3: ruleStringList
            {
             before(grammarAccess.getProjectAccess().getTechnologiesStringListParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTechnologiesStringListParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TechnologiesAssignment_5"


    // $ANTLR start "rule__Project__LinkAssignment_7"
    // InternalResumeDsl.g:4167:1: rule__Project__LinkAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Project__LinkAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4171:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4172:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4172:2: ( RULE_STRING )
            // InternalResumeDsl.g:4173:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getLinkSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLinkSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__LinkAssignment_7"


    // $ANTLR start "rule__Project__TagsAssignment_9"
    // InternalResumeDsl.g:4182:1: rule__Project__TagsAssignment_9 : ( ruleStringList ) ;
    public final void rule__Project__TagsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4186:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4187:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4187:2: ( ruleStringList )
            // InternalResumeDsl.g:4188:3: ruleStringList
            {
             before(grammarAccess.getProjectAccess().getTagsStringListParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTagsStringListParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TagsAssignment_9"


    // $ANTLR start "rule__Education__LanguageAssignment_2"
    // InternalResumeDsl.g:4197:1: rule__Education__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Education__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4201:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4202:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4202:2: ( RULE_STRING )
            // InternalResumeDsl.g:4203:3: RULE_STRING
            {
             before(grammarAccess.getEducationAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEducationAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__LanguageAssignment_2"


    // $ANTLR start "rule__Education__DegreesAssignment_3"
    // InternalResumeDsl.g:4212:1: rule__Education__DegreesAssignment_3 : ( ruleDegree ) ;
    public final void rule__Education__DegreesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4216:1: ( ( ruleDegree ) )
            // InternalResumeDsl.g:4217:2: ( ruleDegree )
            {
            // InternalResumeDsl.g:4217:2: ( ruleDegree )
            // InternalResumeDsl.g:4218:3: ruleDegree
            {
             before(grammarAccess.getEducationAccess().getDegreesDegreeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDegree();

            state._fsp--;

             after(grammarAccess.getEducationAccess().getDegreesDegreeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__DegreesAssignment_3"


    // $ANTLR start "rule__Degree__TitleAssignment_1"
    // InternalResumeDsl.g:4227:1: rule__Degree__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Degree__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4231:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4232:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4232:2: ( RULE_STRING )
            // InternalResumeDsl.g:4233:3: RULE_STRING
            {
             before(grammarAccess.getDegreeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__TitleAssignment_1"


    // $ANTLR start "rule__Degree__InstitutionAssignment_3"
    // InternalResumeDsl.g:4242:1: rule__Degree__InstitutionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Degree__InstitutionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4246:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4247:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4247:2: ( RULE_STRING )
            // InternalResumeDsl.g:4248:3: RULE_STRING
            {
             before(grammarAccess.getDegreeAccess().getInstitutionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getInstitutionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__InstitutionAssignment_3"


    // $ANTLR start "rule__Degree__GraduationDateAssignment_5"
    // InternalResumeDsl.g:4257:1: rule__Degree__GraduationDateAssignment_5 : ( ruleDate ) ;
    public final void rule__Degree__GraduationDateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4261:1: ( ( ruleDate ) )
            // InternalResumeDsl.g:4262:2: ( ruleDate )
            {
            // InternalResumeDsl.g:4262:2: ( ruleDate )
            // InternalResumeDsl.g:4263:3: ruleDate
            {
             before(grammarAccess.getDegreeAccess().getGraduationDateDateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDegreeAccess().getGraduationDateDateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__GraduationDateAssignment_5"


    // $ANTLR start "rule__Degree__CountryAssignment_7"
    // InternalResumeDsl.g:4272:1: rule__Degree__CountryAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Degree__CountryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4276:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4277:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4277:2: ( RULE_STRING )
            // InternalResumeDsl.g:4278:3: RULE_STRING
            {
             before(grammarAccess.getDegreeAccess().getCountrySTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getCountrySTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__CountryAssignment_7"


    // $ANTLR start "rule__Degree__TagsAssignment_9"
    // InternalResumeDsl.g:4287:1: rule__Degree__TagsAssignment_9 : ( ruleStringList ) ;
    public final void rule__Degree__TagsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4291:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4292:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4292:2: ( ruleStringList )
            // InternalResumeDsl.g:4293:3: ruleStringList
            {
             before(grammarAccess.getDegreeAccess().getTagsStringListParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getDegreeAccess().getTagsStringListParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__TagsAssignment_9"


    // $ANTLR start "rule__Skills__LanguageAssignment_2"
    // InternalResumeDsl.g:4302:1: rule__Skills__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Skills__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4306:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4307:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4307:2: ( RULE_STRING )
            // InternalResumeDsl.g:4308:3: RULE_STRING
            {
             before(grammarAccess.getSkillsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSkillsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__LanguageAssignment_2"


    // $ANTLR start "rule__Skills__SkillsAssignment_3"
    // InternalResumeDsl.g:4317:1: rule__Skills__SkillsAssignment_3 : ( ruleSkill ) ;
    public final void rule__Skills__SkillsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4321:1: ( ( ruleSkill ) )
            // InternalResumeDsl.g:4322:2: ( ruleSkill )
            {
            // InternalResumeDsl.g:4322:2: ( ruleSkill )
            // InternalResumeDsl.g:4323:3: ruleSkill
            {
             before(grammarAccess.getSkillsAccess().getSkillsSkillParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSkill();

            state._fsp--;

             after(grammarAccess.getSkillsAccess().getSkillsSkillParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__SkillsAssignment_3"


    // $ANTLR start "rule__Skill__TitleAssignment_1"
    // InternalResumeDsl.g:4332:1: rule__Skill__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Skill__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4336:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4337:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4337:2: ( RULE_STRING )
            // InternalResumeDsl.g:4338:3: RULE_STRING
            {
             before(grammarAccess.getSkillAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSkillAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__TitleAssignment_1"


    // $ANTLR start "rule__Skill__TagsAssignment_3"
    // InternalResumeDsl.g:4347:1: rule__Skill__TagsAssignment_3 : ( ruleStringList ) ;
    public final void rule__Skill__TagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4351:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4352:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4352:2: ( ruleStringList )
            // InternalResumeDsl.g:4353:3: ruleStringList
            {
             before(grammarAccess.getSkillAccess().getTagsStringListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getSkillAccess().getTagsStringListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__TagsAssignment_3"


    // $ANTLR start "rule__Interests__LanguageAssignment_2"
    // InternalResumeDsl.g:4362:1: rule__Interests__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Interests__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4366:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4367:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4367:2: ( RULE_STRING )
            // InternalResumeDsl.g:4368:3: RULE_STRING
            {
             before(grammarAccess.getInterestsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__LanguageAssignment_2"


    // $ANTLR start "rule__Interests__TagsAssignment_4"
    // InternalResumeDsl.g:4377:1: rule__Interests__TagsAssignment_4 : ( ruleStringList ) ;
    public final void rule__Interests__TagsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4381:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4382:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4382:2: ( ruleStringList )
            // InternalResumeDsl.g:4383:3: ruleStringList
            {
             before(grammarAccess.getInterestsAccess().getTagsStringListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getInterestsAccess().getTagsStringListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__TagsAssignment_4"


    // $ANTLR start "rule__Languages__LanguageAssignment_2"
    // InternalResumeDsl.g:4392:1: rule__Languages__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Languages__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4396:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4397:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4397:2: ( RULE_STRING )
            // InternalResumeDsl.g:4398:3: RULE_STRING
            {
             before(grammarAccess.getLanguagesAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__LanguageAssignment_2"


    // $ANTLR start "rule__Languages__TagsAssignment_4"
    // InternalResumeDsl.g:4407:1: rule__Languages__TagsAssignment_4 : ( ruleStringList ) ;
    public final void rule__Languages__TagsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4411:1: ( ( ruleStringList ) )
            // InternalResumeDsl.g:4412:2: ( ruleStringList )
            {
            // InternalResumeDsl.g:4412:2: ( ruleStringList )
            // InternalResumeDsl.g:4413:3: ruleStringList
            {
             before(grammarAccess.getLanguagesAccess().getTagsStringListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getLanguagesAccess().getTagsStringListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__TagsAssignment_4"


    // $ANTLR start "rule__Customization__LanguageAssignment_5"
    // InternalResumeDsl.g:4422:1: rule__Customization__LanguageAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Customization__LanguageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4426:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4427:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4427:2: ( RULE_STRING )
            // InternalResumeDsl.g:4428:3: RULE_STRING
            {
             before(grammarAccess.getCustomizationAccess().getLanguageSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getLanguageSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__LanguageAssignment_5"


    // $ANTLR start "rule__Customization__RulesAssignment_6"
    // InternalResumeDsl.g:4437:1: rule__Customization__RulesAssignment_6 : ( ruleRule ) ;
    public final void rule__Customization__RulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4441:1: ( ( ruleRule ) )
            // InternalResumeDsl.g:4442:2: ( ruleRule )
            {
            // InternalResumeDsl.g:4442:2: ( ruleRule )
            // InternalResumeDsl.g:4443:3: ruleRule
            {
             before(grammarAccess.getCustomizationAccess().getRulesRuleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCustomizationAccess().getRulesRuleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__RulesAssignment_6"


    // $ANTLR start "rule__Rule__SectionTypeAssignment_1"
    // InternalResumeDsl.g:4452:1: rule__Rule__SectionTypeAssignment_1 : ( ruleSectionType ) ;
    public final void rule__Rule__SectionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4456:1: ( ( ruleSectionType ) )
            // InternalResumeDsl.g:4457:2: ( ruleSectionType )
            {
            // InternalResumeDsl.g:4457:2: ( ruleSectionType )
            // InternalResumeDsl.g:4458:3: ruleSectionType
            {
             before(grammarAccess.getRuleAccess().getSectionTypeSectionTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSectionTypeSectionTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SectionTypeAssignment_1"


    // $ANTLR start "rule__Rule__FilterAssignment_3"
    // InternalResumeDsl.g:4467:1: rule__Rule__FilterAssignment_3 : ( ruleFilter ) ;
    public final void rule__Rule__FilterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4471:1: ( ( ruleFilter ) )
            // InternalResumeDsl.g:4472:2: ( ruleFilter )
            {
            // InternalResumeDsl.g:4472:2: ( ruleFilter )
            // InternalResumeDsl.g:4473:3: ruleFilter
            {
             before(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__FilterAssignment_3"


    // $ANTLR start "rule__GeneralFilter__TagAssignment_2"
    // InternalResumeDsl.g:4482:1: rule__GeneralFilter__TagAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GeneralFilter__TagAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4486:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4487:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4487:2: ( RULE_STRING )
            // InternalResumeDsl.g:4488:3: RULE_STRING
            {
             before(grammarAccess.getGeneralFilterAccess().getTagSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneralFilterAccess().getTagSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralFilter__TagAssignment_2"


    // $ANTLR start "rule__TemporalFilter__StartDateAssignment_0_2"
    // InternalResumeDsl.g:4497:1: rule__TemporalFilter__StartDateAssignment_0_2 : ( ruleDate ) ;
    public final void rule__TemporalFilter__StartDateAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4501:1: ( ( ruleDate ) )
            // InternalResumeDsl.g:4502:2: ( ruleDate )
            {
            // InternalResumeDsl.g:4502:2: ( ruleDate )
            // InternalResumeDsl.g:4503:3: ruleDate
            {
             before(grammarAccess.getTemporalFilterAccess().getStartDateDateParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getTemporalFilterAccess().getStartDateDateParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__StartDateAssignment_0_2"


    // $ANTLR start "rule__TemporalFilter__EndDateAssignment_1_2"
    // InternalResumeDsl.g:4512:1: rule__TemporalFilter__EndDateAssignment_1_2 : ( ruleDate ) ;
    public final void rule__TemporalFilter__EndDateAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4516:1: ( ( ruleDate ) )
            // InternalResumeDsl.g:4517:2: ( ruleDate )
            {
            // InternalResumeDsl.g:4517:2: ( ruleDate )
            // InternalResumeDsl.g:4518:3: ruleDate
            {
             before(grammarAccess.getTemporalFilterAccess().getEndDateDateParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getTemporalFilterAccess().getEndDateDateParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalFilter__EndDateAssignment_1_2"


    // $ANTLR start "rule__StringList__ValuesAssignment_1"
    // InternalResumeDsl.g:4527:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4531:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4532:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4532:2: ( RULE_STRING )
            // InternalResumeDsl.g:4533:3: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_1"


    // $ANTLR start "rule__StringList__ValuesAssignment_2_1"
    // InternalResumeDsl.g:4542:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResumeDsl.g:4546:1: ( ( RULE_STRING ) )
            // InternalResumeDsl.g:4547:2: ( RULE_STRING )
            {
            // InternalResumeDsl.g:4547:2: ( RULE_STRING )
            // InternalResumeDsl.g:4548:3: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000B00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000002L});

}