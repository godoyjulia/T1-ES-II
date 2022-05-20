package br.pucrs.engswii.beans;

import java.util.ArrayList;
import java.util.HashMap;

public class UserLogin {
    String registrationNumber;
    String password;
    public static HashMap<String, String> listaUsuariosLogin = new HashMap<String, String>();

    private static UserLogin userLog = null;

    ArrayList<String> loggedInUsers = new ArrayList<>();

    public static UserLogin getInstance() {

		if(userLog == null) {
			userLog = new UserLogin();
			return userLog;
		}
		else {
			return userLog;
		}
	}

	public static void add(String regNum, String password) {
		listaUsuariosLogin.put(regNum, password);
	}
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

    public static void addUser(String id, String senha){
        listaUsuariosLogin.put(id, senha);
    }

    public void logIn(String registrationNumber){
        loggedInUsers.add(registrationNumber);
    }

    public void logOut (String registrationNumber){
        loggedInUsers.remove(registrationNumber);
    }

    public boolean isSomeoneLogged(){
        return loggedInUsers.size() > 0;
    }
}
