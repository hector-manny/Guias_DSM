package com.hector.consumodeapi;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.hector.consumodeapi.databinding.ItemPersonaBinding;
public class VistaPersonas extends RecyclerView.ViewHolder {
    private final ItemPersonaBinding itemPersonaBinding;

    public VistaPersonas(View view) {
        super(view);

        itemPersonaBinding = ItemPersonaBinding.bind(view);
    }

    public void bind(InfoPersonas repo) {
        itemPersonaBinding.textPersonaName.setText(repo.getName());
        itemPersonaBinding.textPersonaId.setText(repo.getId());
        itemPersonaBinding.textPersonaAge.setText(repo.getAge());
        itemPersonaBinding.textPersonaMobile.setText(repo.getMobile());
        itemPersonaBinding.textPersonaEmail.setText(repo.getEmail());
    }
}
