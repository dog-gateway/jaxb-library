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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Java class for notificationFunctionality complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="notificationFunctionality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notifications" type="{http://elite.polito.it/dogHomeConfiguration}notifications"/>
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
@XmlType(name = "notificationFunctionality", propOrder = { "notifications" })
public class NotificationFunctionality implements Cloneable
{
	
	@XmlElement(required = true)
	@JsonIgnore
	protected Notifications notifications;
	
	// workaround for properly serialize a JSON message: it avoids a "redundant"
	// array
	@XmlTransient
	@JsonProperty("notifications")
	protected List<Confignotification> notificationList;
	
	@XmlAttribute(name = "class", required = true)
	@JsonProperty("class")
	protected String clazz;
	
	/**
	 * Creates a new {@code NotificationFunctionality} instance.
	 * 
	 */
	public NotificationFunctionality()
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
	}
	
	/**
	 * Creates a new {@code NotificationFunctionality} instance by deeply
	 * copying a given {@code NotificationFunctionality} instance.
	 * 
	 * 
	 * @param o
	 *            The instance to copy.
	 * @throws NullPointerException
	 *             if {@code o} is {@code null}.
	 */
	public NotificationFunctionality(final NotificationFunctionality o)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		super();
		if (o == null)
		{
			throw new NullPointerException("Cannot create a copy of 'NotificationFunctionality' from 'null'.");
		}
		// CClassInfo: it.polito.elite.dog.core.library.jaxb.Notifications
		this.notifications = ((o.notifications == null) ? null : ((o.getNotifications() == null) ? null : o
				.getNotifications().clone()));
		// CBuiltinLeafInfo: java.lang.String
		this.clazz = ((o.clazz == null) ? null : o.getClazz());
		// 'Confignotification' collection.
		if (o.notificationList != null)
		{
			copyNotifications(o.getNotificationList(), this.getNotificationList());
		}
	}
	
	/**
	 * Gets the value of the notifications property.
	 * 
	 * @return possible object is {@link Notifications }
	 * 
	 */
	public Notifications getNotifications()
	{
		return notifications;
	}
	
	/**
	 * Sets the value of the notifications property.
	 * 
	 * @param value
	 *            allowed object is {@link Notifications }
	 * 
	 */
	public void setNotifications(Notifications value)
	{
		this.notifications = value;
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
	 * @return the notificationList
	 */
	public List<Confignotification> getNotificationList()
	{
		if (notificationList == null)
		{
			notificationList = new ArrayList<Confignotification>();
		}
		return this.notificationList;
	}
	
	/**
	 * Workaround for properly serialize a JSON message; it is not considered in
	 * XML
	 * 
	 * @param notificationList
	 *            the notificationList to set
	 */
	public void setNotificationList(List<Confignotification> notificationList)
	{
		this.notificationList = notificationList;
	}
	
	/**
	 * Copies all values of property {@code NotificationList} deeply.
	 * 
	 * @param source
	 *            The source to copy from.
	 * @param target
	 *            The target to copy {@code source} to.
	 * @throws NullPointerException
	 *             if {@code target} is {@code null}.
	 */
	private static void copyNotifications(final List<Confignotification> source, final List<Confignotification> target)
	{
		// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
		if ((source != null) && (!source.isEmpty()))
		{
			for (final Iterator<?> it = source.iterator(); it.hasNext();)
			{
				final Object next = it.next();
				if (next instanceof Confignotification)
				{
					// CClassInfo:
					// it.polito.elite.dog.core.library.jaxb.Confignotification
					target.add(((Confignotification) next).clone());
					continue;
				}
				// Please report this at
				// https://apps.sourceforge.net/mantisbt/ccxjc/
				throw new AssertionError(
						(("Unexpected instance '" + next) + "' for property 'NotificationList' of class 'it.polito.elite.dog.core.library.jaxb.NotificationFunctionality'."));
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
	public NotificationFunctionality clone()
	{
		try
		{
			{
				// CC-XJC Version 2.0.1 Build 2012-03-02T12:09:12+0000
				final NotificationFunctionality clone = ((NotificationFunctionality) super.clone());
				// CClassInfo:
				// it.polito.elite.dog.core.library.jaxb.Notifications
				clone.notifications = ((this.notifications == null) ? null : ((this.getNotifications() == null) ? null
						: this.getNotifications().clone()));
				// CBuiltinLeafInfo: java.lang.String
				clone.clazz = ((this.clazz == null) ? null : this.getClazz());
				// 'Confignotification' collection.
				if (this.notificationList != null)
				{
					clone.notificationList = null;
					copyNotifications(this.getNotificationList(), clone.getNotificationList());
				}
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
