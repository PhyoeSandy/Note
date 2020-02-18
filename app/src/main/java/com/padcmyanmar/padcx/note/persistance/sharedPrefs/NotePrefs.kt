package com.padcmyanmar.padcx.note.persistance.sharedPrefs

import android.content.Context
import com.padcmyanmar.padcx.note.root.NoteApp

/**
 * Created by Phyoe Sandy Soe Tun
 * on 2/18/2020.
 */
object NotePrefs {
    private const val NOTE_SHARED_PREFS = "NOTE_SHARED_PREFS"
    private const val SHARED_PREFS_NOTE_DISPLAY_STYLE = "SHARED_PREFS_NOTE_DISPLAY_STYLE"

    private fun sharedPrefs() =
        NoteApp.getAppContext().getSharedPreferences(NOTE_SHARED_PREFS,Context.MODE_PRIVATE)

        /**
         * @param styleValueString: note display style >> list or grid
         */
    fun saveNoteDisplayStyle(styleValueString: String){
            val editor = sharedPrefs().edit()
            editor.putString(SHARED_PREFS_NOTE_DISPLAY_STYLE,styleValueString)
                .apply()
        }

    fun getNoteDisplayStyle() = sharedPrefs().getString(
        SHARED_PREFS_NOTE_DISPLAY_STYLE,
        "List"
    )
}