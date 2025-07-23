Este proyecto es una API simple desarrollada con Java Spring Boot, basada en el patrón de diseño Strategy.

Temática:
------------
El dominio del ejercicio está basado en bandas de rock argentino.

Estructura del proyecto:
----------------------------
1. **IBandaStrategy.java**: Interface que define el contrato del patrón Strategy.
2. **SodaStereoStrategy, LosRedondosStrategy, LaRengaStrategy**: Implementaciones concretas que describen a cada banda.
3. **BandaType.java**: Enum que encapsula cada implementación del Strategy Pattern.
4. **BandaController.java**: Controlador REST con un endpoint para obtener la información de una banda.

Cómo usar:
---------------
- Levantar el proyecto Spring Boot (por defecto en localhost:8080).
- Acceder al endpoint con una de las bandas disponibles:

```
GET http://localhost:8080/api/bandas/SODA_STEREO
GET http://localhost:8080/api/bandas/REDONDOS
GET http://localhost:8080/api/bandas/LA_RENGA
```

Respuesta:
-----------
Devuelve una descripción de la banda seleccionada.

Objetivo:
-------------
Este proyecto sirve como ejemplo práctico para entender el uso del patrón de diseño Strategy junto a Java y Spring Boot en una API REST.

Ideal para subir a GitHub como muestra de conocimiento sobre patrones y arquitectura básica de APIs.
