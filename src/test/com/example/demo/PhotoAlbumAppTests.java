package com.example.demo;

import org.junit.Test;


public class PhotoAlbumAppTests {
	 
	@Test
	public void displayPhotoInfo() {
		String albumId = "2";
		Photo[] photos = PhotoAlbumApp.getPhotoArray(albumId);
		assert(photos != null);
		PhotoAlbumApp.displayPhotoInfo(photos);
		
		albumId = "3";
		photos = PhotoAlbumApp.getPhotoArray(albumId);
		assert(photos != null);
		PhotoAlbumApp.displayPhotoInfo(photos);

		albumId = "4";
		photos = PhotoAlbumApp.getPhotoArray(albumId);
		assert(photos != null);
		PhotoAlbumApp.displayPhotoInfo(photos);
	}

	@Test
	public void getPhotoArray() {
		String albumId = "2";
		Photo[] photos = PhotoAlbumApp.getPhotoArray(albumId);
		assert(photos != null);
		
		albumId = "3";
		photos = PhotoAlbumApp.getPhotoArray(albumId);
		assert(photos != null);
		
		albumId = "4";
		photos = PhotoAlbumApp.getPhotoArray(albumId);
		assert(photos != null);
	}
}

