package com.mlawrow.rectask.api.client;

import com.mlawrow.rectask.api.githubdata.RepositoryBranch;
import com.mlawrow.rectask.api.githubdata.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GithubClient {

    private static final String GITHUB_API_URL = "https://api.github.com";

    @Autowired
    private RestTemplate restTemplate;

    public UserRepository[] getUserDetails(String username) {
        String userReposURL = GITHUB_API_URL.concat("/users/").concat(username).concat("/repos");

        return restTemplate.getForObject(userReposURL, UserRepository[].class);
    }

    public RepositoryBranch[] getRepositoryBranches(String username, String repository) {
        String repoBranchesURL = GITHUB_API_URL.concat("/repos/")
            .concat(username).concat("/").concat(repository).concat("/branches");

        return restTemplate.getForObject(repoBranchesURL, RepositoryBranch[].class);
    }
}
