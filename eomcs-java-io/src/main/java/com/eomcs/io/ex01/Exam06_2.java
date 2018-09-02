// 디렉토리에 들어있는 파일(디렉토리) 목록을 꺼낼 때 필터 적용하기 II
package com.eomcs.io.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam06_2 {

    static class JavaFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            System.out.println("===>" + name);
            if (name.endsWith(".java")) 
                return true; // 조회 결과에 포함시켜라!
            return false; // 조회 결과에서 제외하라!
        }
    }
    
    public static void main(String[] args) throws Exception {
        File dir = new File(".");
        
        // => 확장자가 .java 인 파일의 이름만 추출하기
        // 1) 필터 준비
        JavaFilter javaFilter = new JavaFilter();
        
        // 2) 필터를 사용하여 디렉토리의 목록을 가져오기
        File[] files = dir.listFiles(javaFilter);
        
        for (File file : files) {
            System.out.printf("%s %12d %s\n", 
                file.isDirectory() ? "d" : "-",
                file.length(),
                file.getName());
        }

    }

}







