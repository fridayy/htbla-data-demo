package one.leftshift.demo.htbladatademo.model

import groovy.transform.TupleConstructor

/**
 * @author bnjm@harmless.ninja - 11/9/17.
 */
@TupleConstructor(includeFields = true)
class WeatherInformation {
    BigDecimal temperature
    BigDecimal windspeed
}
