//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.29 at 07:49:17 PM EET 
//


package by.it.drachyova.jd02_09.TaskC;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Rooms" type="{http://drachyova.it.by/jd02_09/Hotel}Rooms"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "stars",
        "address",
        "rooms"
})
@XmlRootElement(name = "Hotel")
public class Hotel {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Stars", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stars;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Rooms", required = true)
    protected Rooms rooms;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the stars property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getStars() {
        return stars;
    }

    /**
     * Sets the value of the stars property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setStars(BigInteger value) {
        this.stars = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the rooms property.
     *
     * @return possible object is
     * {@link Rooms }
     */
    public Rooms getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     *
     * @param value allowed object is
     *              {@link Rooms }
     */
    public void setRooms(Rooms value) {
        this.rooms = value;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Hotel \"" + name + "\"" + " " + stars + " stars " + "address: " + address + rooms;
    }
}