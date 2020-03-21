package com.demobank.accountmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionDto {
	    @JsonProperty("messages")
	    private String messages = null;
	    
	    @JsonProperty("errorCode")
	    private String errorCode;

	    
	    @JsonProperty("errorCode")
	    public String getErrorCode() {
			return errorCode;
		}

	    @JsonProperty("errorCode")
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

	    @JsonProperty("messages")
		public String getMessages() {
	        return this.messages;
	    }

	    @JsonProperty("messages")
	    public void setMessages(String messages) {
	        this.messages = messages;
	    }

}
