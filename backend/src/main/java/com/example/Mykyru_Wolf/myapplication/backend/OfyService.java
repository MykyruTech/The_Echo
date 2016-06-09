package com.example.Mykyru_Wolf.myapplication.backend;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

/**
 * Objectify service wrapper so we can statically register our persistence classes
 * More on Objectify here : https://code.google.com/p/objectify-appengine/
 *
 */
class OfyService {

    static {
        ObjectifyService.register(RegistrationRecord.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

}
