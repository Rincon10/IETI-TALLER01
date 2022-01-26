# IETI-TALLER01 

## Prerrequisitos

-   [Git](https://git-scm.com/downloads) - Version Control System
-   [Maven](https://maven.apache.org/download.cgi) - Dependency Management
-   [Java 8](https://www.java.com/download/ie_manual.jsp) - Development Environment
-   [Spring-Boot](https://spring.io/projects/spring-boot) - Framework Web
-   [Intellij Idea](https://www.jetbrains.com/es-es/idea/download/) (Opcional)

## Instrucciones de ejecución local
1. Desde cmd clonar el repositorio

```git
https://github.com/Rincon10/IETI-TALLER01.git
```

2. Ubicarse en la carpeta IETI-TALLER01 y borraremos todas las dependencias y modulos que puedan existir de los binarios del proyecto.
```maven
mvn clean install
```

3. Realizamos la compilación del proyecto
```maven
mvn package
```

4. Ejecutamos el proyecto
```maven
mvn spring-boot:run
```

<img style="height: 450px" src="" alt="img">