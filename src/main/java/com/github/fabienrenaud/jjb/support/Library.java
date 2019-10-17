package com.github.fabienrenaud.jjb.support;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by frenaud on 7/24/16.
 */
public enum Library {
    GSON,
    GSON_JSONOBJECT,
    JACKSON,
    JACKSON_AFTERBURNER,
    JACKSON_ORGJSON,
    ORGJSON,
    YASSON,
    GENSON,
    JAVAXJSON,
    JAVAXJSON_JSONOBJECT,
    FLEXJSON,
    FASTJSON,
    JSONIO,
    BOON,
    JOHNZON,
    JSONSMART,
    DSLJSON,
    DSLJSON_REFLECTION,
    LOGANSQUARE,
    JSONSIMPLE,
    NANOJSON,
    JODD,
    MOSHI,
    TAPESTRY,
    JSONITER,
    MINIMALJSON,
    MJSON,
    UNDERSCORE_JAVA,
    PUREJSON;

    public static Set<Library> fromCsv(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.emptySet();
        }

        Set<Library> libs = new HashSet<>();
        String[] vals = str.trim().toUpperCase().split(",");
        for (String v : vals) {
            libs.add(Library.valueOf(v));
        }

        return libs;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
