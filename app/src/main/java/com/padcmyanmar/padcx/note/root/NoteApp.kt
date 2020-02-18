package com.padcmyanmar.padcx.note.root

import android.app.Application
import android.content.Context

/**
 * Created by Phyoe Sandy Soe Tun
 * on 2/18/2020.
 */
class NoteApp : Application() {
    companion object{
        private lateinit var instance: NoteApp

        fun getAppContext(): Context = instance.applicationContext
    }

    override fun onCreate() {
        instance = this
        super.onCreate()
    }
}