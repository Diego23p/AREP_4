# Taller de Arquitecturas de Servidores de Aplicaciones, Meta protocolos de objetos, Patrón IoC, Reflexión

Servidor web que soporta múltiples solicutudes, retorna archivos solicitados en el path construido únicamente con Java y librerias de red (Sin frameworks como Spark o Spring).
Basa su funcionamiento en anotaciones(patrón IoC), inyección de dependencias y reflexión.

## Inicialización

Herramientas requeridas para ejecutar el programa

### prerrequisitos

#### Java

Es una plataforma necesaria para que Maven ejecute, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> java -version

java version "1.8.0_101"
Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
Java HotSpot(TM) Client VM (build 25.101-b13, mixed mode)
```

#### Maven

La estructura está estandalizada con Maven, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> mvn -v

Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-24T13:41:47-05:00)
Maven home: C:\apache-maven-3.6.0\bin\..
Java version: 1.8.0_201, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_201\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

#### Git

Se usará el sistema de control de versiones Git, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> git --version

git version 2.21.0.windows.1
```

## Instalación

Para descargar localmente el repositorio se utiliza el comando como sigue:
```
> git clone https://github.com/Diego23p/AREP_4.git
```

Para compilar el proyecto usando Maven:
```
> mvn package
```

## Ejecutando el Programa

Para ejecutar el programa localmente haciendo uso de Heroku, se necesita desde la línea de comandos:
```
> java -cp target/classes co.edu.escuelaing.sparkd.microspring.MicroSpringBoot co.edu.escuelaing.sparkd.microspring.componenttests.HelloController
```
Luego de ejecutar el servicio, se pueden solicitar recursos por medio del mismo, agregando al path las siguientes opciones:

* ```/Apps/hello```

* ```/Apps/pi```

* ```/Apps/webapp```

Y para la solicitud del recurso estático:

* ```/index.html```

# Autores

- [Diego Alejandro Puerto Gómez](https://github.com/Diego23p)

# Licencia

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
