package co.altir.config;

import co.altir.config.RedisKeyspaceConfig.EnvironmentKeyspaceConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.convert.KeyspaceConfiguration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories(keyspaceConfiguration = EnvironmentKeyspaceConfiguration.class)
public class RedisKeyspaceConfig {

    public static class EnvironmentKeyspaceConfiguration extends KeyspaceConfiguration {

        @Override
        protected Iterable<KeyspaceSettings> initialConfiguration() {
            return super.initialConfiguration();
        }

    }

}
