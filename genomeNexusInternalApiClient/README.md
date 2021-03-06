# genomeNexusInternalApiClient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.genome_nexus.client</groupId>
    <artifactId>genomeNexusInternalApiClient</artifactId>
    <version>1.1.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.genome_nexus.client:genomeNexusInternalApiClient:1.1.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/genomeNexusInternalApiClient-1.1.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.genome_nexus.*;
import org.genome_nexus.auth.*;
import org.genome_nexus.client.*;
import org.genome_nexus.client.AnnotationSummaryControllerApi;

import java.io.File;
import java.util.*;

public class AnnotationSummaryControllerApiExample {

    public static void main(String[] args) {
        
        AnnotationSummaryControllerApi apiInstance = new AnnotationSummaryControllerApi();
        List<String> variants = Arrays.asList(new List<String>()); // List<String> | List of variants. For example [\"X:g.66937331T>A\",\"17:g.41242962_41242963insGA\"]
        String isoformOverrideSource = "isoformOverrideSource_example"; // String | Isoform override source. For example uniprot
        String projection = "ALL"; // String | Indicates whether to return summary for all transcripts or only for canonical transcript
        try {
            List<VariantAnnotationSummary> result = apiInstance.fetchVariantAnnotationPOST1(variants, isoformOverrideSource, projection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationSummaryControllerApi#fetchVariantAnnotationPOST1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://genomenexus.org*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnotationSummaryControllerApi* | [**fetchVariantAnnotationPOST1**](docs/AnnotationSummaryControllerApi.md#fetchVariantAnnotationPOST1) | **POST** /annotation/summary | Retrieves VEP annotation summary for the provided list of variants
*AnnotationSummaryControllerApi* | [**fetchVariantAnnotationSummaryGET**](docs/AnnotationSummaryControllerApi.md#fetchVariantAnnotationSummaryGET) | **GET** /annotation/summary/{variant} | Retrieves VEP annotation summary for the provided variant
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByGenomicLocationGET**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationGET) | **GET** /cancer_hotspots/genomic/{genomicLocation} | Retrieves hotspot annotations for a specific genomic location
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByGenomicLocationPOST**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByGenomicLocationPOST) | **POST** /cancer_hotspots/genomic | Retrieves hotspot annotations for the provided list of genomic locations
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByHgvsGET**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsGET) | **GET** /cancer_hotspots/hgvs/{variant} | Retrieves hotspot annotations for a specific variant
*CancerHotspotsControllerApi* | [**fetchHotspotAnnotationByHgvsPOST**](docs/CancerHotspotsControllerApi.md#fetchHotspotAnnotationByHgvsPOST) | **POST** /cancer_hotspots/hgvs | Retrieves hotspot annotations for the provided list of variants
*CrossReferenceControllerApi* | [**fetchGeneXrefsGET1**](docs/CrossReferenceControllerApi.md#fetchGeneXrefsGET1) | **GET** /xrefs/{accession} | Perform lookups of Ensembl identifiers and retrieve their external references in other databases
*IsoformOverrideControllerApi* | [**fetchAllIsoformOverridesGET**](docs/IsoformOverrideControllerApi.md#fetchAllIsoformOverridesGET) | **GET** /isoform_override/{source} | Gets the isoform override information for the specified source
*IsoformOverrideControllerApi* | [**fetchIsoformOverrideGET**](docs/IsoformOverrideControllerApi.md#fetchIsoformOverrideGET) | **GET** /isoform_override/{source}/{transcriptId} | Gets the isoform override information for the specified source and transcript id
*IsoformOverrideControllerApi* | [**fetchIsoformOverridePOST**](docs/IsoformOverrideControllerApi.md#fetchIsoformOverridePOST) | **POST** /isoform_override | Gets the isoform override information for the specified source and the list of transcript ids
*IsoformOverrideControllerApi* | [**fetchIsoformOverrideSourcesGET**](docs/IsoformOverrideControllerApi.md#fetchIsoformOverrideSourcesGET) | **GET** /isoform_override/sources | Gets a list of available isoform override data sources
*MutationAssessorControllerApi* | [**fetchMutationAssessorAnnotationGET**](docs/MutationAssessorControllerApi.md#fetchMutationAssessorAnnotationGET) | **GET** /mutation_assessor/{variant} | Retrieves mutation assessor information for the provided list of variants
*MutationAssessorControllerApi* | [**postMutationAssessorAnnotation**](docs/MutationAssessorControllerApi.md#postMutationAssessorAnnotation) | **POST** /mutation_assessor | Retrieves mutation assessor information for the provided list of variants


## Documentation for Models

 - [AggregatedHotspots](docs/AggregatedHotspots.md)
 - [GeneXref](docs/GeneXref.md)
 - [GenomicLocation](docs/GenomicLocation.md)
 - [Hotspot](docs/Hotspot.md)
 - [IntegerRange](docs/IntegerRange.md)
 - [IsoformOverride](docs/IsoformOverride.md)
 - [MutationAssessor](docs/MutationAssessor.md)
 - [TranscriptConsequenceSummary](docs/TranscriptConsequenceSummary.md)
 - [VariantAnnotationSummary](docs/VariantAnnotationSummary.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



