package com.dnastack.dos.registry.model;

import com.dnastack.dos.registry.execution.PageExecutionContext;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.util.List;

/**
 * Represents the data node page used to encapsulate the request to retrieve data nodes
 */
@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class DataObjectPage {

    @JsonProperty("page_number")
    private final int pageNumber;
    //pageSize can be reset
    @JsonProperty("page_size")
    private int pageSize;
//    @JsonProperty("node_ids")
//    private final List<String> nodeIds;
    @JsonProperty("dos_ids")
    private final List<String> dosIds;
//    @JsonProperty("node_name")
//    private final String nodeName;
//    @JsonProperty("node_meta")
//    private final Map<String, String> nodeMeta;
    @JsonProperty("dos_name")
    private final String dosName;
    @JsonProperty("dos_version")
    private final String dosVersion;
    @JsonProperty("dos_mime_type")
    private final String dosMimeType;
//    @JsonProperty("node_description")
//    private final String nodeDescription;
    @JsonProperty("dos_description")
    private final String dosDescription;
//    @JsonProperty("node_alias")
//    private final String nodeAlias;
    @JsonProperty("dos_alias")
    private final String dosAlias;
    @JsonProperty("dos_url")
    private final String dosUrl;
    @JsonProperty("dos_checksum")
    private final String dosChecksum;
    @JsonProperty("dos_date_created_from")
    private final DateTime dosDateCreatedFrom;
    @JsonProperty("dos_date_created_to")
    private final DateTime dosDateCreatedTo;
    @JsonProperty("dos_date_updated_from")
    private final DateTime dosDateUpdatedFrom;
    @JsonProperty("dos_date_updated_to")
    private final DateTime dosDateUpdatedTo;

    @JsonProperty("page_execution_context")
    private PageExecutionContext pageExecutionContext;

    @JsonCreator
    public DataObjectPage(
            @JsonProperty("page_number") int pageNumber,
            @JsonProperty("page_size") int pageSize,
            //@JsonProperty("node_ids") List<String> nodeIds,
            @JsonProperty("dos_ids") List<String> dosIds,
            //@JsonProperty("node_name") String nodeName,
            //@JsonProperty("node_meta") Map<String, String> nodeMeta,
            @JsonProperty("dos_name") String dosName,
            @JsonProperty("dos_version") String dosVersion,
            @JsonProperty("dos_mime_type") String dosMimeType,
            //@JsonProperty("node_description") String nodeDescription,
            @JsonProperty("dos_description") String dosDescription,
            //@JsonProperty("node_alias") String nodeAlias,
            @JsonProperty("dos_alias") String dosAlias,
            @JsonProperty("dos_url") String dosUrl,
            @JsonProperty("dos_checksum") String dosChecksum,
            @JsonProperty("dos_date_created_from") DateTime dosDateCreatedFrom,
            @JsonProperty("dos_date_created_to") DateTime dosDateCreatedTo,
            @JsonProperty("dos_date_updated_from") DateTime dosDateUpdatedFrom,
            @JsonProperty("dos_date_updated_to") DateTime dosDateUpdatedTo,
            @JsonProperty("page_execution_context") PageExecutionContext pageExecutionContext) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        //this.nodeIds = nodeIds;
        this.dosIds = dosIds;
        //this.nodeName = nodeName;
        //this.nodeMeta = nodeMeta;
        this.dosName = dosName;
        this.dosVersion = dosVersion;
        this.dosMimeType = dosMimeType;
        //this.nodeDescription = nodeDescription;
        this.dosDescription = dosDescription;
        //this.nodeAlias = nodeAlias;
        this.dosAlias = dosAlias;
        this.dosUrl = dosUrl;
        this.dosChecksum = dosChecksum;
        this.dosDateCreatedFrom = dosDateCreatedFrom;
        this.dosDateCreatedTo = dosDateCreatedTo;
        this.dosDateUpdatedFrom = dosDateUpdatedFrom;
        this.dosDateUpdatedTo = dosDateUpdatedTo;
        this.pageExecutionContext = pageExecutionContext;
    }

    @JsonIgnore
    public DataObjectPage next() {
        return new DataObjectPage(
                this.pageNumber + 1,
                this.pageSize,
                //this.nodeIds,
                this.dosIds,
                //this.nodeName,
                //this.nodeMeta,
                this.dosName,
                this.dosVersion,
                this.dosMimeType,
                //this.nodeDescription,
                this.dosDescription,
                //this.nodeAlias,
                this.dosAlias,
                this.dosUrl,
                this.dosChecksum,
                this.dosDateCreatedFrom,
                this.dosDateCreatedTo,
                this.dosDateUpdatedFrom,
                this.dosDateUpdatedTo,
                this.pageExecutionContext);
    }

}
