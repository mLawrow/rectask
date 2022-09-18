package com.mlawrow.rectask.api.controller;

import com.mlawrow.rectask.api.githubdata.UserRepository;
import com.mlawrow.rectask.service.GithubService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GithubController {

    @Autowired
    private GithubService githubService;

    @GetMapping(value = "github", headers = "Accept=application/json", produces = "application/json")
    private List<UserRepository> getGithubData(@RequestParam String username) {
        return githubService.getUserDetails(username);
    }

}
