package com.text.daggerexample

import dagger.Component


@Component(modules = [ UserRepoModule::class, UserNotificationModule::class])
interface UserRegistrationComponent {

    /*fun getUserRegistrionService(): UserRegistrationService

    fun getEmailService(): EmailService*/

    fun inject(mainActivity: MainActivity)

}