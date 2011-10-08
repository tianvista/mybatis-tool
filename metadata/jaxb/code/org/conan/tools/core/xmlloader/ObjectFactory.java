//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.08 at 03:53:08 ���� CST 
//


package org.conan.tools.core.xmlloader;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.conan.tools.core.xmlloader package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Module_QNAME = new QName("", "module");
    private final static QName _Model_QNAME = new QName("", "model");
    private final static QName _FilePath_QNAME = new QName("", "filePath");
    private final static QName _Prop_QNAME = new QName("", "prop");
    private final static QName _Finder_QNAME = new QName("", "finder");
    private final static QName _Table_QNAME = new QName("", "table");
    private final static QName _Bookmooch_QNAME = new QName("", "bookmooch");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _Project_QNAME = new QName("", "project");
    private final static QName _Sql_QNAME = new QName("", "sql");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Modules_QNAME = new QName("", "modules");
    private final static QName _Null_QNAME = new QName("", "null");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.conan.tools.core.xmlloader
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModelType }
     * 
     */
    public ModelType createModelType() {
        return new ModelType();
    }

    /**
     * Create an instance of {@link FinderType }
     * 
     */
    public FinderType createFinderType() {
        return new FinderType();
    }

    /**
     * Create an instance of {@link ModuleType }
     * 
     */
    public ModuleType createModuleType() {
        return new ModuleType();
    }

    /**
     * Create an instance of {@link PropType }
     * 
     */
    public PropType createPropType() {
        return new PropType();
    }

    /**
     * Create an instance of {@link BookmoochType }
     * 
     */
    public BookmoochType createBookmoochType() {
        return new BookmoochType();
    }

    /**
     * Create an instance of {@link ModulesType }
     * 
     */
    public ModulesType createModulesType() {
        return new ModulesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "module")
    public JAXBElement<ModuleType> createModule(ModuleType value) {
        return new JAXBElement<ModuleType>(_Module_QNAME, ModuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "model")
    public JAXBElement<ModelType> createModel(ModelType value) {
        return new JAXBElement<ModelType>(_Model_QNAME, ModelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filePath")
    public JAXBElement<String> createFilePath(String value) {
        return new JAXBElement<String>(_FilePath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "prop")
    public JAXBElement<PropType> createProp(PropType value) {
        return new JAXBElement<PropType>(_Prop_QNAME, PropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "finder")
    public JAXBElement<FinderType> createFinder(FinderType value) {
        return new JAXBElement<FinderType>(_Finder_QNAME, FinderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "table")
    public JAXBElement<String> createTable(String value) {
        return new JAXBElement<String>(_Table_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookmoochType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bookmooch")
    public JAXBElement<BookmoochType> createBookmooch(BookmoochType value) {
        return new JAXBElement<BookmoochType>(_Bookmooch_QNAME, BookmoochType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    public JAXBElement<TypeSType> createType(TypeSType value) {
        return new JAXBElement<TypeSType>(_Type_QNAME, TypeSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "project")
    public JAXBElement<String> createProject(String value) {
        return new JAXBElement<String>(_Project_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sql")
    public JAXBElement<String> createSql(String value) {
        return new JAXBElement<String>(_Sql_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modules")
    public JAXBElement<ModulesType> createModules(ModulesType value) {
        return new JAXBElement<ModulesType>(_Modules_QNAME, ModulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "null")
    public JAXBElement<Boolean> createNull(Boolean value) {
        return new JAXBElement<Boolean>(_Null_QNAME, Boolean.class, null, value);
    }

}
