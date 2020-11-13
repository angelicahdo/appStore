package edu.unicauca.appstore.Adaptadores;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.unicauca.appstore.Entidades.Persona;
import edu.unicauca.appstore.R;

public class AdapterPersona extends RecyclerView.Adapter<AdapterPersona.ViewHolderPersona>  {

    ArrayList<Persona>listaPersona;

    public AdapterPersona(ArrayList<Persona> listaPersona){
        this.listaPersona = listaPersona;
    }

    //Carga el layout en la view y retoma la view
    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ropa,null, false);

        return new ViewHolderPersona(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int position) {
        holder.nombre.setText(listaPersona.get(position).getNombre());
        holder.precio.setText(listaPersona.get(position).getPrecio());
        holder.foto.setImageResource(listaPersona.get(position).getFoto());

    }
    //retomar el tamaño de la lista
    @Override
    public int getItemCount() {
        return listaPersona.size();
    }


    public class ViewHolderPersona extends RecyclerView.ViewHolder {
        //CREAMOS LOS OBJETOS
        TextView nombre;
        TextView precio;
        ImageView foto;
        //CAPTURA LA LISTA CON EL METODO SUPER
        public ViewHolderPersona(@NonNull View itemView) {
            super(itemView);
            nombre =(TextView)itemView.findViewById(R.id.titulo_persona);
            precio =(TextView)itemView.findViewById(R.id.precio_persona);
            foto =(ImageView) itemView.findViewById(R.id.imagen_persona);


        }
    }
}
