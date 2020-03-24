package com.example.syafila.projectsyafila.network;

import com.example.syafila.projectsyafila.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @POST(Constant.MOVIE_PATH + "/popular")
    Call<Movie> popularMovies(
            @Query("page") int page
    );
    @GET(Constant.MOVIE_PATH + "/{movie_id}/similar")
    Call<Movie> similarMovies(
            @Query("page") int page);
}
