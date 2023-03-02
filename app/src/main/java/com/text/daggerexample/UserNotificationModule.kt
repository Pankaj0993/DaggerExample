package com.text.daggerexample

import dagger.Module
import dagger.Provides


@Module
class UserNotificationModule {

    @Provides
    fun getMessageService(): NotificationService{
        return MessageService()
    }
}