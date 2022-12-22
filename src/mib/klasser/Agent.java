/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.klasser;

import oru.inf.InfDB;

/**
 *
 * @author theosohlman
 */
public class Agent {
    private static InfDB idb;
    private int agentID;
    private String name;
    private String phoneNumber;
    private String employmentDate;
    private boolean administrator;
    private int password;
    private int area;
    
    public Agent(InfDB idb) {
        this.idb = idb;
    }
}
