package com.blog.blog.model;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Story {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String content;
  private String author;
  private String title;
  @CreationTimestamp
  private LocalDateTime date;
  private int likeNumber;

  public Story() {
    this.date = LocalDateTime.now();
    this.likeNumber = 0;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public int getLikeNumber() {
    return likeNumber;
  }

  public void setLikeNumber(int likeNumber) {
    this.likeNumber = likeNumber;
  }
}
