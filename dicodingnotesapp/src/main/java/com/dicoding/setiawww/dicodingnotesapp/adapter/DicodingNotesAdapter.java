package com.dicoding.setiawww.dicodingnotesapp.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.dicoding.setiawww.dicodingnotesapp.R;

import static com.dicoding.setiawww.dicodingnotesapp.db.DatabaseContract.NoteColumns.DATE;
import static com.dicoding.setiawww.dicodingnotesapp.db.DatabaseContract.NoteColumns.DESCRIPTION;
import static com.dicoding.setiawww.dicodingnotesapp.db.DatabaseContract.NoteColumns.TITLE;
import static com.dicoding.setiawww.dicodingnotesapp.db.DatabaseContract.getColumnString;

/**
 * Created by setiawww on 8/11/2017.
 */

public class DicodingNotesAdapter extends CursorAdapter {

    public DicodingNotesAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }


    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_dicoding_note, viewGroup, false);
        return view;
    }


    @Override
    public Cursor getCursor() {
        return super.getCursor();
    }


    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        if (cursor != null){
            TextView tvTitle = (TextView)view.findViewById(R.id.tv_item_title);
            TextView tvDate = (TextView)view.findViewById(R.id.tv_item_date);
            TextView tvDescription = (TextView)view.findViewById(R.id.tv_item_description);

            tvTitle.setText(getColumnString(cursor,TITLE));
            tvDescription.setText(getColumnString(cursor,DESCRIPTION));
            tvDate.setText(getColumnString(cursor,DATE));
        }
    }
}
