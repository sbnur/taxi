package taxi.eskar.eskartaxi.data.bus.events

import taxi.eskar.eskartaxi.data.model.LatLon

data class ShowDriverLocationRequest(val latLon: LatLon, val focus: Boolean = false) : Event()