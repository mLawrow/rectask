package com.mlawrow.rectask.service;
import com.mlawrow.rectask.dto.GithubDTO;
import com.mlawrow.rectask.model.Github;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GithubService {

    public List<GithubDTO> getGithubData(){
        return ((List<Github>))
    }

    private GithubDTO convertToGithubDTO(Github github){
        GithubDTO githubDTO = new GithubDTO();
        githubDTO.setOwnerLogin(github.getOwnerLogin());
        githubDTO.setRepoName(github.getRepoName());
        githubDTO.setBranches(github.getBranches());

        return githubDTO;
    }

}
