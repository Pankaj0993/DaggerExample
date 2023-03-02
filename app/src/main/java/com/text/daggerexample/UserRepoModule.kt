package com.text.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepoModule {

/*    @Provides
    fun getFirebaseRepo(): UserRepo{
        return FirebaseRepo()
    }*/

    @Binds
   abstract fun getSqlRepo(sqlRepo: SqlRepo): UserRepo

}