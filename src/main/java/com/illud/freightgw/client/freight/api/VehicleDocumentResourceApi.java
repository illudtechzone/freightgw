/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.VehicleDocumentDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-25T10:41:54.345+05:30[Asia/Calcutta]")

@Api(value = "VehicleDocumentResource", description = "the VehicleDocumentResource API")
public interface VehicleDocumentResourceApi {

    @ApiOperation(value = "createVehicleDocument", nickname = "createVehicleDocumentUsingPOST", notes = "", response = VehicleDocumentDTO.class, tags={ "vehicle-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDocumentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicle-documents",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VehicleDocumentDTO> createVehicleDocumentUsingPOST(@ApiParam(value = "vehicleDocumentDTO" ,required=true )  @Valid @RequestBody VehicleDocumentDTO vehicleDocumentDTO);


    @ApiOperation(value = "deleteVehicleDocument", nickname = "deleteVehicleDocumentUsingDELETE", notes = "", tags={ "vehicle-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/vehicle-documents/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteVehicleDocumentUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllVehicleDocuments", nickname = "getAllVehicleDocumentsUsingGET", notes = "", response = VehicleDocumentDTO.class, responseContainer = "List", tags={ "vehicle-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDocumentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicle-documents",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<VehicleDocumentDTO>> getAllVehicleDocumentsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getVehicleDocument", nickname = "getVehicleDocumentUsingGET", notes = "", response = VehicleDocumentDTO.class, tags={ "vehicle-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDocumentDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicle-documents/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<VehicleDocumentDTO> getVehicleDocumentUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchVehicleDocuments", nickname = "searchVehicleDocumentsUsingGET", notes = "", response = VehicleDocumentDTO.class, responseContainer = "List", tags={ "vehicle-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDocumentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/vehicle-documents",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<VehicleDocumentDTO>> searchVehicleDocumentsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateVehicleDocument", nickname = "updateVehicleDocumentUsingPUT", notes = "", response = VehicleDocumentDTO.class, tags={ "vehicle-document-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VehicleDocumentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/vehicle-documents",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<VehicleDocumentDTO> updateVehicleDocumentUsingPUT(@ApiParam(value = "vehicleDocumentDTO" ,required=true )  @Valid @RequestBody VehicleDocumentDTO vehicleDocumentDTO);

}
