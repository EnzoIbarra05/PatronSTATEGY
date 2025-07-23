🎸🎧 Rock Argentino Strategy API 🎧🎸
=====================================

Este proyecto es una API REST 🎯 desarrollada con **Java + Spring Boot**, basada en el **patrón de diseño Strategy** 🧠. ¡Ideal para aprender conceptos sólidos de arquitectura mientras explorás el mundo del rock argentino! 🇦🇷🔥

## 🧠 ¿Qué es el Patrón Strategy?

El **Patrón Strategy** es un patrón de comportamiento que permite definir **una familia de algoritmos**, encapsular cada uno y hacerlos **intercambiables**. Esto permite que el algoritmo varíe independientemente de los clientes que lo usan.

> En términos simples: permite cambiar el comportamiento de un objeto en tiempo de ejecución, sin modificar su estructura.

En este proyecto, cada banda representa una estrategia distinta que implementa una interfaz común.

---

🎵 Temática
------------
La API representa diferentes **bandas de rock argentino**, permitiéndote consultar información sobre cada una usando una estrategia distinta. Cada banda tiene su propia lógica implementada mediante el patrón `Strategy`.


📁 Estructura del proyecto
----------------------------------------
1. **`IBandaStrategy.java`**: Interface que define el contrato base del patrón Strategy 🎭.
2. **`SodaStereoStrategy`, `LosRedondosStrategy`, `LaRengaStrategy`**: Implementaciones concretas de bandas 🎤.
3. **`BandaType.java`**: Enum que contiene las distintas estrategias disponibles 🎸.
4. **`BandaController.java`**: Controlador REST con endpoints para acceder a cada banda vía HTTP 🌐.

🚀 Cómo usar la API
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
Devuelve una descripción de la banda seleccionada. EJ: 
Soda Stereo: Formada en 1982, ícono del rock latinoamericano, liderada por Gustavo Cerati.

Objetivo:
-------------
Este proyecto sirve como ejemplo práctico para entender el uso del patrón de diseño Strategy junto a Java y Spring Boot en una API REST.

Ideal para subir a GitHub como muestra de conocimiento sobre patrones y arquitectura básica de APIs.

🎥 Video de ayuda
---------------------

Si querés entender mejor el patrón Strategy aplicado en Java, te recomiendo este video explicativo:

[![Ver en YouTube](https://img.youtube.com/vi/14Fxj5f0iaI/0.jpg)](https://www.youtube.com/watch?v=14Fxj5f0iaI&list=PLi_K_8CU7k80q16PgYYaVazBCeBEPngLq&index=4)

🔗 [Mirá el video en YouTube](https://www.youtube.com/watch?v=14Fxj5f0iaI&list=PLi_K_8CU7k80q16PgYYaVazBCeBEPngLq&index=4)
