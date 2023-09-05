package pe.edu.upc.aww.takemehometf.dtos;

import pe.edu.upc.aww.takemehometf.entities.User;

public class CommentDTO {
    private int idComment;
    private String title;
    private String content;
    private User userSend;
    private User userReceives;

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUserSend() {
        return userSend;
    }

    public void setUserSend(User userSend) {
        this.userSend = userSend;
    }

    public User getUserReceives() {
        return userReceives;
    }

    public void setUserReceives(User userReceives) {
        this.userReceives = userReceives;
    }
}
