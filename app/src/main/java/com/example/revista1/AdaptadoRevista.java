package com.example.revista1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class AdaptadoRevista extends ArrayAdapter<revista> {
    public AdaptadoRevista(Context context, ArrayList<revista> datos)  {
        super(context, R.layout.item, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item, null);
        TextView txtMes = (TextView)item.findViewById(R.id.txtA);
        txtMes.setText(getItem(position).getAnio());
        TextView txtCategoria = (TextView)item.findViewById(R.id.txtM);
        txtCategoria.setText(getItem(position).getMes());
        TextView txtDescripcion = (TextView)item.findViewById(R.id.txtDescrip);
        txtDescripcion.setText((getItem(position).getUrlpw()));
        ImageView imageView = (ImageView)item.findViewById(R.id.imagen);
        Glide.with(this.getContext())
                .load(getItem(position).getUrlportada())
                .into(imageView);

        return(item);


    }
}
