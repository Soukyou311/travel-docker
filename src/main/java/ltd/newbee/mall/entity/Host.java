package ltd.newbee.mall.entity;

import java.util.Date;

public class Host {
	private int hostId;
	private String hostName;
	private String hostImg;
	private int reviewNum;
	private Date regDate;
	private int confirmation;
	private int superHost;
	private String selfIntroduction;
	private String permission;
	private String language;
	private float answerPercent;
	private int answerTime;
	
	
	public int getHostId() {
		return hostId;
	}
	public void setHostId(int hostId) {
		this.hostId = hostId;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getHostImg() {
		return hostImg;
	}
	public void setHostImg(String hostImg) {
		this.hostImg = hostImg;
	}
	public int getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getConfirmation() {
		return confirmation;
	}
	public void setConfirmation(int confirmation) {
		this.confirmation = confirmation;
	}
	public int getSuperHost() {
		return superHost;
	}
	public void setSuperHost(int superHost) {
		this.superHost = superHost;
	}
	public String getSelfIntroduction() {
		return selfIntroduction;
	}
	public void setSelfIntroduction(String selfIntroduction) {
		this.selfIntroduction = selfIntroduction;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public float getAnswerPercent() {
		return answerPercent;
	}
	public void setAnswerPercent(float answerPercent) {
		this.answerPercent = answerPercent;
	}
	public int getAnswerTime() {
		return answerTime;
	}
	public void setAnswerTime(int answerTime) {
		this.answerTime = answerTime;
	}
	
	



}
