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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Column">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Member" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Storage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccessModifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}AccessModifier" />
 *       &lt;attribute name="Modifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}MemberModifier" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DbType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsDbGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CanBeNull" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UpdateCheck" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}UpdateCheck" />
 *       &lt;attribute name="IsDiscriminator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsDelayLoaded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AutoSync" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}AutoSync" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column")
public class Column {

    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Member")
    protected String member;
    @XmlAttribute(name = "Storage")
    protected String storage;
    @XmlAttribute(name = "AccessModifier")
    protected AccessModifier accessModifier;
    @XmlAttribute(name = "Modifier")
    protected MemberModifier modifier;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "DbType")
    protected String dbType;
    @XmlAttribute(name = "IsReadOnly")
    protected Boolean isReadOnly;
    @XmlAttribute(name = "IsPrimaryKey")
    protected Boolean isPrimaryKey;
    @XmlAttribute(name = "IsDbGenerated")
    protected Boolean isDbGenerated;
    @XmlAttribute(name = "CanBeNull")
    protected Boolean canBeNull;
    @XmlAttribute(name = "UpdateCheck")
    protected UpdateCheck updateCheck;
    @XmlAttribute(name = "IsDiscriminator")
    protected Boolean isDiscriminator;
    @XmlAttribute(name = "Expression")
    protected String expression;
    @XmlAttribute(name = "IsVersion")
    protected Boolean isVersion;
    @XmlAttribute(name = "IsDelayLoaded")
    protected Boolean isDelayLoaded;
    @XmlAttribute(name = "AutoSync")
    protected AutoSync autoSync;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMember(String value) {
        this.member = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Gets the value of the accessModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * Sets the value of the accessModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessModifier(AccessModifier value) {
        this.accessModifier = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link MemberModifier }
     *     
     */
    public MemberModifier getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberModifier }
     *     
     */
    public void setModifier(MemberModifier value) {
        this.modifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the dbType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * Sets the value of the dbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbType(String value) {
        this.dbType = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadOnly(Boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the isPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryKey() {
        return isPrimaryKey;
    }

    /**
     * Sets the value of the isPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryKey(Boolean value) {
        this.isPrimaryKey = value;
    }

    /**
     * Gets the value of the isDbGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDbGenerated() {
        return isDbGenerated;
    }

    /**
     * Sets the value of the isDbGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDbGenerated(Boolean value) {
        this.isDbGenerated = value;
    }

    /**
     * Gets the value of the canBeNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeNull() {
        return canBeNull;
    }

    /**
     * Sets the value of the canBeNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeNull(Boolean value) {
        this.canBeNull = value;
    }

    /**
     * Gets the value of the updateCheck property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCheck }
     *     
     */
    public UpdateCheck getUpdateCheck() {
        return updateCheck;
    }

    /**
     * Sets the value of the updateCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCheck }
     *     
     */
    public void setUpdateCheck(UpdateCheck value) {
        this.updateCheck = value;
    }

    /**
     * Gets the value of the isDiscriminator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscriminator() {
        return isDiscriminator;
    }

    /**
     * Sets the value of the isDiscriminator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscriminator(Boolean value) {
        this.isDiscriminator = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the isVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVersion() {
        return isVersion;
    }

    /**
     * Sets the value of the isVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVersion(Boolean value) {
        this.isVersion = value;
    }

    /**
     * Gets the value of the isDelayLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDelayLoaded() {
        return isDelayLoaded;
    }

    /**
     * Sets the value of the isDelayLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDelayLoaded(Boolean value) {
        this.isDelayLoaded = value;
    }

    /**
     * Gets the value of the autoSync property.
     * 
     * @return
     *     possible object is
     *     {@link AutoSync }
     *     
     */
    public AutoSync getAutoSync() {
        return autoSync;
    }

    /**
     * Sets the value of the autoSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoSync }
     *     
     */
    public void setAutoSync(AutoSync value) {
        this.autoSync = value;
    }

}
