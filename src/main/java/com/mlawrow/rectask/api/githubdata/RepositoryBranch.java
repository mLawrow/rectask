package com.mlawrow.rectask.api.githubdata;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RepositoryBranch {

    private String name;
    private Commit commit;

}
