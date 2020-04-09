/*
 * Class: 4 (exercises)
 * First homework
 * Objective: To create a code to get the system language
 * @author Cassio - 09Apr2020
 * help: https://howtodoinjava.com/java/date-time/how-to-get-current-user-locale-in-java/
 */

package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale computerLanguage = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(computerLanguage.toString());
    }
    
}
