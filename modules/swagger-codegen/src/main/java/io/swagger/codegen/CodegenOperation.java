package io.swagger.codegen;

import io.swagger.models.ExternalDocs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CodegenOperation {
    public final List<CodegenProperty> responseHeaders = new ArrayList<CodegenProperty>();
    public Boolean hasConsumes, hasProduces, hasParams, returnTypeIsPrimitive,
            returnSimpleType, subresourceOperation, isMapContainer, isListContainer,
            hasMore = Boolean.TRUE, isMultipart, isResponseBinary = Boolean.FALSE;
    public String path, operationId, returnType, httpMethod, returnBaseType,
            returnContainer, summary, notes, baseName, defaultResponse;
    public List<Map<String, String>> consumes, produces;
    public CodegenParameter bodyParam;
    public List<CodegenParameter> allParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> bodyParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> pathParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> queryParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> headerParams = new ArrayList<CodegenParameter>();
    public List<CodegenParameter> formParams = new ArrayList<CodegenParameter>();
    public List<CodegenSecurity> authMethods;
    public List<String> tags;
    public List<CodegenResponse> responses = new ArrayList<CodegenResponse>();
    public Set<String> imports = new HashSet<String>();
    public List<Map<String, String>> examples;
    public ExternalDocs externalDocs;
    public Map<String, Object> vendorExtensions;

    private boolean nonempty(List<CodegenParameter> params)
    {
        return params != null && params.size() > 0;
    }
    public boolean getHasBodyParam() {
        return nonempty(bodyParams);
    }
    public boolean getHasQueryParams() {
        return nonempty(bodyParams);
    }
    public boolean getHasHeaderParams() {
        return nonempty(bodyParams);
    }
    public boolean getHasPathParams() {
        return nonempty(bodyParams);
    }

    // legacy support
    public String nickname;
}
