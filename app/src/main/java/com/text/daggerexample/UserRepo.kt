package com.text.daggerexample

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject



interface UserRepo{
    fun saveUser(email: String, pass: String)
}
class SqlRepo @Inject constructor(): UserRepo {

    val TAG : String = "DaggerTest"

    override fun saveUser(email: String, pass: String){
        Log.d(TAG,"User save in SqlRepo")
    }
}


class FirebaseRepo : UserRepo{
    val TAG : String = "DaggerTest"
    override fun saveUser(email: String, pass: String) {
        Log.d(TAG,"User save in FirebaseRepo")
    }

}