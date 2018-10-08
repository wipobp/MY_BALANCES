package com.bank.td.api;


import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-10-08T15:26:39.857Z")

@Api(value = "balances", description = "the balances API")
public interface BalancesApi {

    @ApiOperation(value = "Get Account Balance", notes = "Get data from core banking system", response = Object.class, tags={ "1_0_0", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account Balance", response = Object.class) })
    @RequestMapping(value = "/balances",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Object> 10(@ApiParam(value = "Account ID", required = true) @RequestParam(value = "accountId", required = true) String accountId



) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
