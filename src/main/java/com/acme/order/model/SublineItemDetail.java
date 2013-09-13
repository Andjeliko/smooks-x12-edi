/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.acme.order.model;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.math.BigDecimal;    
import org.milyn.javabean.decoders.BigDecimalDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class SublineItemDetail implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String elementName;
    private String relationshipCode;
    private BigDecimal quantity;
    private BigDecimalDecoder quantityEncoder;
    private String unitOfMeasure;
    private String productIdQualifier;
    private String productId;

    public SublineItemDetail() {
        
        quantityEncoder = new BigDecimalDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(elementName != null) {
            nodeWriter.write(delimiters.escape(elementName.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(relationshipCode != null) {
            nodeWriter.write(delimiters.escape(relationshipCode.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(quantity != null) {
            nodeWriter.write(delimiters.escape(quantityEncoder.encode(quantity)));
        }
        nodeWriter.write(delimiters.getField());
        if(unitOfMeasure != null) {
            nodeWriter.write(delimiters.escape(unitOfMeasure.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(productIdQualifier != null) {
            nodeWriter.write(delimiters.escape(productIdQualifier.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(productId != null) {
            nodeWriter.write(delimiters.escape(productId.toString()));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getElementName() {
        return elementName;
    }

    public SublineItemDetail setElementName(String elementName) {
        this.elementName = elementName;  return this;
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public SublineItemDetail setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;  return this;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public SublineItemDetail setQuantity(BigDecimal quantity) {
        this.quantity = quantity;  return this;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public SublineItemDetail setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;  return this;
    }

    public String getProductIdQualifier() {
        return productIdQualifier;
    }

    public SublineItemDetail setProductIdQualifier(String productIdQualifier) {
        this.productIdQualifier = productIdQualifier;  return this;
    }

    public String getProductId() {
        return productId;
    }

    public SublineItemDetail setProductId(String productId) {
        this.productId = productId;  return this;
    }
}