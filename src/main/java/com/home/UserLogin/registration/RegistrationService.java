package com.home.UserLogin.registration;

import com.home.UserLogin.appUser.AppUser;
import com.home.UserLogin.appUser.AppUserRole;
import com.home.UserLogin.appUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class RegistrationService {

    private final EmailValidator emailValidator;
    private final AppUserService appUserService;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("Email is not valid!");
        }
        return appUserService.signUpUser( new AppUser(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                AppUserRole.USER)
        );
    }
}
