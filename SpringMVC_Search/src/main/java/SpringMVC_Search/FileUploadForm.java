package SpringMVC_Search;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadForm {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "file_form";

	}

	// @RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	// you can use path as value both are same....

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model) {
		System.out.println("upload called...");

		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getBytes());

		// upload file
		byte[] data = file.getBytes();
		// we have to save this file data into server.....
		// it will return current path

		// String realPath = session.getServletContext().getRealPath("/");
		// System.out.println(realPath);

		String realPath = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "upload" + File.separator + file.getOriginalFilename();
		System.out.println(realPath);

		System.out.println(file.getOriginalFilename());
		// write file
		try {

			FileOutputStream fos = new FileOutputStream(realPath);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded.");
			
			//retrive file
			model.addAttribute("msg", "Uploaded Successfully....");
			model.addAttribute("filename", file.getOriginalFilename());
		} catch (IOException e) {
			model.addAttribute("msg", "Uploaded Faild...");
			e.printStackTrace();
			System.out.println("uploading error...");
		}
		return "filesuccess";
	}
}
