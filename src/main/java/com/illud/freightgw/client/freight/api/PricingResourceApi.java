/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.PricingDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-18T18:17:25.495+05:30[Asia/Calcutta]")

@Api(value = "PricingResource", description = "the PricingResource API")
public interface PricingResourceApi {

    @ApiOperation(value = "createPricing", nickname = "createPricingUsingPOST", notes = "", response = PricingDTO.class, tags={ "pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PricingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pricings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PricingDTO> createPricingUsingPOST(@ApiParam(value = "pricingDTO" ,required=true )  @Valid @RequestBody PricingDTO pricingDTO);


    @ApiOperation(value = "deletePricing", nickname = "deletePricingUsingDELETE", notes = "", tags={ "pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/pricings/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePricingUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllPricings", nickname = "getAllPricingsUsingGET", notes = "", response = PricingDTO.class, responseContainer = "List", tags={ "pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PricingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pricings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<PricingDTO>> getAllPricingsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getPricing", nickname = "getPricingUsingGET", notes = "", response = PricingDTO.class, tags={ "pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PricingDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pricings/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<PricingDTO> getPricingUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchPricings", nickname = "searchPricingsUsingGET", notes = "", response = PricingDTO.class, responseContainer = "List", tags={ "pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PricingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/pricings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<PricingDTO>> searchPricingsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updatePricing", nickname = "updatePricingUsingPUT", notes = "", response = PricingDTO.class, tags={ "pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PricingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pricings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<PricingDTO> updatePricingUsingPUT(@ApiParam(value = "pricingDTO" ,required=true )  @Valid @RequestBody PricingDTO pricingDTO);

}
