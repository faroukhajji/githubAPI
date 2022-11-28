package com.farouk.hajji;

import com.farouk.hajji.data.source.remote.IssueService;
import com.farouk.hajji.model.Issue;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        String token = String.format("%s  %s", "Bearer","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");
        IssueService service = GithubAPIConf.createService(IssueService.class,token);

        Call<List<Issue>> callAsync = service.getIssues();

        callAsync.enqueue(new Callback<List<Issue>>() {
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
