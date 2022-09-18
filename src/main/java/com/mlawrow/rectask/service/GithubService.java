package com.mlawrow.rectask.service;

import com.mlawrow.rectask.api.client.GithubClient;
import com.mlawrow.rectask.api.githubdata.UserRepository;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class GithubService {

    @Autowired
    private GithubClient githubClient;

    public List<UserRepository> getUserDetails(String username) {
        log.info("Calling for github data with username: {}", username);
        githubClient.getUserDetails(username);

        var userRepositories = Arrays.asList(githubClient.getUserDetails(username));

        // for each repo call & fill branches & commits
        userRepositories.forEach(repo -> {
            var repoName = repo.getName();
            log.info("Calling for repository: {} branch data with username: {}", repoName, username);
            repo.setBranches(Arrays.asList(githubClient.getRepositoryBranches(username, repoName)));
        });

        return userRepositories;
    }
}
