package com.example.Pro01.Controller;

import com.example.Pro01.DTO.Request.*;
import com.example.Pro01.DTO.Response.*;
import com.example.Pro01.Repo.TokenRepo;
import com.example.Pro01.Repo.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import javax.servlet.ServletException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    UserLoginRepo userRepo;
    @Autowired
    TokenRepo tokenRepo;

    @RequestMapping("/loginss")
    public ModelAndView login(UserLoginRequest req,
                              @RequestHeader(name = "Authorization", required = false) String token,
                              Model theModel, Authentication authentication) {

        UserLoginResponse res = new UserLoginResponse();
        token = "275c773f42a0b83461bcc00f9c983420e124b34b50b1fae0da872b183127370b";
        try {
            tokenRepo.validateToken(token);
        } catch (Exception ex) {
        } finally {
//        if (!userRepo.getUserMap().containsKey(req.getUserId())) {
//            res.setStatusCode("09");
//            res.setError("User Not found.");
//        } else {
//            if (genHash(req.getPassword()).equalsIgnoreCase(userRepo.getUserMap().get(req.getUserId()))) {
            if (req.getPassword().equals(userRepo.getUserMap().get(req.getUserId()))) {
                res.setStatusCode("00");
                res.setE_msg("Login Successful");
                res.setToken("275c773f42a0b83461bcc00f9c983420e124b34b50b1fae0da872b183127370b");
                res.setUserId(req.getUserId());
                res.setUserName(req.getPassword());
                res.setP_key("" + genHash(req.getPassword()));

//                String userName = authentication.getName();
                // Login pg msg
                theModel.addAttribute("color1", "#88B04B");
                theModel.addAttribute("color2", "goldenrod");
                theModel.addAttribute("color3", "goldenrod");
                theModel.addAttribute("color4", "goldenrod");
                theModel.addAttribute("color5", "goldenrod");
                theModel.addAttribute("color6", "goldenrod");
                theModel.addAttribute("color7", "goldenrod");
                theModel.addAttribute("color8", "goldenrod");
                theModel.addAttribute("Note1", "Login Success");
                theModel.addAttribute("visi", false);

//                HttpSession session = request.getSession(false);
//                if (session != null) {
//                    session.setAttribute("SESSION_DETAILS", req.userId);
//                }
//                theModel.addAttribute("abc",req.userId);
//                return new ModelAndView("/TitleBar");
                return new ModelAndView("/SuccessPage.html");
            } else {
                res.setStatusCode("09" + genHash(req.getPassword()));
                res.setE_msg("Password Incorrect.");
                res.setToken(null);
                res.setUserId(req.getUserId());
                res.setUserName(req.getPassword());

                return new ModelAndView("/ErrorPage.html");
            }
//        }
//            return res;
            //   theModel.addAttribute("status_code", res.getE_msg());

        }
    }


    public static String genHash(String input) {
        MessageDigest digest;
        String hash = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");

            byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            hash = bytesToHex(encodedhash);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return hash;
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    //---------------------------01 pg --------- FRONT PG ----------------------------------------------------------------------------------
    @RequestMapping("/merchantDetails")
    public ModelAndView merchant_login(MerchantRequest req, UserLoginRequest req2,
                                       @RequestHeader(name = "Authorization", required = false) String token, Model model)
            throws ServletException, IOException {

        MerchantResponse res = new MerchantResponse();
        res.setMerchantPwd(req.getMerchantPwd());
        res.setMerchantId(req.getMerchantId());
        res.setMerchantKey(req.getMerchantKey());
        res.setMerchantTxnId(req.getMerchantTxnId());
        res.setCurrCode(req.getCurrCode());
        res.setToken(req.getToken());
        res.setTxnAmt(req.getTxnAmt());
        res.setCardHolderName(req.getCardHolderName());
        res.setProductType(req.getProductType());
        res.setTxnType(req.getTxnType());
        res.setCardHolderName(req.getCardHolderName());
        res.setInstrumentType(req.getInstrumentType());

        UserLoginResponse res2 = new UserLoginResponse();
        ResponseStatusException responseStatusException;
        res2.setE_msg(HttpStatus.values().toString());

        try {
            if (!req.merchantTxnId.equals(null) && !req.merchantTxnId.equals("null") && !req.merchantTxnId.equals("")
            ) {
                // merchant part 1 - msg

                model.addAttribute("color1", "#88B04B");
                model.addAttribute("color2", "#88B04B");
                model.addAttribute("color3", "goldenrod");
                model.addAttribute("color4", "goldenrod");
                model.addAttribute("color5", "goldenrod");

                model.addAttribute("color6", "goldenrod");
                model.addAttribute("color7", "goldenrod");
                model.addAttribute("color8", "goldenrod");
                model.addAttribute("visi1", false);
                model.addAttribute("visi2", true);
                model.addAttribute("visi", true);
                model.addAttribute("Note1", "Merchant's Details Part 1 Complete");
                return new ModelAndView("/SuccessPage.html");
            } else {

                throw new Exception();
            }

        } catch (Exception ex) {

            model.addAttribute("msg", ex.getStackTrace());

            return new ModelAndView("/ErrorPage.html");
        }


    }

    //-------------------------02 pg -----------NEXT PG--------------------------------------------------------------------------------------
    @RequestMapping("/merchantDetails-part2")
    public ModelAndView merchant_Next(Merchant_Part2_Request req,
                                      Model model) {
        Merchant_Part2_Response part2_response = new Merchant_Part2_Response();

        part2_response.setBrowserName(req.getBrowserName());
        part2_response.setCityOrTown(req.getCityOrTown());
        part2_response.setCompanyName(req.getCompanyName());
        part2_response.setCookiesEnabled(req.getCookiesEnabled());
        part2_response.setCountry(req.getCountry());
        part2_response.setCountryCode(req.getCountryCode());
        part2_response.setEmail(req.getEmail());
        part2_response.setDeviceType(req.getDeviceType());
        part2_response.setFirstName(req.getFirstName());
        part2_response.setLastName(req.getLastName());
        part2_response.setMerchantVar1(req.getMerchantVar1());
        part2_response.setMerchantVar2(req.getMerchantVar2());
        part2_response.setMerchantVar3(req.getMerchantVar3());
        part2_response.setMerchantVar4(req.getMerchantVar4());
        part2_response.setLatitude(req.getLatitude());
        part2_response.setOverrideReturnServiceURL(req.getOverrideReturnServiceURL());
        part2_response.setRuleCom(req.getRuleCom());

        //visi2
//        return part2_response;
        try {
            if (!req.ruleTrn.equals(null) && !req.ruleTrn.equals("null") && !req.ruleTrn.equals("")
            ) {

                model.addAttribute("color1", "#88B04B");
                model.addAttribute("color2", "#88B04B");
                model.addAttribute("color3", "#88B04B");
                model.addAttribute("color4", "goldenrod");
                model.addAttribute("color5", "goldenrod");

                model.addAttribute("color6", "goldenrod");
                model.addAttribute("color7", "goldenrod");
                model.addAttribute("color8", "goldenrod");
                model.addAttribute("visi2", false);
                model.addAttribute("visi1", true);
                model.addAttribute("visi", true);
                model.addAttribute("visi3", true);
                model.addAttribute("Note1", "Merchant's Details Part 2 Complete , Go to part 3 ");
                return new ModelAndView("/SuccessPage.html");
            } else {

                throw new Exception();
            }
        } catch (Exception ex) {
            model.addAttribute("msg", ex.getStackTrace());
            return new ModelAndView("/ErrorPage.html");
        }
    }

    //----part3
    @RequestMapping("/merchantDetails-part3")
    public ModelAndView merchant_Next(Merchant_Part3_Request req,
                                      Model model) {
        Merchant_Part3_Response response = new Merchant_Part3_Response();
        response.setArrivalTime(req.arrivalTime);
        response.setArrivalTimeSegment(req.arrivalTimeSegment);
        response.setConjunctionTicket(req.conjunctionTicket);
        response.setEndorsementRestrictions(req.endorsementRestrictions);
        response.setDepartureTime(req.getDepartureTime());

        model.addAttribute("color1", "#88B04B");
        model.addAttribute("color2", "#88B04B");
        model.addAttribute("color3", "#88B04B");
        model.addAttribute("color4", "#88B04B");
        model.addAttribute("color5", "#88B04B");

        model.addAttribute("color6", "goldenrod");
        model.addAttribute("color7", "goldenrod");
        model.addAttribute("color8", "goldenrod");

        model.addAttribute("visi4", false);
        model.addAttribute("visi3", true);
        model.addAttribute("visi2", true);
        model.addAttribute("visi1", true);
        model.addAttribute("visi", true);

        model.addAttribute("Note1", "Merchant's Details Part 4  Complete  ");
//        return response;
        return new ModelAndView("/SuccessPage.html");
    }

    //----part4
    @RequestMapping("/merchantDetails-part4")
    public ModelAndView merchant_Next(Merchant_Part4_Request req,
                                      Model model) {
        Merchant_Part4_Response response = new Merchant_Part4_Response();
        response.setCityOfOrigin(req.getCityOfOrigin());
        model.addAttribute("color1", "#88B04B");
        model.addAttribute("color2", "#88B04B");
        model.addAttribute("color3", "#88B04B");
        model.addAttribute("color4", "#88B04B");
        model.addAttribute("color5", "#88B04B");

        model.addAttribute("color6", "#88B04B");
        model.addAttribute("color7", "goldenrod");
        model.addAttribute("color8", "goldenrod");

        model.addAttribute("visi4", false);
        model.addAttribute("visi3", true);
        model.addAttribute("visi2", true);
        model.addAttribute("visi1", true);
        model.addAttribute("visi", true);

        model.addAttribute("Note1", "Merchant's Details Part 5  Complete  ");
//        return response;
        return new ModelAndView("/SuccessPage.html");
    }


    //----part5
    @RequestMapping("/merchantDetails-part5")
    public ModelAndView merchant_Next(Merchant_Part5_Request req,
                                      Model model) {

        model.addAttribute("color1", "#88B04B");
        model.addAttribute("color2", "#88B04B");
        model.addAttribute("color3", "#88B04B");
        model.addAttribute("color4", "#88B04B");
        model.addAttribute("color5", "#88B04B");

        model.addAttribute("color6", "#88B04B");
        model.addAttribute("color7", "goldenrod");
        model.addAttribute("color8", "goldenrod");

        model.addAttribute("visi5", false);
        model.addAttribute("visi4", true);
        model.addAttribute("visi3", true);
        model.addAttribute("visi2", true);
        model.addAttribute("visi1", true);
        model.addAttribute("visi", true);

        model.addAttribute("Note1", "Merchant's Details Part 5  Complete  ");


        return new ModelAndView("/SuccessPage.html");
    }

    //----part6
    @RequestMapping("/merchantDetails-part6")
    public ModelAndView merchant_Next(Merchant_Part6_Request req,
                                      Model model) {
        model.addAttribute("color1", "#88B04B");
        model.addAttribute("color2", "#88B04B");
        model.addAttribute("color3", "#88B04B");
        model.addAttribute("color4", "#88B04B");
        model.addAttribute("color5", "#88B04B");

        model.addAttribute("color6", "#88B04B");
        model.addAttribute("color7", "#88B04B");
        model.addAttribute("color8", "goldenrod");

        model.addAttribute("visi6", false);
        model.addAttribute("visi5", true);
        model.addAttribute("visi4", true);
        model.addAttribute("visi3", true);
        model.addAttribute("visi2", true);
        model.addAttribute("visi1", true);
        model.addAttribute("visi", true);

        model.addAttribute("Note1", "Merchant's Details Part 6  Complete  ");

        return new ModelAndView("/SuccessPage.html");
    }

    //----part7
    @RequestMapping("/merchantDetails-part7")
    public ModelAndView merchant_Next(Merchant_Part7_Request req,
                                      Model model) {
        model.addAttribute("color1", "green");
        model.addAttribute("color2", "green");
        model.addAttribute("color3", "green");
        model.addAttribute("color4", "green");
        model.addAttribute("color5", "green");

        model.addAttribute("color6", "green");
        model.addAttribute("color7", "green");
        model.addAttribute("color8", "green");

        model.addAttribute("visi5", true);
        model.addAttribute("visi4", true);
        model.addAttribute("visi3", true);
        model.addAttribute("visi2", true);
        model.addAttribute("visi1", true);
        model.addAttribute("visi", true);

        model.addAttribute("Note1", "MISSION ACCOMPLISHED");
        model.addAttribute("done", "DONE");

        return new ModelAndView("/SuccessPage.html");
    }

}
