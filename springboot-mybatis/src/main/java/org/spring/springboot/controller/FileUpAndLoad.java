package org.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

@Controller
public class FileUpAndLoad {

    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    public void FileUp(HttpServletRequest req, MultipartHttpServletRequest multiReq) throws IOException {

            String name = multiReq.getMultiFileMap().get("file").get(0).getOriginalFilename();
//            FileOutputStream fos=new FileOutputStream(new File("C:\\java\\file\\upload\\" + name));
            FileOutputStream fos=new FileOutputStream(new File("/home/file/" + name));
            FileInputStream fs=(FileInputStream) multiReq.getFile("file").getInputStream();
            byte[] buffer=new byte[1024];
            int len=0;
            while((len=fs.read(buffer))!=-1){
                fos.write(buffer, 0, len);
            }
            fos.close();
            fs.close();

    }
}
