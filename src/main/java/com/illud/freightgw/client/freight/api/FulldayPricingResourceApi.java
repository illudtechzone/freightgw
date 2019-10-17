/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.FulldayPricingDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-17T15:29:11.125+05:30[Asia/Calcutta]")

@Api(value = "FulldayPricingResource", description = "the FulldayPricingResource API")
public interface FulldayPricingResourceApi {

    @ApiOperation(value = "createFulldayPricing", nickname = "createFulldayPricingUsingPOST", notes = "", response = FulldayPricingDTO.class, tags={ "fullday-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FulldayPricingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/fullday-pricings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<FulldayPricingDTO> createFulldayPricingUsingPOST(@ApiParam(value = "fulldayPricingDTO" ,required=true )  @Valid @RequestBody FulldayPricingDTO fulldayPricingDTO);


    @ApiOperation(value = "deleteFulldayPricing", nickname = "deleteFulldayPricingUsingDELETE", notes = "", tags={ "fullday-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/fullday-pricings/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteFulldayPricingUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllFulldayPricings", nickname = "getAllFulldayPricingsUsingGET", notes = "", response = FulldayPricingDTO.class, responseContainer = "List", tags={ "fullday-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FulldayPricingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/fullday-pricings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<FulldayPricingDTO>> getAllFulldayPricingsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getFulldayPricing", nickname = "getFulldayPricingUsingGET", notes = "", response = FulldayPricingDTO.class, tags={ "fullday-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FulldayPricingDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/fullday-pricings/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<FulldayPricingDTO> getFulldayPricingUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchFulldayPricings", nickname = "searchFulldayPricingsUsingGET", notes = "", response = FulldayPricingDTO.class, responseContainer = "List", tags={ "fullday-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FulldayPricingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/fullday-pricings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<FulldayPricingDTO>> searchFulldayPricingsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateFulldayPricing", nickname = "updateFulldayPricingUsingPUT", notes = "", response = FulldayPricingDTO.class, tags={ "fullday-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FulldayPricingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/fullday-pricings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<FulldayPricingDTO> updateFulldayPricingUsingPUT(@ApiParam(value = "fulldayPricingDTO" ,required=true )  @Valid @RequestBody FulldayPricingDTO fulldayPricingDTO);

}
