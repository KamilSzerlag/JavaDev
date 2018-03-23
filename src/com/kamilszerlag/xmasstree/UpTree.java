package com.kamilszerlag.xmasstree;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by szerlag on 2018-03-17.
 */
public class UpTree extends XTree {
    public UpTree(int height, java.lang.String direction) {
        super(height, direction);
    }

    public UpTree(int height, java.lang.String direction, java.lang.String branchIcon) {
        super(height, direction, branchIcon);
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
