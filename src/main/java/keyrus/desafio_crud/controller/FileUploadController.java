package keyrus.desafio_crud.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import keyrus.desafio_crud.service.FileUploadService;

@RestController
@RequestMapping("/file")
public class FileUploadController {
	
	@Autowired
	FileUploadService fileUploadService;
	
	@PostMapping
	public String uploadFile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		fileUploadService.uploadFile(file);
		return file.getOriginalFilename() + " enviado!";
	}
}
