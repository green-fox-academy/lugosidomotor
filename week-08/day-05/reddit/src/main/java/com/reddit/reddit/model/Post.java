package com.reddit.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String title;
  private String content;
  private int like;
  private String author;
  private String posted;

  public Post() {
    Date date = new Date();
    this.posted = date.toString();
  }

  public Post(String title, String content, String author) {
    Date date = new Date();
    this.posted = date.toString();
    this.title = title;
    this.content = content;
    this.author = author;
  }

  public Post(String title, String content, int like, String author) {
    Date date = new Date();
    this.posted = date.toString();
    this.title = title;
    this.content = content;
    this.like = like;
    this.author = author;

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public int getLike() {
    return like;
  }

  public void setLike(int like) {
    this.like = like;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPosted() {
    return posted;
  }

  public void setPosted(String posted) {
    this.posted = posted;
  }

  @Override
  public String toString() {
    return "Post{" + "title='" + title + '\'' + ", content='" + content + '\'' + ", like=" + like + ", author='" + author + '\'' + ", posted=" + posted + '}';
  }
}
