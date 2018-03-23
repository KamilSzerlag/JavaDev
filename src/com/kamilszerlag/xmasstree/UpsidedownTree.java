package com.kamilszerlag.xmasstree;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by szerlag on 2018-03-18.
 */
public class UpsidedownTree extends XTree {
    public UpsidedownTree(int height, String direction) {
        super(height, direction);
    }

    public UpsidedownTree(int height, String direction, String branchIcon) {
        super(height, direction, branchIcon);
    }

    @Override
    protected void drawSpaces(int times) {
        System.out.print(StringUtils.repeat(" ",times));
    }

    @Override
    protected void drawbranches(int times) {
        System.out.print(StringUtils.repeat(this.getBranchIcon(),2*getHeight()-1-2*times));
    }
}
