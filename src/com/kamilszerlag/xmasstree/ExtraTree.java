package com.kamilszerlag.xmasstree;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by szerlag on 2018-03-18.
 */
public class ExtraTree extends XTree {
    public ExtraTree(int height, String direction) {
        super(height, direction);
    }

    public ExtraTree(int height, String direction, String branchIcon) {
        super(height, direction, branchIcon);
    }

    @Override
    public void buildTree() {
        System.out.print(StringUtils.repeat(" ",getHeight()+1));
        System.out.print("+");
        System.out.println();
        System.out.print(StringUtils.repeat(" ",getHeight()));
        System.out.print("+++");
        System.out.println();
            for (int i = 0; i < getHeight(); i++) {
                drawSpaces(i);
                System.out.print("o");
                drawbranches(i);
                System.out.print("o");
                System.out.println();

            }
        System.out.print(StringUtils.repeat(" ",getHeight()));
        System.out.print("|||");
        System.out.println();
        System.out.print(StringUtils.repeat(" ",getHeight()));
        System.out.print("|||");



    }

    @Override
    protected void drawbranches(int times) {
        System.out.print(StringUtils.repeat(this.getBranchIcon(),2*times+1));
    }

    @Override
    protected void drawSpaces(int times) {
        System.out.print(StringUtils.repeat(" ",getHeight()-times));

    }
}
