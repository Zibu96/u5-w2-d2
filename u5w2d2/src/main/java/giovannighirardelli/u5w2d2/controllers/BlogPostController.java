package giovannighirardelli.u5w2d2.controllers;

import giovannighirardelli.u5w2d2.entities.BlogPost;
import giovannighirardelli.u5w2d2.servicies.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    private List<BlogPost> getAllBlogPost() {
        return this.blogPostService.getBlogPostsList();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost saveBlogPost(@RequestBody BlogPost body){

        return this.blogPostService.saveBlogPost(body);
    }

    @GetMapping("/{blogpostId}")
    private BlogPost findById(@PathVariable int blogpostId){

        return this.blogPostService.findById(blogpostId);
    }

    @PutMapping("/{blogpostId}")
    private BlogPost findByIdAndUpdate(@RequestBody BlogPost body, @PathVariable int blogpostId){

        return this.blogPostService.findByIdAndUpdate(blogpostId, body);
    }

    @DeleteMapping("/{blogpostId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void findBlogPostAndDelete(@PathVariable int blogpostId){

        this.blogPostService.findByIdAndDelete(blogpostId);
    }
}
