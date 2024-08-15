package com.cbdemo.cb.config;

import com.querydsl.core.annotations.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchBaseConfig extends AbstractCouchbaseConfiguration {
    @Override
    public String getConnectionString() {
        return "couchbase://127.0.0.1";
    }

    @Override
    public String getUserName() {
        return "ranvijay";
    }

    @Override
    public String getPassword() {
        return "MRvijay@1234";
    }

    @Override
    public String getBucketName() {
        return "customer";
    }
}
