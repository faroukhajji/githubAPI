package com.farouk.hajji.data.source.remote;

import com.farouk.hajji.model.Issue;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface IssueService {
    @GET("/repos/planetlabs/staccato/issues")
    Call<List<Issue>> getIssues();
}
