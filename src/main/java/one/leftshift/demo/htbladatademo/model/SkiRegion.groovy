package one.leftshift.demo.htbladatademo.model

import groovy.transform.builder.Builder

/**
 * @author bnjm@harmless.ninja - 11/9/17.
 */
@Builder
class SkiRegion {
    String name
    GeoLocation geoLocation
    WeatherInformation weatherInformation
    List<Ticket> tickets
}