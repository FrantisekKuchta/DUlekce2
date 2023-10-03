import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Vytvoř hosty Adélu Malíkovou (narozena 13. 3. 1993) a Jana Dvořáčka (narozen 5.5.1995). Vypiš na obrazovku jejich souhrnný popis ve formátu: Adéla Malíková (1993-03-13).
//
//Vytvoř pokoje a vypiš na obrazovku jejich popis:
//pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem na výhledem na moře.
//pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.
//Připrav rezervace:
//pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
//pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
//Vypiš seznam všech rezervací.
public class Main {
    public static void main(String[] args) {


        Guest guest = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jana","Dvořáčková",LocalDate.of(1995,5,5));

        System.out.println(guest);
        System.out.println(guest2);

        List<Guest> guestList = new ArrayList<>();

        guestList.add(guest);
        guestList.add(guest2);

//        int i = 0;
//        for (Guest guests : guestList) {
//            System.out.println(i+": " +guests);
//            i++;
//        }

        Room room = new Room(1,1,1000,true,true);
        Room room2 = new Room(2,1,1000,true,true);
        Room room3 = new Room(3,3,2400,false,true);

//        List<Room> roomList = new ArrayList<>();
//        roomList.add(room);
//        roomList.add(room2);
//        roomList.add(room3);
//
//        int i2 = 0;
//        for (Room rooms : roomList) {
//            System.out.println(i2 + ": " + rooms);
//            i2++;
//        }


        Booking booking = new Booking(LocalDate.of(2021,7,19),LocalDate.of(2021,7,27),
                8,room,guest,false,true);

        Booking booking2 = new Booking(LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),
                14,room3,guestList,true, false);


        System.out.println(booking);
        System.out.println(booking2);


//      List<Booking> bookingList = new ArrayList<>();
//
//      bookingList.add(booking);
//      bookingList.add(booking2);
//      bookingList.add(booking3);
//      bookingList.add(booking4);
//
//      int i3 = 0;
//      for (Booking bookings : bookingList) {
//          System.out.println(i3 + ": " + bookings);
//          i3++;
      }



   }



