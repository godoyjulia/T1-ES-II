package br.pucrs.engswii.beans;

import java.util.HashMap;

public class UserLogin {
    String registrationNumber;
    String password;
    HashMap<String, String> listaUsuariosLogin = new HashMap<String, String>();


    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void addUser(String id, String senha){
        this.listaUsuariosLogin.put(id, senha);
    }

    public boolean logar(String id, String senha){
        String s = listaUsuariosLogin.get(id);
        return s == senha;
    }
}
