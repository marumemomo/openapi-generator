package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import org.threeten.bp.LocalDate;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.springframework.core.io.Resource;
import org.openapitools.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
public class FakeApiController implements FakeApi {

    private final FakeApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public FakeApiController(FakeApiDelegate delegate) {
        this.delegate = delegate;
    }
    public ResponseEntity<Boolean> fakeOuterBooleanSerialize(@ApiParam(value = "Input boolean as post body"  )  @Valid @RequestBody Boolean body) {
        return delegate.fakeOuterBooleanSerialize(body);
    }

    public ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(@ApiParam(value = "Input composite as post body"  )  @Valid @RequestBody OuterComposite outerComposite) {
        return delegate.fakeOuterCompositeSerialize(outerComposite);
    }

    public ResponseEntity<BigDecimal> fakeOuterNumberSerialize(@ApiParam(value = "Input number as post body"  )  @Valid @RequestBody BigDecimal body) {
        return delegate.fakeOuterNumberSerialize(body);
    }

    public ResponseEntity<String> fakeOuterStringSerialize(@ApiParam(value = "Input string as post body"  )  @Valid @RequestBody String body) {
        return delegate.fakeOuterStringSerialize(body);
    }

    public ResponseEntity<Void> testBodyWithQueryParams(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return delegate.testBodyWithQueryParams(query, user);
    }

    public ResponseEntity<Client> testClientModel(@ApiParam(value = "client model" ,required=true )  @Valid @RequestBody Client client) {
        return delegate.testClientModel(client);
    }

    public ResponseEntity<Void> testEndpointParameters(@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="number", required=true)  BigDecimal number,@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="double", required=true)  Double _double,@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="pattern_without_delimiter", required=true)  String patternWithoutDelimiter,@ApiParam(value = "None", required=true, defaultValue="null") @RequestParam(value="byte", required=true)  byte[] _byte,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="integer", required=false)  Integer integer,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="int32", required=false)  Integer int32,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="int64", required=false)  Long int64,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="float", required=false)  Float _float,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="string", required=false)  String string,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile binary,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="date", required=false)  LocalDate date,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="dateTime", required=false)  OffsetDateTime dateTime,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="password", required=false)  String password,@ApiParam(value = "None", defaultValue="null") @RequestParam(value="callback", required=false)  String paramCallback) {
        return delegate.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
    }

    public ResponseEntity<Void> testEnumParameters(@ApiParam(value = "Header parameter enum test (string array)" , allowableValues=">, $") @RequestHeader(value="enum_header_string_array", required=false) List<String> enumHeaderStringArray,@ApiParam(value = "Header parameter enum test (string)" , allowableValues="_abc, -efg, (xyz)", defaultValue="-efg") @RequestHeader(value="enum_header_string", required=false) String enumHeaderString,@ApiParam(value = "Query parameter enum test (string array)", allowableValues = ">, $") @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,@ApiParam(value = "Query parameter enum test (string)", allowableValues = "_abc, -efg, (xyz)", defaultValue = "-efg") @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue="-efg") String enumQueryString,@ApiParam(value = "Query parameter enum test (double)", allowableValues = "1, -2") @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger,@ApiParam(value = "Query parameter enum test (double)", allowableValues = "1.1, -1.2") @Valid @RequestParam(value = "enum_query_double", required = false) Double enumQueryDouble,@ApiParam(value = "Form parameter enum test (string array)", allowableValues=">, $", defaultValue="$") @RequestParam(value="enum_form_string_array", required=false)  List<String> enumFormStringArray,@ApiParam(value = "Form parameter enum test (string)", allowableValues="_abc, -efg, (xyz)", defaultValue="-efg") @RequestParam(value="enum_form_string", required=false)  String enumFormString) {
        return delegate.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
    }

    public ResponseEntity<Void> testInlineAdditionalProperties(@ApiParam(value = "request body" ,required=true )  @Valid @RequestBody Map<String, String> requestBody) {
        return delegate.testInlineAdditionalProperties(requestBody);
    }

    public ResponseEntity<Void> testJsonFormData(@ApiParam(value = "field1", required=true, defaultValue="null") @RequestParam(value="param", required=true)  String param,@ApiParam(value = "field2", required=true, defaultValue="null") @RequestParam(value="param2", required=true)  String param2) {
        return delegate.testJsonFormData(param, param2);
    }

}
