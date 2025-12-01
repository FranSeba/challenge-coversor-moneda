# 💱 Conversor de Monedas - Challenge Java

![Java](https://img.shields.io/badge/Java-17%2B-orange) ![Status](https://img.shields.io/badge/Status-Finalizado-green) ![API](https://img.shields.io/badge/API-ExchangeRate-blue)

## 📖 Descripción del Proyecto

Este proyecto es parte de un desafío práctico de programación en **Java**, diseñado para consolidar conocimientos en el desarrollo de aplicaciones backend y consumo de APIs.

Java es un lenguaje robusto y versátil, utilizado en millones de dispositivos. Este desafío aprovecha esa potencia para resolver un problema cotidiano: **la conversión de divisas en tiempo real**.

El objetivo principal fue construir una aplicación que consuma datos actualizados de una API externa, procese respuestas en formato JSON y filtre las monedas de interés para el usuario.

## ⚙️ Funcionalidades

La aplicación funciona a través de una **interfaz de consola** interactiva que permite:

* **Menú de Opciones:** Selección intuitiva de pares de divisas.
* **Conversión en Tiempo Real:**
    * Dólar (USD) ➡️ Peso Argentino (ARS)
    * Peso Argentino (ARS) ➡️ Dólar (USD)
    * Dólar (USD) ➡️ Real Brasileño (BRL)
    * Real Brasileño (BRL) ➡️ Dólar (USD)
    * Peso Colombiano (COP) ↔️ Dólar (USD)
* **Validación de Datos:** Control de entradas para evitar errores si el usuario ingresa opciones incorrectas.

## 🛠️ Tecnologías y Herramientas

* **Java (JDK):** Lenguaje base del proyecto.
* **Gson:** Librería para el análisis y manipulación de JSON.
* **Exchange Rate API:** Servicio utilizado para obtener las tasas de cambio.
* **HttpClient:** Para realizar las peticiones HTTP a la web.

## 🚀 Cómo Ejecutar el Proyecto

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/FranSeba/challenge-coversor-moneda.git
    ```
2.  **Importar en IDE:**
    Abre el proyecto en IntelliJ IDEA o Eclipse.
3.  **Ejecutar:**
    Localiza la clase `Principal.java` y dale al botón de Run.

## 🧠 Aprendizajes

Durante la construcción de este conversor, se abordaron conceptos clave:
* Consumo de APIs Rest.
* Manipulación de objetos JSON.
* Lógica de programación estructurada y POO.
* Manejo de Excepciones (Try-Catch).

---
**Desarrollado por Franco Romay**