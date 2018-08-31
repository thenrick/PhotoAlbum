package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class PhotoAlbumApp {

    public static void main(String args[]) {
    	// Check how many arguments were passed in
        if(args.length == 0)
        {
            System.out.println("Proper Usage is: java PhotoAlbumApp albumId");
            System.exit(0);
        }
        
        if(isStringInteger(args[0])) {
        	String albumId = args[0];
        	Photo[] photos = getPhotoArray(albumId);
        	displayPhotoInfo(photos);
        }
    }

	static void displayPhotoInfo(Photo[] photos) {
		for (Photo photo : photos){
        	System.out.println("[" + photo.getId() + "]" + photo.getTitle());
          }
		
	}

	static Photo[] getPhotoArray(String albumId) {
		RestTemplate restTemplate = new RestTemplate();
        Photo[] photos = restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos?albumId=" + albumId, Photo[].class);
		return photos;
	}
	
	public static boolean isStringInteger(String number ){
	    try{
	        Integer.parseInt(number);
	    }catch(Exception e ){
	        return false;
	    }
	    return true;
	}
}
