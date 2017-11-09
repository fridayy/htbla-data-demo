package one.leftshift.demo.htbladatademo.model

import groovy.transform.TupleConstructor

/**
 * @author bnjm@harmless.ninja - 11/9/17.
 */
@TupleConstructor(includeFields = true)
class Ticket {
    enum TicketType {
        FULL,
        STUDENT,
        KIDS
    }

    BigDecimal price
    TicketType ticketType
}
