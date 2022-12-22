package com.example.Pro01.Repo;

import com.example.Pro01.DTO.DeviceFingerprintDTO;
import com.example.Pro01.DTO.UserLoginDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserLoginRepo {
//    List<UserLoginDTO> loginDTOS = new ArrayList<>();

    private Map<String,String> userMap=new HashMap<>();

    public Map<String, String> getUserMap() {
        return userMap;
    }

    UserLoginRepo(){
        userMap.put("jm","123");
    }

//    public UserLoginRepo() {
//        loginDTOS.add(new UserLoginDTO("KASUNAPI340", "LTz2p#cS"));
//    }
}
