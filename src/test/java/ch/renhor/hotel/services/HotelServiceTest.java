package ch.renhor.hotel.services;

import ch.renhor.hotel.models.Hotel;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HotelServiceTest {

    @Test
    public void initialTest() {
//        init
        List<String> mockList = mock(List.class);
        mockList.add("First");
//        when
        when(mockList.get(0)).thenReturn("Mockito");
        when(mockList.get(1)).thenReturn("JCG");
//        then
        assertEquals("Mockito", mockList.get(0));
        assertEquals("JCG", mockList.get(1));
    }

    @Test
    public void findAll() {
//        when
        final HotelService hotelService = new HotelService();
//        then
        assertTrue("Shoule have at least one hotel.", hotelService.findAll().size() > 0);
        assertEquals("Grand Victoria", hotelService.findAll().get(0).getName());
    }

    @Test
    public void findByNameUnknown() {
        final HotelService hotelService = new HotelService();
//
//        when
        final Hotel placa = hotelService.findByName("Placa");
//        then
        assertNull("Placa is an undefined hotel", placa.getName());
        assertNull("Placa is an undefined hotel", placa.getAddress());
        assertNull("Placa is an undefined hotel", placa.getHomepage());
    }

    @Test
    public void findByNameKnown() {
        final HotelService hotelService = new HotelService();
//
//        when
        final Hotel victoria = hotelService.findByName("Grand Victoria");
//        then
        assertTrue("Should have found hotel Grand Victoria", !victoria.equals(new Hotel()));
        assertTrue("Should have name an address", victoria.getAddress() != null);
        assertEquals("Should have name a homepage", "www.victoria.ch", victoria.getHomepage());
   }
}