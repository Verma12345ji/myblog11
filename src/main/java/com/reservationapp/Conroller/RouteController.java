package com.reservationapp.Conroller;


import com.reservationapp.Service.RouteService;
import com.reservationapp.entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/route")
public class RouteController {
    @Autowired
    private RouteService routeService;
    @PostMapping("/{busId}")
    public ResponseEntity<Route> addRoute(@PathVariable long busId, @RequestBody Route route){
        Route r = routeService.createRoute(busId,route);
        return new ResponseEntity<>(r, HttpStatus.CREATED);

    }
}