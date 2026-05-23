# Vex Assistant

Vex Assistant es un proyecto de asistente de IA para Android inspirado en experiencias como ChatGPT, Perplexity y asistentes tipo JARVIS. El objetivo a largo plazo es construir un asistente modular, seguro y extensible que pueda evolucionar hasta integrarse profundamente con Android y, eventualmente, actuar como asistente predeterminado del telefono.

## Objetivos

- Crear una base solida para un asistente de IA moderno en Android.
- Separar claramente UI, logica, IA, voz, memoria, servicios e integraciones.
- Preparar el proyecto para integrar LLMs, APIs, automatizaciones y acciones Android.
- Mantener una arquitectura legible, documentada y facil de extender.
- Priorizar seguridad, privacidad y mantenimiento a largo plazo desde la primera fase.

## Estado actual

Version inicial del repositorio. Esta fase no implementa funcionalidades todavia; solo define estructura, reglas de trabajo, arquitectura inicial, roadmap y documentacion base.

## Tecnologias previstas

Estas tecnologias son candidatas iniciales y podran cambiar segun las decisiones tecnicas futuras:

- Android nativo con Kotlin.
- Jetpack Compose para UI declarativa.
- Arquitectura por capas con principios de Clean Architecture cuando el proyecto lo justifique.
- Coroutines y Flow para trabajo asincrono y estados reactivos.
- Inyeccion de dependencias ligera, evaluando Hilt/Koin cuando sea necesario.
- Integraciones futuras con LLMs locales o cloud.
- Almacenamiento local seguro para preferencias, memoria y configuracion.
- APIs Android para voz, accesibilidad, intents y acciones del sistema.

## Como empezar

1. Leer `RULES_FOR_CODEX.md` antes de pedir cambios tecnicos.
2. Revisar `ARCHITECTURE.md` para entender la separacion de responsabilidades.
3. Consultar `ROADMAP.md` para ubicar la fase actual.
4. Registrar cada cambio importante en `CHANGELOG.md`.
5. Antes de implementar una funcionalidad nueva, definir su objetivo, riesgos y alcance.

## Filosofia

Vex se construye con una idea simple: avanzar rapido no debe significar construir fragil. El proyecto prioriza legibilidad sobre velocidad, escalabilidad sobre atajos y mantenimiento sobre soluciones improvisadas.

La meta no es sobreingenierizar desde el inicio, sino dejar caminos claros para crecer. Cada modulo debe poder evolucionar sin obligar a reescribir el resto del sistema.

