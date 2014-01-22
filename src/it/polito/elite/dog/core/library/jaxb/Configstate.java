/*
 * Dog - Core
 * 
 * Copyright (c) 2009-2013 Dario Bonino and Luigi De Russis
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.24 at 03:00:12 PM CEST 
//

package it.polito.elite.dog.core.library.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * <p>
 * Java class for configstate complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="configstate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statevalues" type="{http://elite.polito.it/dogHomeConfiguration}statevalues"/>
 *       &lt;/sequence>
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configstate", propOrder = { "statevalues" })
public class Configstate
{
	
	@XmlElement(required = true)
	@JsonIgnore
	protected Statevalues statevalues;
	
	// workaround for properly serialize a JSON message: it avoids a "redundant"
	// array
	@XmlTransient
	@JsonProperty("statevalues")
	protected List<Statevalue> statevalueList;
	
	@XmlAttribute(name = "class", required = true)
	@JsonProperty("class")
	protected String clazz;
	
	/**
	 * Gets the value of the statevalues property.
	 * 
	 * @return possible object is {@link Statevalues }
	 * 
	 */
	public Statevalues getStatevalues()
	{
		return statevalues;
	}
	
	/**
	 * Sets the value of the statevalues property.
	 * 
	 * @param value
	 *            allowed object is {@link Statevalues }
	 * 
	 */
	public void setStatevalues(Statevalues value)
	{
		this.statevalues = value;
	}
	
	/**
	 * Gets the value of the clazz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClazz()
	{
		return clazz;
	}
	
	/**
	 * Sets the value of the clazz property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClazz(String value)
	{
		this.clazz = value;
	}
	
	/**
	 * Workaround for properly serialize a JSON message; it is not considered in
	 * XML
	 * 
	 * @return the statevalueList
	 */
	public List<Statevalue> getStatevalueList()
	{
		return statevalueList;
	}
	
	/**
	 * Workaround for properly serialize a JSON message; it is not considered in
	 * XML
	 * 
	 * @param statevalueList
	 *            the statevalueList to set
	 */
	public void setStatevalueList(List<Statevalue> statevalueList)
	{
		this.statevalueList = statevalueList;
	}
	
}
