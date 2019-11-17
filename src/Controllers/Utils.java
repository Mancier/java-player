/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class Utils {
    int generateKeys(){
        int key = hashCode();
        System.out.println("Hash Created: "+key);
        return key;
    }
       
    void showErrorDialog(String title, Object message){
        JOptionPane.showConfirmDialog(null, title, message.toString(), JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE);
        throw new NullPointerException("Check the key and value, because one/both are null");
    }
}
