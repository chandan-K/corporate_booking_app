package com.mindtree.api.corporatebookingservice.ndcclient;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Retryer;

/**
 * for NDC APIs
 */
@Configuration
public class NDCDuffelFeignClientConfiguration {


    @Value("${ndc.duffel.api.key}")
    String apiKey;

    @Bean
    @Qualifier("basicBearerAuthRequestInterceptor")
    public RequestInterceptor basicBearerAuthRequestInterceptor() {
        return new RequestInterceptor() {

            @Override
            public void apply(RequestTemplate template) {
                if (template.toString().contains("air/offer_requests")) {
                    template.header("Authorization", "Bearer " + apiKey);
                    template.header("Duffel-Version", "beta");
                }

            }
        };
    }

    @Bean
    @Qualifier("errorDecoderDuffel")
    public FeignClientErrorDecoder errorDecoderDuffel() {
        return new FeignClientErrorDecoder();
    }

    /**
     * Setting logger levels
     *
     * @param debugLevel , level to user
     * @return Logger levels
     */
    @Bean
    @Qualifier("feignLoggerLevelDuffel")
    public Logger.Level feignLoggerLevelDuffel(@Value("${feign.client.config.default.loggerLevel: FULL}") String debugLevel) {
        return Logger.Level.valueOf(debugLevel);
    }

    /**
     * Setting feignRetryer
     */
    @Bean
    @Qualifier("feignRetryerDuffel")
    public Retryer feignRetryerDuffel() {
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 2); // this will retry once
    }


}
