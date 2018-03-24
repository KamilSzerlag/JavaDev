package com.kamilszerlag.xmasstree;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by szerlag on 2018-03-18.
 */
public class RightTree extends XTree {
    public RightTree(int height, String direction) {
        super(height, direction);
    }

    public RightTree(int height, String direction, String branchIcon) {
        super(height, direction, branchIcon);
    }

    @Override
    public void buildTree() {
        for (int i = 0; i < 2 * getHeight() + 1; i++) {
            drawbranches(i);
            System.out.println();

        }
    }

    @Override
    protected void drawbranches(int times) {
        if (times < getHeight())
            System.out.print(StringUtils.repeat(this.getBranchIcon(), times + 1));
        else {System.out.print(StringUtils.repeat(this.getBranchIcon(), getHeight()*2 -times - 1));}
    }

    }

