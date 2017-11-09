package one.leftshift.demo.htbladatademo.service

import one.leftshift.demo.htbladatademo.model.GeoLocation
import one.leftshift.demo.htbladatademo.model.SkiRegion
import one.leftshift.demo.htbladatademo.model.Ticket
import one.leftshift.demo.htbladatademo.model.WeatherInformation
import org.springframework.stereotype.Service

/**
 * @author bnjm@harmless.ninja - 11/9/17.
 */
@Service
class SkiRegionProviderServiceImpl implements SkiRegionProviderService {
    @Override
    List<SkiRegion> provide() {
        // @formatter:off
        return [
                SkiRegion.builder().name("Grebenzen")
                        .geoLocation(new GeoLocation(47.072714, 14.310545))
                        .weatherInformation(new WeatherInformation(5.0, 12.5))
                        .tickets([
                                new Ticket(40.0, Ticket.TicketType.FULL),
                                new Ticket(25.0, Ticket.TicketType.STUDENT),
                                new Ticket(10.0, Ticket.TicketType.KIDS),
                            ]).build(),

                SkiRegion.builder().name("Fanningberg")
                        .geoLocation(new GeoLocation(47.166823, 13.666416))
                        .weatherInformation(new WeatherInformation(-8.0, 23.5))
                        .tickets([
                                new Ticket(35.99, Ticket.TicketType.FULL),
                                new Ticket(24.5, Ticket.TicketType.STUDENT),
                                new Ticket(9.99, Ticket.TicketType.KIDS),
                            ]).build(),
                SkiRegion.builder().name("St. Anton am Arlberg")
                        .geoLocation(new GeoLocation(47.129635, 10.268179))
                        .weatherInformation(new WeatherInformation(0.0, 5.1))
                        .tickets([
                                new Ticket(99.99, Ticket.TicketType.FULL),
                                new Ticket(90.0, Ticket.TicketType.STUDENT),
                                new Ticket(29.99, Ticket.TicketType.KIDS),
                            ]).build(),
                SkiRegion.builder().name("Kitzbühel")
                        .geoLocation(new GeoLocation(47.447752, 12.315177))
                        .weatherInformation(new WeatherInformation(-10.0, 52.1))
                        .tickets([
                                new Ticket(50.0, Ticket.TicketType.FULL),
                                new Ticket(25.0, Ticket.TicketType.STUDENT),
                                new Ticket(15.0, Ticket.TicketType.KIDS),
                            ]).build(),
                SkiRegion.builder().name("Saalbach Hinterglemm")
                        .geoLocation(new GeoLocation(47.391941, 12.641558))
                        .weatherInformation(new WeatherInformation(-20.0, 75.8))
                        .tickets([
                                new Ticket(42.5, Ticket.TicketType.FULL),
                                new Ticket(22.5, Ticket.TicketType.STUDENT),
                                new Ticket(13.0, Ticket.TicketType.KIDS),
                            ]).build(),

        ]
        // @formatter:on
    }
}
