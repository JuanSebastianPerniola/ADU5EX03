# ADU5EX03: Transformación de JSON a XML usando MongoDB

## Descripción del Proyecto
Este proyecto tiene como objetivo demostrar el proceso de manipulación de datos almacenados en una base de datos MongoDB. 
Los datos, que inicialmente están en formato JSON, son iterados, procesados y convertidos al formato XML.

La aplicación está diseñada para ejecutarse en un entorno de desarrollo Java, utilizando las dependencias necesarias para conectar con MongoDB, realizar el procesamiento de datos y manejar los logs del sistema.

## Tecnologías y Herramientas
- **Lenguaje**: Java 17
- **Base de datos**: MongoDB (sin credenciales, acceso local)
- **Editor de código**: Visual Studio Code
- **Sistema Operativo**: Windows 10

## Dependencias Utilizadas
El archivo `pom.xml` incluye las siguientes dependencias necesarias:

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.mongodb</groupId>
        <artifactId>mongodb-driver-sync</artifactId>
        <version>4.10.2</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>2.0.7</version>
    </dependency>
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.4.11</version>
    </dependency>
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20231013</version>
    </dependency>
</dependencies>
```

## Estructura del Proyecto
1. **Conexión a la Base de Datos**:
   Se establece una conexión con MongoDB utilizando el controlador `mongodb-driver-sync`. La URL de conexión es `mongodb://localhost:27017`.

2. **Iteración de Datos**:
   Los documentos almacenados en formato JSON dentro de una colección de MongoDB son iterados usando un cursor proporcionado por el driver de MongoDB.

3. **Transformación a XML**:
   Los datos JSON se convierten al formato XML usando bibliotecas Java. Se utiliza la librería `org.json` para facilitar esta conversión.

## Instrucciones de Ejecución
1. Asegúrate de que tienes una instancia de MongoDB corriendo en `localhost:27017`.
2. Configura una base de datos y una colección con datos JSON.
3. Compila y ejecuta el proyecto desde Visual Studio Code.
4. Los datos JSON de la base de datos serán convertidos a XML y mostrados en la consola.