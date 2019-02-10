package ch.renhor.hotel.services;

import ch.renhor.hotel.models.Address;
import ch.renhor.hotel.models.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    private List<Hotel> hotelList;

    public HotelService() {
    }

    {
        hotelList = new ArrayList<>();
        final Hotel hotel = new Hotel();
        hotel.setName("Grand Victoria");
        hotel.setAddress(new Address("Victoria Place", "1", null, "Baselland", "4200", "Switzerland"));
        hotel.setHomepage("www.victoria.ch");
        hotelList.add(hotel);
        final Hotel hilton = new Hotel();
        hilton.setName("Grand Victoria");
        hilton.setAddress(new Address("Hilton", "101", "Venice Garden", "Basel Stadt", "4000", "Switzerland"));
        hilton.setHomepage("www.hilton.ch");
        hotelList.add(hilton);
    }

    public List<Hotel> findAll() {
        return hotelList;
    }

    public Hotel findByName(String hotelName) {
        return hotelList.stream().filter(hotel -> hotel.getName() == hotelName).findFirst().map(hotel -> hotel).orElse(new Hotel());
    }
}
