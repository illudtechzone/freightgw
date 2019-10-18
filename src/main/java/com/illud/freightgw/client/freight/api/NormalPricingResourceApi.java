/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.NormalPricingDTO;
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

@Api(value = "NormalPricingResource", description = "the NormalPricingResource API")
public interface NormalPricingResourceApi {

    @ApiOperation(value = "createNormalPricing", nickname = "createNormalPricingUsingPOST", notes = "", response = NormalPricingDTO.class, tags={ "normal-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NormalPricingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/normal-pricings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<NormalPricingDTO> createNormalPricingUsingPOST(@ApiParam(value = "normalPricingDTO" ,required=true )  @Valid @RequestBody NormalPricingDTO normalPricingDTO);


    @ApiOperation(value = "deleteNormalPricing", nickname = "deleteNormalPricingUsingDELETE", notes = "", tags={ "normal-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/normal-pricings/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteNormalPricingUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllNormalPricings", nickname = "getAllNormalPricingsUsingGET", notes = "", response = NormalPricingDTO.class, responseContainer = "List", tags={ "normal-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NormalPricingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/normal-pricings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<NormalPricingDTO>> getAllNormalPricingsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getNormalPricing", nickname = "getNormalPricingUsingGET", notes = "", response = NormalPricingDTO.class, tags={ "normal-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NormalPricingDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/normal-pricings/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<NormalPricingDTO> getNormalPricingUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchNormalPricings", nickname = "searchNormalPricingsUsingGET", notes = "", response = NormalPricingDTO.class, responseContainer = "List", tags={ "normal-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NormalPricingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/normal-pricings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<NormalPricingDTO>> searchNormalPricingsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateNormalPricing", nickname = "updateNormalPricingUsingPUT", notes = "", response = NormalPricingDTO.class, tags={ "normal-pricing-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NormalPricingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/normal-pricings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<NormalPricingDTO> updateNormalPricingUsingPUT(@ApiParam(value = "normalPricingDTO" ,required=true )  @Valid @RequestBody NormalPricingDTO normalPricingDTO);

}
