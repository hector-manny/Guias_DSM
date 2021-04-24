package com.hector.consumodeapi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class PersonasAdpt extends RecyclerView.Adapter<VistaPersonas>  {
    private List<InfoPersonas> Persona;

    public PersonasAdpt(List<InfoPersonas> Persona) {
        this.Persona = Persona;
    }
    @NonNull
    @Override
    public VistaPersonas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_persona, parent, false);

        return new VistaPersonas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VistaPersonas holder, int position) {
        holder.bind(Persona.get(position));
    }

    @Override
    public int getItemCount() {
        return Persona != null ? Persona.size() : 0;
    }
}
