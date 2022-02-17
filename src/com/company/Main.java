package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Repository repo = new Repository(); Controller cntr = new Controller(repo); View view = new View(cntr); view.start(); }

    }
}
