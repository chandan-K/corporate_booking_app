package com.mindtree.api.corporatebookingservice.ndcclient;
/*
 * package com.mindtree.app.ndc.api.carbonoffsetservice.ndcclient;
 * 
 * import java.util.concurrent.TimeUnit; import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration; import
 * feign.Logger; import feign.RequestInterceptor; import feign.RequestTemplate; import feign.Retryer; import
 * feign.codec.Decoder; import feign.codec.Encoder; import feign.jaxb.JAXBContextFactory; import feign.jaxb.JAXBDecoder;
 * import feign.jaxb.JAXBEncoder;
 * 
 *//**
    * for NDC APIs
    *
    */
/*
 * @Configuration public class NDCFeignClientConfiguration {
 * 
 * 
 * @Value("${ndc.api.key}") String apiKey;
 * 
 * private static final JAXBContextFactory jaxbFactory = new
 * JAXBContextFactory.Builder().withMarshallerJAXBEncoding("UTF-8") //
 * .withMarshallerSchemaLocation("http://apihost http://apihost/schema.xsd") .build();
 * 
 * 
 * @Bean public RequestInterceptor basicAuthRequestInterceptor() { return new RequestInterceptor() {
 * 
 * @Override public void apply(RequestTemplate template) { template.header("Authorization-Key", apiKey); } }; }
 * 
 * @Bean public Encoder feignEncoder() { return new JAXBEncoder(jaxbFactory); }
 * 
 * @Bean public Decoder feignDecoder() { return new JAXBDecoder(jaxbFactory); }
 * 
 * 
 * 
 * @Bean public FeignClientErrorDecoder errorDecoder() { return new FeignClientErrorDecoder(); }
 * 
 *//**
    * Setting logger levels
    * 
    * @param debugLevel , level to user
    * @return Logger levels
    */
/*
 * 
 * @Bean public Logger.Level feignLoggerLevel(@Value("${feign.client.config.default.loggerLevel: FULL}") String
 * debugLevel) { return Logger.Level.valueOf(debugLevel); }
 * 
 *//**
    * Setting feignRetryer
    *//*
       * @Bean public Retryer feignRetryer() { return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 2); // this
       * will retry once }
       * 
       * 
       * }
       */
