package koschei.config;

import koschei.models.Deth8;
import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
    @Bean
    public static Egg6 getEgg(Deth8 deth8) {
        return new Egg6(deth8);
    }

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}
