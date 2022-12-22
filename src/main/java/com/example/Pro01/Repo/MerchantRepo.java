package com.example.Pro01.Repo;

import com.example.Pro01.DTO.DeviceFingerprintDTO;
import com.example.Pro01.DTO.MerchantDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MerchantRepo {


    List<MerchantDTO> MercMap = new ArrayList<>();


    public MerchantRepo() {
//        DeviceDataMap.add("KASADMIN", "", "", "", "", "", "", "", "");
        MercMap.add(new MerchantDTO(
                "001360001006834",
                "00165C7AE2FC10AC905699BB22462911A2A207C1F54D1DA04D59AABB579E90C1BCA5411DAC1EB3262CA33D550059BDA7155",
                "MTEwMDEzNjAwMDEwMDY4MzRmNjAxNmYzMS02ODljLTRiMmMtYmJlMS1lZmEyNWM1MDU2N",
                "30249",
                "sale",
                "1.17",
                "QAR",
                "card",
                "visa",
                "Ahamed",
                "",
                "7E5A31FA0C6200332C63CD3C725309D28114903E8A58E098F3366DF95A92D673FB4F224AA64BD7C8CA95DAA876366DAD062E413A9B6BDD3A68033AC77D7C24A6E55F2D98261F0BFFC2F23EA36C8B533976BA3F3B4FA42C2218A03158819C8ABCCDA96A012EB193E1B49EAE8194960B7D98510C971235A2A5764496412232112C"

        ));

    }


}
