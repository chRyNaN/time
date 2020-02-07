package com.chrynan.time

/**
 * A class representing a time zone region identifier, such as "America/Phoenix". Note that this class does not contain
 * any information about UTC offsets or time. Also, note that no checks are performed to assert a valid input when
 * constructing an instance of this class.
 *
 * @property [id] The identifier of the time zone. For example, "America/Phoenix".
 * @property [shortName] The short name of this time zone identifier. For example, "PNT".
 *
 * @author chRyNaN
 */
inline class TimeZoneRegionId(val id: String) {

    /**
     * Retrieves the region part of the time zone id. For example, for the id "America/Argentina/Buenos_Aires", the
     * region would be "America/Argentina". For an id of "America/Anchorage", the region would be "America". Note that
     * not all time zone ids have a region because some may represent a UTC offset. For example, for an id of "-05:00",
     * null would be returned.
     *
     * @author
     */
    val region: String?
        get() {
            val index = id.lastIndexOf(SEPERATOR)
            if (index == -1) return null
            return id.substring(0, index)
        }

    /**
     * Retrieves the city part of the time zone id. For example, for the id "America/Argentina/Buenos_Aires", the city
     * would be "Buenos_Aires". For an id of "America/Anchorage", the city would be "Anchorage". Note that the returned
     * value might not be an actual city name. Also note that not all time zone ids have a city because some may
     * represent a UTC offset. For example, for an id of "-5:00", null would be returned.
     *
     * @author chRyNaN
     */
    val city: String?
        get() {
            val index = id.lastIndexOf(SEPERATOR)
            if (index == -1) return null
            return id.substring(index)
        }

    companion object {

        private const val SEPERATOR = '/'
    }
}