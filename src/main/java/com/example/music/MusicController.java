package com.example.music;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {
	@GetMapping("/getMusic")
	public String getMusic() {
		return "S.P.B";
	}
}
