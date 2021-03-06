package io.swagger.mock.model;

import java.util.List;
import java.util.Map;

public class MockTransferObject {

	private long id;
	private String operationId;
	private String httpStatusCode;
	private String url;
	private String method;
	private String inputObjectType;
	private String outputObjectType;
	private String input;
	private String output;
	private List<MockKeyValue> availableParams;
	private Map<String, APIResponse> responseType;
	private String excludeList;

	public Map<String, APIResponse> getResponseType() {
		return responseType;
	}

	public void setResponseType(Map<String, APIResponse> responseType) {
		this.responseType = responseType;
	}

	public String getExcludeList() {
		return excludeList;
	}

	public void setExcludeList(String excludeList) {
		this.excludeList = excludeList;
	}

	private Map<String, String> httpStatusMap;

	public MockTransferObject(long id, String operationId, String input, String output) {
		this.id = id;
		this.operationId = operationId;
		this.input = input;
		this.output = output;
	}

	public Map<String, String> getHttpStatusMap() {
		return httpStatusMap;
	}

	public void setHttpStatusMap(Map<String, String> httpStatusMap) {
		this.httpStatusMap = httpStatusMap;
	}

	public MockTransferObject() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<MockKeyValue> getAvailableParams() {
		return availableParams;
	}

	public void setAvailableParams(List<MockKeyValue> availableParams) {
		this.availableParams = availableParams;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getInputObjectType() {
		return inputObjectType;
	}

	public void setInputObjectType(String inputObjectType) {
		this.inputObjectType = inputObjectType;
	}

	public String getOutputObjectType() {
		return outputObjectType;
	}

	public void setOutputObjectType(String outputObjectType) {
		this.outputObjectType = outputObjectType;
	}

	@Override
	public String toString() {
		return "MockTransferObject [id=" + id + ", operationId=" + operationId + ", httpStatusCode=" + httpStatusCode
				+ ", url=" + url + ", method=" + method + ", inputObjectType=" + inputObjectType + ", outputObjectType="
				+ outputObjectType + ", input=" + input + ", output=" + output + ", availableParams=" + availableParams
				+ ", excludeList=" + excludeList + ", httpStatusMap=" + httpStatusMap + "]";
	}

}
