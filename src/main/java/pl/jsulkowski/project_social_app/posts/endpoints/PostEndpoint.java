package pl.jsulkowski.project_social_app.posts.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jsulkowski.project_social_app.posts.controller.PostController;
import pl.jsulkowski.project_social_app.posts.respository.Post;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostEndpoint {

    private final PostController postController;

    public PostEndpoint(PostController postController) {
        this.postController = postController;
    }

    @GetMapping("/all")
    public List<Post> getAllPost(){
        return this.postController.getAllPost();
    }
}
