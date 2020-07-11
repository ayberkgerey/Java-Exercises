package com.geray;

import java.io.IOException;

public class Prompt {
    public void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
