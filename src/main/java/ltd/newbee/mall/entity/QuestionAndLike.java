package ltd.newbee.mall.entity;

import java.sql.Date;

public class QuestionAndLike {
	private Integer goodsId;
	private String questionId;
	private String question;
	private String answer;
	private Date questionDate;
	private Integer likeCount;

	public String getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	@Override
	public String toString() {
		return "QuestionAndLike [goodsId=" + goodsId + ", questionId=" + questionId + ", question=" + question
				+ ", answer=" + answer + ", questionDate=" + questionDate + ", likeCount=" + likeCount + "]";
	}

	

	/**
	 * @return the goodsId
	 */
	public Integer getGoodsId() {
		return goodsId;
	}

	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the questionDate
	 */
	public Date getQuestionDate() {
		return questionDate;
	}

	/**
	 * @param questionDate the questionDate to set
	 */
	public void setQuestionDate(Date questionDate) {
		this.questionDate = questionDate;
	}

	/**
	 * @return the likeCount
	 */
	public Integer getLikeCount() {
		return likeCount;
	}

	/**
	 * @param likeCount the likeCount to set
	 */
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

}