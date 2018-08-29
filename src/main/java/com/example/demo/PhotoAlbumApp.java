package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class PhotoAlbumApp {

    public static void main(String args[]) {
    	Photo[] photo = getPhotoArray(args);
    	displayPhotoInfo(photo);
    }

	static void displayPhotoInfo(Photo[] photo) {
		for (Photo pht : photo){
        	System.out.println("[" + pht.getId() + "]" + pht.getTitle());
          }
		
	}

	static Photo[] getPhotoArray(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
        Photo[] photo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos?albumId=" + args[0], Photo[].class);
		return photo;
	}
}