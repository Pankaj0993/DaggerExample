package com.text.daggerexample

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepo: UserRepo,
                              private val notificationService: NotificationService
) {

    fun registrationUser(email: String, pass: String){
        userRepo.saveUser(email, pass)
        notificationService.sned(email,"noreplay@gmail.com","user register")
    }
}


//unit testing
// single responsbility
// lifetime of these obj
//extensible