package com.mlawrow.rectask.api.githubdata;

import com.mlawrow.rectask.api.githubdata.Owner;
import com.mlawrow.rectask.api.githubdata.RepositoryBranch;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRepository {

    private String name;
    private Owner owner;
    private List<RepositoryBranch> branches;

}
