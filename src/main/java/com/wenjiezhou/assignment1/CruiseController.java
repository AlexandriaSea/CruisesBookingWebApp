package com.wenjiezhou.assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CruiseController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/index")
    public ModelAndView bookCruise(@RequestParam(value = "firstName") String firstName,
                                   @RequestParam(value = "lastName") String lastName,
                                   @RequestParam(value = "areaCode") String areaCode,
                                   @RequestParam(value = "phoneNumber") String phoneNumber,
                                   @RequestParam(value = "streetAddress_1") String streetAddress_1,
                                   @RequestParam(value = "streetAddress_2") String streetAddress_2,
                                   @RequestParam(value = "city") String city,
                                   @RequestParam(value = "province") String province,
                                   @RequestParam(value = "postalCode") String postalCode,
                                   @RequestParam(value = "country") String country,
                                   @RequestParam(value = "email") String email,
                                   @RequestParam(value = "roomNumber") int roomNumber,
                                   @RequestParam(value = "roomType") String roomType,
                                   @RequestParam(value = "roomPrice") double roomPrice,
                                   @RequestParam(value = "guestNumber") int guestNumber,
                                   @RequestParam(value = "ageGroup") String ageGroup) {
        Cruise cruise = new Cruise(firstName, lastName, areaCode, phoneNumber, streetAddress_1,
                streetAddress_2, city, province, postalCode, country, email, roomNumber, roomType,
                roomPrice, guestNumber, ageGroup);
        ModelAndView mview = new ModelAndView("show-cruise");
        mview.addObject("cruise", cruise);
        return mview;
    }
}
