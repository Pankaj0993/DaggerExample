package com.text.daggerexample

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject


interface  NotificationService{
    fun sned(to: String, from: String, body: String)
}
class EmailService @Inject constructor(): NotificationService{
    val TAG : String = "DaggerTest"
    override fun sned(to: String, from: String, body: String){
        Log.d(TAG,"Email Send")
    }
}


class MessageService : NotificationService{
    val TAG : String = "DaggerTest"
    override fun sned(to: String, from: String, body: String) {
        Log.d(TAG,"Message Send")
    }

}