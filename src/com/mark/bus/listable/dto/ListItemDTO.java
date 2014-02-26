package com.mark.bus.listable.dto;

public class ListItemDTO {
	int id;
	int imageId;
	String text;

	public ListItemDTO(int id, int imageId, String text) {
		this.id = id;
		this.imageId = imageId;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public int getImageId() {
		return imageId;
	}

	public String getText() {
		return text;
	}

}