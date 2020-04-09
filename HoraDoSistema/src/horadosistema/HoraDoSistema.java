/*
 * Class: 4
 * Class example
 * Objective: To create a code to get the system time
 * @author Cassio - 09Apr2020
 * help: https://www.youtube.com/watch?v=H7Qpt8NRpDw&list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR&index=10&t=0s
 */

package horadosistema;

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date(); //new: criar novo objeto
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
    
}
