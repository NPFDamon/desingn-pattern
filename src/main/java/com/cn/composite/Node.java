package com.cn.composite;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String leaf;
    private String des;
    private List<Node> nodes;

    public Node(String leaf,String des){
        this.leaf = leaf;
        this.des = des;
        nodes = new ArrayList<>();
    }

    public void add(Node node){
        nodes.add(node);
    }

    public void remove(Node node){
        nodes.remove(node);
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "Node{" +
                "leaf='" + leaf + '\'' +
                ", des='" + des + '\'' +
                ", nodes=" + nodes +
                '}';
    }
}
