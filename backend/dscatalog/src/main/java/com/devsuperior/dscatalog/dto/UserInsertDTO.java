package com.devsuperior.dscatalog.dto;

public class UserInsertDTO extends UserDTO {

    private String password;

    UserInsertDTO(){
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
