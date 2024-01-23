package com.janki.jobpost.jobpost;

import com.janki.jobpost.jobpost.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    postRepo postRepo;

    //    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllpost() {
        List<Post> posts = postRepo.findAll();
        System.out.println("Retrieved posts: " + posts);
        return posts;
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
      return postRepo.save(post);
    }
}

