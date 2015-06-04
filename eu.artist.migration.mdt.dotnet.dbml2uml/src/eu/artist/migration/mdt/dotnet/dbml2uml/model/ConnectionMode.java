/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.02 at 02:42:29 PM CEST 
//


package eu.artist.migration.mdt.dotnet.dbml2uml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ConnectionString"/>
 *     &lt;enumeration value="AppSettings"/>
 *     &lt;enumeration value="WebSettings"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionMode")
@XmlEnum
public enum ConnectionMode {

    @XmlEnumValue("ConnectionString")
    CONNECTION_STRING("ConnectionString"),
    @XmlEnumValue("AppSettings")
    APP_SETTINGS("AppSettings"),
    @XmlEnumValue("WebSettings")
    WEB_SETTINGS("WebSettings");
    private final String value;

    ConnectionMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionMode fromValue(String v) {
        for (ConnectionMode c: ConnectionMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}