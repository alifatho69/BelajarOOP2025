package BAB4.Enkapsulasi_Implementasi2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fauzan
 */
public class Login {
     private String username, password;
     public String nama;
     
     public Login(){
         nama = "Muhammad Alief Atho'illah";
         username = "Alif";
         password = "Alif123";
     }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
    public boolean CekLogin(String Username , String password){
        if(username.equals(getUsername())&& password.equals(getPassword())){
            return true;
        }
        return false;
    } 
}
