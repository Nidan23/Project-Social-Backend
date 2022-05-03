package pl.jsulkowski.project_social_app.posts.model;

public class PostModel {

    private String postText;
    private String postTitle;

    private Long userId;

    public PostModel(String postText, String postTitle, Long userId) {
        this.postText = postText;
        this.postTitle = postTitle;
        this.userId = userId;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
