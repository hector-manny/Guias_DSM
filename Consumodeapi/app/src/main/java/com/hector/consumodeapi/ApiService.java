package com.hector.consumodeapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("APIRESTPHP/displayAll.php")
    Call<personasllamada> getInfo();
}

