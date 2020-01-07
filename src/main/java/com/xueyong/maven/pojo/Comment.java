package com.xueyong.maven.pojo;

public class Comment {
	/**  **/
	private Integer id;
	/** 文章Id **/
	private Integer articleId;
	/** 用户Id **/
	private Integer userId;
	/** 评论内容 **/
	private String content;
	/** 评论时间 **/
	private String created;

	public Comment(Integer id, Integer articleId, Integer userId, String content, String created) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.userId = userId;
		this.content = content;
		this.created = created;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", articleId=" + articleId + ", userId=" + userId + ", content=" + content
				+ ", created=" + created + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Comment() {
		super();
	}

	
}
