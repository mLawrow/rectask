package com.mlawrow.rectask.api;

import com.mlawrow.rectask.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private GithubService githubService;


    @GetMapping(value = "github", produces = "application/json")
    private String getGithubData(){
        return githubService.con();
    }

}
