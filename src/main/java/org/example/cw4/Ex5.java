package org.example.cw4;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        List<String> listPath = Arrays.stream(path.split("/")).toList();
        String res = "";
        for(String item : listPath){
            if(!item.equals("") & !item.equals("..") & !item.equals("/")){
                res += "/" + item;
            }
        }
        if(res.equals("")) res = "/";
        return res;
    }
}
