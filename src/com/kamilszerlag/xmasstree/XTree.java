package com.kamilszerlag.xmasstree;

/**
 * Created by szerlag on 2018-03-17.
 */
public class XTree {
    private int height;
    private java.lang.String direction;
    private java.lang.String branchIcon = "*";


    public XTree(int height, java.lang.String direction) {
        this.height = height;
        this.direction = direction;
    }

    public XTree(int height, java.lang.String direction, java.lang.String branchIcon) {
        this.height = height;
        this.direction = direction;
        this.branchIcon = branchIcon;
    }

    public void buildTree() {
        for (int i = 0; i < getHeight(); i++) {
            drawSpaces(i);
            drawbranches(i);
            System.out.println();

        }

    }

    public int getHeight() {
        return height;
    }

    public java.lang.String getBranchIcon() {
        return branchIcon;
    }

    protected void drawSpaces(int times) {
    }

    protected void drawbranches(int times) {
    }
}
