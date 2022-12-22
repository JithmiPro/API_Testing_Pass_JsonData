package com.example.Pro01.Repo;


import com.example.Pro01.DTO.DeviceFingerprintDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DeviceFingerprintRepo {

    List<DeviceFingerprintDTO> DeviceDataMap = new ArrayList<>();


    public DeviceFingerprintRepo() {
//        DeviceDataMap.add("KASADMIN", "", "", "", "", "", "", "", "");
        DeviceDataMap.add(new DeviceFingerprintDTO("KASADMIN", "a",
                "b", "c", "d", "e", "f",
                "g", "h"));

    }


}
