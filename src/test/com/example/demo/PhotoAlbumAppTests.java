package com.example.demo;

import org.junit.Test;


public class PhotoAlbumAppTests {
	 
	@Test
	public void displayPhotoInfo() {
		String[] args = {"2"};
		Photo[] photo = PhotoAlbumApp.getPhotoArray(args);
		assert(photo != null);
		PhotoAlbumApp.displayPhotoInfo(photo);
	}

	@Test
	public void getPhotoArray() {
		String[] args = {"2"};
		Photo[] photo = PhotoAlbumApp.getPhotoArray(args);
		assert(photo != null);
	}
}
