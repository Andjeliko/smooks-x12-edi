/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.acme.order.model;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class CarrierDetail implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String typeCode;
    private String standardCarrierAlphaCode;
    private String routing;
    private String routingNumberQualifier;
    private String referenceNumber;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(typeCode != null) {
            nodeWriter.write(delimiters.escape(typeCode.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(standardCarrierAlphaCode != null) {
            nodeWriter.write(delimiters.escape(standardCarrierAlphaCode.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(routing != null) {
            nodeWriter.write(delimiters.escape(routing.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(routingNumberQualifier != null) {
            nodeWriter.write(delimiters.escape(routingNumberQualifier.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(referenceNumber != null) {
            nodeWriter.write(delimiters.escape(referenceNumber.toString()));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public CarrierDetail setTypeCode(String typeCode) {
        this.typeCode = typeCode;  return this;
    }

    public String getStandardCarrierAlphaCode() {
        return standardCarrierAlphaCode;
    }

    public CarrierDetail setStandardCarrierAlphaCode(String standardCarrierAlphaCode) {
        this.standardCarrierAlphaCode = standardCarrierAlphaCode;  return this;
    }

    public String getRouting() {
        return routing;
    }

    public CarrierDetail setRouting(String routing) {
        this.routing = routing;  return this;
    }

    public String getRoutingNumberQualifier() {
        return routingNumberQualifier;
    }

    public CarrierDetail setRoutingNumberQualifier(String routingNumberQualifier) {
        this.routingNumberQualifier = routingNumberQualifier;  return this;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public CarrierDetail setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;  return this;
    }
}