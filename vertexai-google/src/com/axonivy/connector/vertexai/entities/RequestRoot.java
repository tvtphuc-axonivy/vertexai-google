package com.axonivy.connector.vertexai.entities;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class RequestRoot {
	@SerializedName("contents")
	List<Content> contents;

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

}
