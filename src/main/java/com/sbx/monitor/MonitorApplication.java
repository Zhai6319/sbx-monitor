package com.sbx.monitor;

import com.sbx.core.cloud.annotation.CloudConfigure;
import com.sbx.core.launch.Application;
import com.sbx.core.redis.annotation.EnableRedis;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * <p>说明：</p>
 *
 * @author Z.jc
 * @version 1.0.0
 * @since 2022/3/25
 */
@EnableRedis
@CloudConfigure
@EnableAdminServer
public class MonitorApplication {

    public static void main(String[] args) {
        Application.run("sbx-monitor",MonitorApplication.class,args);
    }
}
