/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.DriverDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-24T09:57:01.751+05:30[Asia/Calcutta]")

@Api(value = "DriverResource", description = "the DriverResource API")
public interface DriverResourceApi {

    @ApiOperation(value = "createDriver", nickname = "createDriverUsingPOST", notes = "", response = DriverDTO.class, tags={ "driver-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DriverDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/drivers",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DriverDTO> createDriverUsingPOST(@ApiParam(value = "driverDTO" ,required=true )  @Valid @RequestBody DriverDTO driverDTO);


    @ApiOperation(value = "createdriverIfnotExist", nickname = "createdriverIfnotExistUsingPOST", notes = "", response = DriverDTO.class, tags={ "driver-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DriverDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/create/driver",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DriverDTO> createdriverIfnotExistUsingPOST(@ApiParam(value = "driverDTO" ,required=true )  @Valid @RequestBody DriverDTO driverDTO);


    @ApiOperation(value = "deleteDriver", nickname = "deleteDriverUsingDELETE", notes = "", tags={ "driver-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/drivers/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDriverUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllDrivers", nickname = "getAllDriversUsingGET", notes = "", response = DriverDTO.class, responseContainer = "List", tags={ "driver-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DriverDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/drivers",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DriverDTO>> getAllDriversUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getDriver", nickname = "getDriverUsingGET", notes = "", response = DriverDTO.class, tags={ "driver-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DriverDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/drivers/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DriverDTO> getDriverUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchDrivers", nickname = "searchDriversUsingGET", notes = "", response = DriverDTO.class, responseContainer = "List", tags={ "driver-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DriverDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/drivers",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DriverDTO>> searchDriversUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateDriver", nickname = "updateDriverUsingPUT", notes = "", response = DriverDTO.class, tags={ "driver-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DriverDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/drivers",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<DriverDTO> updateDriverUsingPUT(@ApiParam(value = "driverDTO" ,required=true )  @Valid @RequestBody DriverDTO driverDTO);

}
