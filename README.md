java-ee7-maven-archetype
========================

Maven Archetype to work with Java EE7, JPA, JSF, EJB 3.x, Primefaces

1. IMPORTANT! Changing these properties in the pom.xml file located in the root of the project.

<group.id.project>com.ascuntar</group.id.project>
<artifact.id.project>test</artifact.id.project>
<version.project>1.0</version.project>
<name.project>test</name.project>

2. Configure the datasource in any server that supports Java EE7 eg Wildfly8, Glassfish4. 
   This should be done in the persistence.xml file located in,

   module-dm/src/main/resources/META-INF/persistence.xml
