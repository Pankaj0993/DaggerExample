package com.text.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var  userRegistrationService : UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component =  DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistrationService.registrationUser("pankajmishramau@gmail.com","124")
    }


}