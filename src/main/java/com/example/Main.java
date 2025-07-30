package com.example;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.TypeFilter;

/**
 * Spoon 11.2.1 メインクラス
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Spoon 11.2.1 - JitCI Project");
        
        if (args.length == 0) {
            System.out.println("使用方法: java -jar spoon-jitci.jar <Java源码目录>");
            System.out.println("例: java -jar spoon-jitci.jar src/main/java");
            return;
        }
        
        String sourcePath = args[0];
        analyzeCode(sourcePath);
    }

    /**
     * 指定されたパスのJavaコードを解析
     */
    private static void analyzeCode(String sourcePath) {
        try {
            System.out.println("解析対象: " + sourcePath);
            
            Launcher launcher = new Launcher();
            launcher.addInputResource(sourcePath);
            
            CtModel model = launcher.buildModel();
            
            var classes = model.getElements(new TypeFilter<>(CtClass.class));
            System.out.println("クラス数: " + classes.size());
            
            for (CtClass<?> clazz : classes) {
                System.out.println("- " + clazz.getQualifiedName() + 
                                 " (メソッド数: " + clazz.getMethods().size() + ")");
            }
            
        } catch (Exception e) {
            System.err.println("エラー: " + e.getMessage());
        }
    }
}
