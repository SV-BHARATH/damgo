
package com.example.SpringMailSender.user;


public class EmailSender 
{
	private String recipeints;
	
	private String msgBody;
	
	private String subject;
	
	

	public EmailSender(String recipeints, String msgBody, String subject) {
		super();
		this.recipeints = recipeints;
		this.msgBody = msgBody;
		this.subject = subject;
	}

	
	


	public String getRecipeints() {
		return recipeints;
	}





	public void setRecipeints(String recipeints) {
		this.recipeints = recipeints;
	}





	public String getMsgBody() {
		return msgBody;
	}





	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}





	public String getSubject() {
		return subject;
	}





	public void setSubject(String subject) {
		this.subject = subject;
	}





	@Override
	public String toString() {
		return "EmailSender [recipeints=" + recipeints + ", msgBody=" + msgBody + ", subject=" + subject + "]";
	}
	
    

}
