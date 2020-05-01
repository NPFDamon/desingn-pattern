package com.cn.composite;

/***
 * 组合模式；把一组相似的对象当做一个单一的对象。
 * 将对象组合成树状结构表示“部分-整体”的结构层次。组合模式使得用户对单个对象和组合对象的使用具有一致性
 */
public class Tree {
    public static void main(String[] args){
        Node root = new Node("root","first");

        Node secondLeft = new Node("left","second left");
        Node secondRight = new Node("right","second right");

        Node secondLeftLeft = new Node("left","second Left Left");
        Node secondLeftRight = new Node("right","second Left Right");

        Node secondRightLeft = new Node("left","second Right Left");
        Node secondRightRight = new Node("right","second Right Right");

        root.add(secondLeft);
        root.add(secondRight);

        secondLeft.add(secondLeftLeft);
        secondLeft.add(secondLeftRight);

        secondRight.add(secondRightLeft);
        secondRight.add(secondRightRight);

        System.out.println(root);
    }
}
