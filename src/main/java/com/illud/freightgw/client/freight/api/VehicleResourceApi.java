/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.VehicleDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-25T15:31:07.496+05:30[Asia/Kolkata]")

@Api(value = "VehicleResource", description = "the VehicleResource API")
public interface VehicleResourceApi {

    @ApiOperation(value = "createVehicle", nickname = "createVehicleUsingPOST", notes = "", response = VehicleDTO.class, tags={ "vehicle-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicles",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VehicleDTO> createVehicleUsingPOST(@ApiParam(value = "vehicleDTO" ,required=true )  @Valid @RequestBody VehicleDTO vehicleDTO);


    @ApiOperation(value = "deleteVehicle", nickname = "deleteVehicleUsingDELETE", notes = "", tags={ "vehicle-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/vehicles/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteVehicleUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllVehicles", nickname = "getAllVehiclesUsingGET", notes = "", response = VehicleDTO.class, responseContainer = "List", tags={ "vehicle-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicles",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<VehicleDTO>> getAllVehiclesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getVehicle", nickname = "getVehicleUsingGET", notes = "", response = VehicleDTO.class, tags={ "vehicle-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicles/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<VehicleDTO> getVehicleUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchVehicles", nickname = "searchVehiclesUsingGET", notes = "", response = VehicleDTO.class, responseContainer = "List", tags={ "vehicle-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/vehicles",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<VehicleDTO>> searchVehiclesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateVehicle", nickname = "updateVehicleUsingPUT", notes = "", response = VehicleDTO.class, tags={ "vehicle-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicles",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<VehicleDTO> updateVehicleUsingPUT(@ApiParam(value = "vehicleDTO" ,required=true )  @Valid @RequestBody VehicleDTO vehicleDTO);

}
