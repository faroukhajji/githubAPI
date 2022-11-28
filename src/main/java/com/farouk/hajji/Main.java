package com.farouk.hajji;

import com.farouk.hajji.data.source.remote.IssueService;
import com.farouk.hajji.model.Issue;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        //TODO: generate and add a the token string
        String gitToken= "";
        String authToken = String.format("%s  %s", "Bearer",gitToken);
        IssueService service = GithubAPIConf.createService(IssueService.class,authToken);

        Call<List<Issue>> callGetIssuesAsync = service.getIssues();

        callGetIssuesAsync.enqueue(new Callback<List<Issue>>() {
            @Override
            public void onResponse(Call<List<Issue>> call, Response<List<Issue>> response) {
                for (Issue item :
                        response.body()) {
                    System.out.println(String.format("%s %s characters",item.getTitle(),item.getBody()!=null?item.getBody().length():0));
                }
            }

            @Override
            public void onFailure(Call<List<Issue>> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });

    }
}
