/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.klasser;

import oru.inf.InfDB;

/**
 *
 * @author Grupp4
 */
public class Alien {
    private static InfDB idb;
    private int alienId;
    private String registrationDate;
    private String password;
    private String name;
    private String phoneNumber;
    private int location;
    private int contactAgent;
    
    public Alien(InfDB idb) {
        this.idb = idb;
    }
}
