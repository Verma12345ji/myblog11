package com.reservationapp.Payload;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
        private String busNumber;
        private String busType;
        private double price;
        private int totalSeat;
        private int availableSeat;

//    private RouteDto route;
//    private List<SubRouteDto> subRoutes;
}

