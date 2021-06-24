package co.altir.config;

import co.altir.config.RedisKeyspaceConfig.EnvironmentKeyspaceConfiguration;
import co.altir.model.Record;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.convert.KeyspaceConfiguration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableRedisRepositories(keyspaceConfiguration = EnvironmentKeyspaceConfiguration.class)
public class RedisKeyspaceConfig {

    @Value("${app.redis-keyspace}")
    private String redisKeyspace;

    public class EnvironmentKeyspaceConfiguration extends KeyspaceConfiguration {

        @Override
        protected Iterable<KeyspaceSettings> initialConfiguration() {
            List<KeyspaceSettings> settings = new ArrayList<>();
            settings.add(new KeyspaceSettings(Record.class, redisKeyspace + "." + Record.class.getName()));

            return settings;
        }

    }

}
