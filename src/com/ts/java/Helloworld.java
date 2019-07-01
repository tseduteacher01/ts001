package com.ts.java;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author james
 * @create 2019-08-01 09:22
 * 快捷键
 * 	提示补全 (Class Name Completion)    alt+/
 * 	执行(run)  alt+r
 * 	单行注释       ctrl + /
 * 	多行注释 ctrl + shift +/
 * 	向下复制一行 (Duplicate Lines)  ctrl+alt+down
 * 	删除一行或选中行 (delete line)    ctrl+d
 * 	向下移动行(move statement down)    alt+down
 * 	向上移动行(move statement up)     alt+up
 * 	向下开始新的一行(start new line)    shift+enter
 * 	向上开始新的一行 (Start New Line before current)      ctrl+alt+enter
 * 	如何查看源码 (class)     ctrl + 选中指定的结构 或 ctrl + shift + t
 * 	万能解错/生成返回值变量     alt + enter
 * 	退回到前一个编辑的页面 (back)    alt + left
 * 	进入到下一个编辑的页面(针对于上条) (forward)    alt + right
 * 	格式化代码(reformat code)     ctrl+shift+F
 * 	提示方法参数类型(Parameter Info)    ctrl+alt+/
 * 	选中数行，整体往后移动     tab
 * 	选中数行，整体往前移动     shift + tab
 * 	查看类的结构：类似于 eclipse 的 outline   ctrl+o
 * 	重构：修改变量名与方法名(rename)    alt+shift+r
 * 	大写转小写/小写转大写(toggle case)    ctrl+shift+y
 * 	生成构造器/get/set/toString      alt +shift + s
 * 	收起所有的方法(collapse all)     alt + shift + c
 * 	打开所有方法(expand all)     alt+shift+x
 * 	打开代码所在硬盘文件夹(show in explorer)   ctrl+shift+x
 * 	生成 try-catch 等(surround with)    alt+shift+z
 * 	局部变量抽取为成员变量(introduce field)   alt+shift+f
 * 	查找/替换(当前)      ctrl+f
 * 	查找(全局)       ctrl+h
 * 	查找文件       double Shift
 * 	添加到收藏(add to favorites) ctrl+alt+f
 * 	抽取方法(Extract Method)     alt+shift+m
 * 	打开最近修改的文件(Recently Files)  ctrl+E
 * 	关闭当前打开的代码栏(close)     ctrl + w
 * 	关闭打开的所有代码栏(close all)    ctrl + shift + w
 * 	快速搜索类中的错误(next highlighted error)   ctrl + shift + q
 * 	选择要粘贴的内容(Show in Explorer)    ctrl+shift+v
 * 	查找方法在哪里被调用(Call Hierarchy)    ctrl+shift+h
 */
public class Helloworld {
    public static final  int SALE_STAUS=1;

       private static final int status=1;
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        //out模板
        System.out.println();
        //soutp加参数
        System.out.println("args = [" + args + "]");
        //sooutv
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
       //soutm
        System.out.println("Helloworld.main");
      //xxx.sout;
        System.out.println(list1);
        //	fori 模板 常见的for循环
        for (int i = 0; i <list1.size() ; i++) {

        }
        //增强for循环
        for (Object o : list2) {
            
        }
        public void test{
          
        }
       //list.for
        for (Object o : list2) {
            
        }
        //list.fori 从前往后，从第一个开始循环
        for (int i = 0; i < list2.size(); i++) {
            
        }
       // list.forr   从最后一个开始循环
        for (int i = list1.size() - 1; i >= 0; i--) {

        }
        //ifn
        if (list2 == null) {

        }//inn
        if (list2 != null) {

        }//xxx.nn
        if (list1 != null) {

        }
        //
        getHelloWorld();
        String a = "test";
        Date date = new Date();
       list1.add(0,"a");

    }

    public static void getHelloWorld() {
        System.out.println("HelloWorld");

    }

}
