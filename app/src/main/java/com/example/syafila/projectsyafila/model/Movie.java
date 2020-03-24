package com.example.syafila.projectsyafila.model;

import com.google.gson.annotations.SerializedName;

public class Movie extends BaseModel<MovieData> {
    @SerializedName("total_results")
    public Integer totalResults;
    @SerializedName("total_pages")
    public Integer totalPages;

    public Movie() {
    }

    public Integer getTotalResult() {
        return totalResults;
    }

    public void setTotalResult(Integer totalResult) {
        this.totalResults = totalResult;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
