package com.hector.consumodeapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;
import com.hector.consumodeapi.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    PersonasAdpt PersonasAdpt;
    List<InfoPersonas> Persona = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initRecyclerView();
        getPersona();
    }

    private void initRecyclerView() {
        PersonasAdpt = new PersonasAdpt(Persona);
        binding.listPersona.setLayoutManager(new LinearLayoutManager(this));
        binding.listPersona.setAdapter(PersonasAdpt);
    }

    private ApiService getApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dosydossoncuatro.000webhostapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);

        return service;
    }


    private void getPersona() {
        final Call<personasllamada> batch = getApiService().getInfo();

        batch.enqueue(new Callback<personasllamada>() {
            @Override
            public void onResponse(Call<personasllamada> call, Response<personasllamada> response) {
                if(response != null && response.body() != null) {
                    Persona.clear();

                    List<InfoPersonas> peopleInfo = response.body().getInfoPersona();

                    Persona.addAll(peopleInfo);
                    PersonasAdpt.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<personasllamada> call, Throwable t) {
                if(t != null) {
                    showError();
                }
            }
        });
    }

    private void showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
    }

}