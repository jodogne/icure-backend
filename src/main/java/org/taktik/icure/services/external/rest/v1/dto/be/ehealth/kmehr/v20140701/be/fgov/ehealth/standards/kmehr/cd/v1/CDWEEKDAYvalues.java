/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.05 à 11:48:17 AM CET 
//


package org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20140701.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-WEEKDAYvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-WEEKDAYvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sunday"/>
 *     &lt;enumeration value="monday"/>
 *     &lt;enumeration value="tuesday"/>
 *     &lt;enumeration value="wednesday"/>
 *     &lt;enumeration value="thursday"/>
 *     &lt;enumeration value="friday"/>
 *     &lt;enumeration value="saturday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-WEEKDAYvalues")
@XmlEnum
public enum CDWEEKDAYvalues {

    @XmlEnumValue("sunday")
    SUNDAY("sunday"),
    @XmlEnumValue("monday")
    MONDAY("monday"),
    @XmlEnumValue("tuesday")
    TUESDAY("tuesday"),
    @XmlEnumValue("wednesday")
    WEDNESDAY("wednesday"),
    @XmlEnumValue("thursday")
    THURSDAY("thursday"),
    @XmlEnumValue("friday")
    FRIDAY("friday"),
    @XmlEnumValue("saturday")
    SATURDAY("saturday");
    private final String value;

    CDWEEKDAYvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDWEEKDAYvalues fromValue(String v) {
        for (CDWEEKDAYvalues c: CDWEEKDAYvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
