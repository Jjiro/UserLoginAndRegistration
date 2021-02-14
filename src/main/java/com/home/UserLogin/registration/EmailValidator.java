package com.home.UserLogin.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class EmailValidator implements Predicate<String> {

    public static final String EMAIL_VERIFICATION = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,6}$";
    public static final String EMAIL_VERIF = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";

   // public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Override
    public boolean test(String username) {
        //Validate email address

       /* boolean exist = true;
        if (username.contains("@")) {
            if (accountFactory.getFullAccountForEmail(username) == null) {
                if (!EmailValidator.getInstance().isValid(username))
                    exist = true;
                else
                    exist = false;

            }
        } else {
            if (accountFactory.getFullAccountForUsername(username) == null) {
                if (!username.matches("(\\w+|\\d+)"))
                    exist = true;
                else
                    exist = false;
            }
        }
        return exist;*/
        return true;
    }


      /*  public static boolean validate (String username){
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(username);
            return matcher.find();

    }  }*/
}
