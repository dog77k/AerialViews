package com.neilturner.aerialviews.models.prefs

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.enumpref.enumValuePref
import com.neilturner.aerialviews.models.LocationType

object InterfacePrefs : KotprefModel() {

    override val kotprefName = "${context.packageName}_preferences"

    var showClock by booleanPref(true, "show_clock")
    var showLocation by enumValuePref(LocationType.POI, "location_style")
    var alternateTextPosition by booleanPref(false, "alt_text_position")

    var locationTextSize by stringPref("18", "test_location_text_size")
    var locationTextShadow by booleanPref(true, "test_location_text_shadow")
}
