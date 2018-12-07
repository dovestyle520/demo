package com.marquess.demo.utils;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestUtils {
    public static void main(String[] args) {
        File src = new File("C:\\Users\\junjian.hou\\Downloads\\rrr.txt");
        File dst = new File("C:\\Users\\junjian.hou\\Downloads\\dst.txt");
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(src));
            writer = new BufferedWriter(new FileWriter(dst));
            String tempString = null;

            String pattern = "^([\\D+])";
            Pattern r = Pattern.compile(pattern);
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                Matcher m = r.matcher(tempString);
                if (m.find( )) {
                    System.out.println("line " + line + ": " + tempString);
                    writer.write(tempString + "\n");
                } else {
                    System.out.println("line " + line + ": " + tempString + " no match!");
                }

                line++;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e2) {
                }
            }
        }
    }
}
