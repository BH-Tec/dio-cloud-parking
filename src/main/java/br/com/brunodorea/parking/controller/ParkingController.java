package br.com.brunodorea.parking.controller;

import br.com.brunodorea.parking.controller.dto.ParkingCreateDTO;
import br.com.brunodorea.parking.controller.dto.ParkingDTO;
import br.com.brunodorea.parking.controller.mapper.ParkingMapper;
import br.com.brunodorea.parking.model.Parking;
import br.com.brunodorea.parking.service.ParkingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;

    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping
    public ResponseEntity<List<ParkingDTO>> findAll() {
        List<Parking> parkingList = parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);

        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingDTO> findById(@PathVariable String id) {
        Parking parking = parkingService.findById(id);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);

        return ResponseEntity.ok(result);
    }

    @PostMapping()
    public ResponseEntity<ParkingDTO> create(@RequestBody ParkingCreateDTO dto) {
        var parkingCreate = parkingMapper.toParkingCreate(dto);
        Parking parking = parkingService.create(parkingCreate);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ParkingDTO> update(@PathVariable String id, @RequestBody ParkingCreateDTO parkingCreateDTO) {
        var parkingCreate = parkingMapper.toParkingCreate(parkingCreateDTO);
        Parking parking = parkingService.update(id, parkingCreate);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        parkingService.delete(id);

        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}")
    public ResponseEntity<ParkingDTO> exit(@PathVariable String id) {
        Parking parking = parkingService.exit(id);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
