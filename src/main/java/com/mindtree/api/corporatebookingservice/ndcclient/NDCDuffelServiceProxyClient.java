package com.mindtree.api.corporatebookingservice.ndcclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mindtree.api.corporatebookingservice.DuffleSearchRequest.OfferRequest;
import com.mindtree.api.corporatebookingservice.DuffleSearchResponse.OfferResponse;



@FeignClient(name = "ndc-duffel-apiserver", url = "${ndc.duffel.api.endpoint}",
    configuration = {NDCDuffelFeignClientConfiguration.class})
public interface NDCDuffelServiceProxyClient {

  @PostMapping("/air/offer_requests")
  OfferResponse search(@RequestBody OfferRequest offerRequest);
    

}
