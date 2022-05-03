package pl.jsulkowski.project_social_app.posts.controller;

import org.springframework.stereotype.Service;
import pl.jsulkowski.project_social_app.posts.respository.Post;
import pl.jsulkowski.project_social_app.posts.respository.PostRepository;

import java.util.List;

@Service
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPost(){
        return this.postRepository.findAll();
    }
}
