package org.devintest.GitDemo;

public class GitDemo {
    public static void main(String[] args) {
        System.out.println("Git Demo");
        GitDemo gD = new GitDemo();
        gD.tryGit("MasterBranch");
            }

            public void tryGit(String name){

                System.out.println("Trying to commit changes in " + name );
            }
}
