package com.WeChat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="blogcommentseq",sequenceName="blogcomment_seq")

public class Blogcomment 
{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "blogcommentseq")
	private int blogcommentid;
	private String username;
	private int blogid;
	private String blogcomment;
	public int getBlogcommentid() {
		return blogcommentid;
	}
	public void setBlogcommentid(int blogcommentid) {
		this.blogcommentid = blogcommentid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getBlogcomment() {
		return blogcomment;
	}
	public void setBlogcomment(String blogcomment) {
		this.blogcomment = blogcomment;
	}
 
}
