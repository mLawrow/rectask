package com.mlawrow.rectask.dto;

import java.util.List;

public class GithubDTO {

    private String ownerLogin;
    private String repoName;
    private List<String> branches;

    public String getOwnerLogin() {
        return ownerLogin;
    }

    public String getRepoName() {
        return repoName;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setOwnerLogin(String ownerLogin) {
        this.ownerLogin = ownerLogin;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }
}
