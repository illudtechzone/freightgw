/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.CustomerStatus;
import com.illud.freightgw.client.freight.model.QuotationDTO;
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




@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-28T11:33:41.604+05:30[Asia/Calcutta]")



@Api(value = "CommandResource", description = "the CommandResource API")
public interface CommandResourceApi {

    @ApiOperation(value = "sendQuatation", nickname = "sendQuatationUsingPOST", notes = "", tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/sendQuatation/{taskId}",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> sendQuatationUsingPOST(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId,@ApiParam(value = "response" ,required=true )  @Valid @RequestBody QuotationDTO quotationDTO);


    @ApiOperation(value = "status", nickname = "statusUsingPOST", notes = "", tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer/status/{taskId}",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> statusUsingPOST(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId,@ApiParam(value = "customerStatus" ,required=true )  @Valid @RequestBody CustomerStatus customerStatus);

}
