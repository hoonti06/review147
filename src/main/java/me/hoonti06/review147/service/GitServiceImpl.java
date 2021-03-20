package me.hoonti06.review147.service;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.internal.storage.file.FileRepository;

import java.io.File;
import java.io.IOException;

public class GitServiceImpl implements GitService {

    GitServiceImpl() throws IOException {
        Git git = new Git(new FileRepository(new File("hi")));
        git.diff();
    }
}
