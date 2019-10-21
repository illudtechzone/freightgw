/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.illud.freightgw.client.freight.api;

import com.illud.freightgw.client.freight.model.CompanyDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-21T11:23:33.684+05:30[Asia/Calcutta]")

@Api(value = "CompanyResource", description = "the CompanyResource API")
public interface CompanyResourceApi {

    @ApiOperation(value = "createCompanyIfNotExist", nickname = "createCompanyIfNotExistUsingPOST", notes = "", response = CompanyDTO.class, tags={ "company-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompanyDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/companyIfnotexist",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CompanyDTO> createCompanyIfNotExistUsingPOST(@ApiParam(value = "companyDTO" ,required=true )  @Valid @RequestBody CompanyDTO companyDTO);


    @ApiOperation(value = "createCompany", nickname = "createCompanyUsingPOST", notes = "", response = CompanyDTO.class, tags={ "company-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompanyDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/companies",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CompanyDTO> createCompanyUsingPOST(@ApiParam(value = "companyDTO" ,required=true )  @Valid @RequestBody CompanyDTO companyDTO);


    @ApiOperation(value = "deleteCompany", nickname = "deleteCompanyUsingDELETE", notes = "", tags={ "company-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/companies/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCompanyUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllCompanies", nickname = "getAllCompaniesUsingGET", notes = "", response = CompanyDTO.class, responseContainer = "List", tags={ "company-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompanyDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/companies",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CompanyDTO>> getAllCompaniesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getCompany", nickname = "getCompanyUsingGET", notes = "", response = CompanyDTO.class, tags={ "company-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompanyDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/companies/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CompanyDTO> getCompanyUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchCompanies", nickname = "searchCompaniesUsingGET", notes = "", response = CompanyDTO.class, responseContainer = "List", tags={ "company-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompanyDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/companies",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CompanyDTO>> searchCompaniesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateCompany", nickname = "updateCompanyUsingPUT", notes = "", response = CompanyDTO.class, tags={ "company-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CompanyDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/companies",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<CompanyDTO> updateCompanyUsingPUT(@ApiParam(value = "companyDTO" ,required=true )  @Valid @RequestBody CompanyDTO companyDTO);

}
