//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.19 at 04:54:59 PM CDT 
//

package org.jboss.security.xacml.core.model.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for VariableReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}ExpressionType">
 *       &lt;attribute name="VariableId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableReferenceType")
public class VariableReferenceType extends ExpressionType
{

   @XmlAttribute(name = "VariableId", required = true)
   protected String variableId;

   /**
    * Gets the value of the variableId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getVariableId()
   {
      return variableId;
   }

   /**
    * Sets the value of the variableId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setVariableId(String value)
   {
      this.variableId = value;
   }

}
