// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package firstDemo.stuffYouDontHaveToUnderstand;


import java.io.Serializable;


/**
 * Task: For information see ReadMe.txt resp. task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class EnvironmentAnalyzer implements Serializable {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_002___2022_06_11__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    final static private long  serialVersionUID = version.getVersionNumber();
    
    
    
    
    
    /**
     * ...
     * 
     * @return ..
     */
    public static int getAvailableCores() {
        return Runtime.getRuntime().availableProcessors();
    }//method()
    
    /**
     * ...
     * 
     * @return ...
     */
    public static String getJavaVersion(){
        final String rawVersion = System.getProperty( "java.version" );
        if( rawVersion.startsWith("1.") ){
            return String.format( "%s (%s)",  rawVersion.substring( 2 ), rawVersion );
        }else{
            return rawVersion;
        }//if
    }// method()
    
}//class
//see: https://stackoverflow.com/questions/59377304/accessing-junit-version-during-runtime
