package com.marquess.demo.controller;

import com.marquess.demo.model.User;
import com.marquess.demo.service.UserService;
import com.marquess.demo.utils.ExcelUtils;
import com.marquess.demo.vo.BaseReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getSessionId")
    @ResponseBody
    public String getSessionId(HttpServletRequest request) {
        Object o = request.getSession().getAttribute("springboot");
        if(o == null){
            o = "spring boot 牛逼了!!!有端口"+request.getLocalPort()+"生成";
            request.getSession().setAttribute("springboot", o);
        }

        return "端口=" + request.getLocalPort() +  " sessionId=" + request.getSession().getId() +"<br/>"+o;
    }

    @RequestMapping(value = "/getId")
    @ResponseBody
    public String getData(@RequestBody User ma) {
        System.out.print(ma.getId());
        return "ss";
    }

    @RequestMapping(value = "/getUserList")
    @ResponseBody
    public BaseReturnVO getUserList() {
        return userService.getUserList();
    }

    @PostMapping(value = "/user/login")
    @ResponseBody
    public HashMap login() {
        System.out.print("ooo000");
        HashMap<String,Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("sessionId", "sisdj9");
        return map;
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file")MultipartFile file) {
        System.out.print("999");
        if(file.isEmpty()) {
            return "fail";
        }
        try {
            String fileName = file.getOriginalFilename();
            byte[] bytes = file.getBytes();
            BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File("e:/cp/" + fileName)));
            buffStream.write(bytes);
            buffStream.close();

            //process excel
            if(fileName != null) {
                String postfix = fileName.substring(fileName.lastIndexOf(".") + 1);
                try {
                    if("xls".equals(postfix)) {
                        ExcelUtils.readFromXls("e:/cp/" + fileName, "");
                    } else if("xlsx".equals(postfix)) {
                        ExcelUtils.readFromXlsx("e:/cp/" + fileName, "");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }


            return "You have successfully uploaded " + fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }


//        String fileName = file.getOriginalFilename();
//        String filePath = "e:/file/";
//        File dest = new File(filePath+fileName);
//        try {
//            file.transferTo(dest);
//            return "success";
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return "Fail";
    }

}
