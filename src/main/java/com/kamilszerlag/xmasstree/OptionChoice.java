package com.kamilszerlag.xmasstree;


/**
 * Created by szerlag on 2018-03-22.
 */
public class OptionChoice {
    public void Menu() {
        ScannerValidation inputValidator = new ScannerValidation();
        do {
            System.out.println("\nPodaj typ choinki jaki chcesz utworzyć:\n   -'up' klasyczna choinka\n   -'left' choinka zwrocona w lewo\n   -'right' choinka zwrocona w prawo\n   -'upsidedown' choinka zwrocona czubkiem w dol\n   -'extra' choinka z dodatkami");
            switch (inputValidator.inputTreeName()) {
                case "up": {
                    System.out.println("Podaj wartosc wysokosci choinki (Pamietaj aby byly wieksze od zera!)  \n");
                    XTree upTree = new UpTree(inputValidator.inputTreeHeight(), "up", inputValidator.inputBranchesIcon());
                    upTree.buildTree();
                    break;
                }
                case "left": {
                    System.out.println("Podaj wartosc wysokosci choinki (Pamietaj aby byly wieksze od zera!)  \n");
                    XTree leftTree = new LeftTree(inputValidator.inputTreeHeight(), "left", inputValidator.inputBranchesIcon());
                    leftTree.buildTree();
                    break;
                }
                case "right": {
                    System.out.println("Podaj wartosc wysokosci choinki (Pamietaj aby byly wieksze od zera!)  \n");
                    XTree rightTree = new RightTree(inputValidator.inputTreeHeight(), "right", inputValidator.inputBranchesIcon());
                    rightTree.buildTree();
                    break;
                }
                case "upsidedown": {
                    System.out.println("Podaj wartosc wysokosci choinki (Pamietaj aby byly wieksze od zera!)  \n");
                    XTree upSidedown = new UpsidedownTree(inputValidator.inputTreeHeight(), "upsidedown", inputValidator.inputBranchesIcon());
                    upSidedown.buildTree();
                    break;
                }
                case "extra": {
                    System.out.println("Podaj wartosc wysokosci choinki (Pamietaj aby byly wieksze od zera!)  \n");
                    XTree extraTree = new ExtraTree(inputValidator.inputTreeHeight(), "extra", inputValidator.inputBranchesIcon());
                    extraTree.buildTree();
                    break;
                }

            }

        } while (true);


    }
}

