package pe.edu.upc.aww.takemehometf.entities;

import javax.persistence.*;

@Entity
@Table(name="comment")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;
    @Column(name = "title", length = 45, nullable = false)
    private String title;
    @Column(name = "content", length = 100, nullable = false)
    private String content;
    @ManyToOne
    @JoinColumn(name = "user_send_id")
    private User userSend;
    @ManyToOne
    @JoinColumn(name = "user_receives_id")
    private User userReceives;

    public Comment(int idComment,String title, String content, User userSend, User userReceives) {
        this.idComment=idComment;
        this.title = title;
        this.content=content;
        this.userSend=userSend;
        this.userReceives=userReceives;
    }

    public Comment() {

    }

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
