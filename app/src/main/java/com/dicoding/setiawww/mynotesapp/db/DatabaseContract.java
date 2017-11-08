package com.dicoding.setiawww.mynotesapp.db;

import android.provider.BaseColumns;

/**
 * Created by setiawww on 19/10/2017.
 */

public class DatabaseContract {

    static String TABLE_NOTE = "note";
    static final class NoteColumns implements BaseColumns {
        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";
    }
}
