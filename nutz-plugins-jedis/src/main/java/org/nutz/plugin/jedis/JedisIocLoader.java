package org.nutz.plugin.jedis;

import org.nutz.ioc.loader.json.JsonLoader;

public class JedisIocLoader extends JsonLoader {

    public JedisIocLoader() {
        super("org/nutz/plugin/jedis/jedis.js");
    }
}
