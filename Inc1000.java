/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestInc1000.java;

/**
 *
 * @author perri.christian
 */
class Inc1000 extends Thread {

    static int count;

    Inc1000() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1);
            count++;
        }

    }

}
