package com.example.songr;

import com.example.songr.hello.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void testAlbumConstructor(){
		Album album = new Album("album title 3",
				"album artist 3",
				"album song count 3",
				"album length 3",
				"album image url 3");
		System.out.println(String.valueOf(album));
	}

}
