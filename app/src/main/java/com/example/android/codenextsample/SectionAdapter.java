package com.example.android.codenextsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SectionAdapter extends ArrayAdapter<SectionItem> {
    private int layout;

    public SectionAdapter(Context context, int layout, ArrayList<SectionItem> sectionItems) {
        super(context, 0, sectionItems);
        this.layout = layout;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SectionItem sectionItem = getItem(position);
        if(convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(this.layout, parent, false);
        }

        ImageView sectionItemImageView = convertView.findViewById(R.id.item_photo);
        TextView sectionItemTextView = convertView.findViewById(R.id.item_title);

        sectionItemTextView.setText(sectionItem.getTitle());
        sectionItemImageView.setImageResource(sectionItem.getPhoto());

        return convertView;
    }
}
