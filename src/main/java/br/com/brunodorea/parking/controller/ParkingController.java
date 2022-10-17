package br.com.brunodorea.parking.controller;

import br.com.brunodorea.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking>findAll() {
        var parking = new Parking();
        parking.setColor("PRETO");
        parking.setLicense("MSS-1313");
        parking.setModel("VW Polo");
        parking.setState("BA");

        return Arrays.asList(parking);
    }
}
