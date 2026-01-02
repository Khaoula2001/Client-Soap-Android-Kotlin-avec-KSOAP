package ma.projet.soapclient.utils

import org.ksoap2.serialization.SoapObject

fun SoapObject.getPropertySafelyAsString(propertyName: String): String? {
    return try {
        if (this.hasProperty(propertyName)) {
            this.getProperty(propertyName)?.toString()
        } else {
            null
        }
    } catch (e: Exception) {
        null
    }
}