package com.java.org;

public class News {
     int newsID;
     String postByUser;
     String commentByUser;
     String comment;
	public News(int newsID, String newsPostbyUser, String newsCommentbyUser, String newsComment) {
	
		this.newsID = newsID;
		this.postByUser = newsPostbyUser;
		this.commentByUser = newsCommentbyUser;
		this.comment = newsComment;
	}
	public int getNewsID() {
		return newsID;
	}
	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}
	public String getNewsPostbyUser() {
		return postByUser;
	}
	public void setNewsPostbyUser(String newsPostbyUser) {
		postByUser = newsPostbyUser;
	}
	public String getNewsCommentbyUser() {
		return commentByUser;
	}
	public void setNewsCommentbyUser(String newsCommentbyUser) {
		commentByUser = newsCommentbyUser;
	}
	public String getNewsComment() {
		return comment;
	}
	public void setNewsComment(String newsComment) {
		comment = newsComment;
	}
	@Override
	public String toString() {
		return "News [NewsID=" + newsID + ", NewsPostbyUser=" + postByUser + ", NewsCommentbyUser="
				+ commentByUser + ", NewsComment=" + comment + "]";
	}
	
	
     
}
