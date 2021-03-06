package org.codnect.firesnap.mapping;

import org.codnect.firesnap.annotation.AccessType;
import org.codnect.xreflect.XClass;
import org.codnect.xreflect.XProperty;

/**
 * Created by Burak Koken on 23.9.2018.
 *
 * @author Burak Koken
 */
public interface PropertyData {

    String getPropertyName();

    XProperty getProperty();

    XClass getPropertyClass();

    String getTypeName();

    AccessType getDefaultAccess();

    String getClassOrElementName();

    XClass getClassOrElement();

    XClass getDeclaringClass();

}
