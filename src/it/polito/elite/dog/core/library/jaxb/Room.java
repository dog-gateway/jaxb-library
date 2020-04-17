/*
 * Dog - Core
 * 
 * Copyright (c) 2009-2014 Dario Bonino and Luigi De Russis
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
// Generated on: 2014.02.15 at 03:00:00 PM CEST 
//

package it.polito.elite.dog.core.library.jaxb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Java class for room complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ceiling" type="{http://elite.polito.it/dogHomeConfiguration}ceiling"/>
 *         &lt;element name="floor" type="{http://elite.polito.it/dogHomeConfiguration}floor"/>
 *         &lt;element name="wall" type="{http://elite.polito.it/dogHomeConfiguration}wall" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "room", propOrder = { "description", "ceiling", "floor", "wall" })
public class Room implements Cloneable
{
	
	protected String description;
	@XmlElement(required = true)
	protected Ceiling ceiling;
	@XmlElement(required = true)
	protected Floor floor;
	@XmlElement(required = true)
	@JsonProperty("walls")
	protected List<Wall> wall;
	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	@XmlSchemaType(name = "ID")
	protected String id;
	@XmlAttribute(name = "class")
	@JsonProperty("class")
	protected String clazz;
	
	/**
	 * Creates a new {@code Room} instance.
	 * 
	 */
	public Room()
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
	}
	
	/**
	 * Creates a new {@code Room} instance by deeply copying a given
	 * {@code Room} instance.
	 * 
	 * 
	 * @param o
	 *            The instance to copy.
	 * @throws NullPointerException
	 *             if {@code o} is {@code null}.
	 */
	public Room(final Room o)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
		if (o == null)
		{
			throw new NullPointerException("Cannot create a copy of 'Room' from 'null'.");
		}
		// CBuiltinLeafInfo: java.lang.String
		this.description = ((o.description == null) ? null : o.getDescription());
		// CClassInfo: it.polito.elite.dog.core.library.jaxb.Ceiling
		this.ceiling = ((o.ceiling == null) ? null : ((o.getCeiling() == null) ? null : o.getCeiling().clone()));
		// CClassInfo: it.polito.elite.dog.core.library.jaxb.Floor
		this.floor = ((o.floor == null) ? null : ((o.getFloor() == null) ? null : o.getFloor().clone()));
		// 'Wall' collection.
		if (o.wall != null)
		{
			copyWall(o.getWall(), this.getWall());
		}
		// CBuiltinLeafInfo: java.lang.String
		this.id = ((o.id == null) ? null : o.getId());
		// CBuiltinLeafInfo: java.lang.String
		this.clazz = ((o.clazz == null) ? null : o.getClazz());
	}
	
	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value)
	{
		this.description = value;
	}
	
	/**
	 * Gets the value of the ceiling property.
	 * 
	 * @return possible object is {@link Ceiling }
	 * 
	 */
	public Ceiling getCeiling()
	{
		return ceiling;
	}
	
	/**
	 * Sets the value of the ceiling property.
	 * 
	 * @param value
	 *            allowed object is {@link Ceiling }
	 * 
	 */
	public void setCeiling(Ceiling value)
	{
		this.ceiling = value;
	}
	
	/**
	 * Gets the value of the floor property.
	 * 
	 * @return possible object is {@link Floor }
	 * 
	 */
	public Floor getFloor()
	{
		return floor;
	}
	
	/**
	 * Sets the value of the floor property.
	 * 
	 * @param value
	 *            allowed object is {@link Floor }
	 * 
	 */
	public void setFloor(Floor value)
	{
		this.floor = value;
	}
	
	/**
	 * Gets the value of the wall property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the wall property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getWall().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Wall }
	 * 
	 * 
	 */
	public List<Wall> getWall()
	{
		if (wall == null)
		{
			wall = new ArrayList<Wall>();
		}
		return this.wall;
	}
	
	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId()
	{
		return id;
	}
	
	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value)
	{
		this.id = value;
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
	 * Copies all values of property {@code Wall} deeply.
	 * 
	 * @param source
	 *            The source to copy from.
	 * @param target
	 *            The target to copy {@code source} to.
	 * @throws NullPointerException
	 *             if {@code target} is {@code null}.
	 */
	private static void copyWall(final List<Wall> source, final List<Wall> target)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		if ((source != null) && (!source.isEmpty()))
		{
			for (final Iterator<?> it = source.iterator(); it.hasNext();)
			{
				final Object next = it.next();
				if (next instanceof Wall)
				{
					// CClassInfo: it.polito.elite.dog.core.library.jaxb.Wall
					target.add(((Wall) next).clone());
					continue;
				}
				// Please report this at
				// https://apps.sourceforge.net/mantisbt/ccxjc/
				throw new AssertionError(
						(("Unexpected instance '" + next) + "' for property 'Wall' of class 'it.polito.elite.dog.core.library.jaxb.Room'."));
			}
		}
	}
	
	/**
	 * Creates and returns a deep copy of this object.
	 * 
	 * 
	 * @return A deep copy of this object.
	 */
	@Override
	public Room clone()
	{
		try
		{
			{
				// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
				final Room clone = ((Room) super.clone());
				// CBuiltinLeafInfo: java.lang.String
				clone.description = ((this.description == null) ? null : this.getDescription());
				// CClassInfo: it.polito.elite.dog.core.library.jaxb.Ceiling
				clone.ceiling = ((this.ceiling == null) ? null : ((this.getCeiling() == null) ? null : this
						.getCeiling().clone()));
				// CClassInfo: it.polito.elite.dog.core.library.jaxb.Floor
				clone.floor = ((this.floor == null) ? null : ((this.getFloor() == null) ? null : this.getFloor()
						.clone()));
				// 'Wall' collection.
				if (this.wall != null)
				{
					clone.wall = null;
					copyWall(this.getWall(), clone.getWall());
				}
				// CBuiltinLeafInfo: java.lang.String
				clone.id = ((this.id == null) ? null : this.getId());
				// CBuiltinLeafInfo: java.lang.String
				clone.clazz = ((this.clazz == null) ? null : this.getClazz());
				return clone;
			}
		}
		catch (CloneNotSupportedException e)
		{
			// Please report this at
			// https://apps.sourceforge.net/mantisbt/ccxjc/
			throw new AssertionError(e);
		}
	}
	
}
