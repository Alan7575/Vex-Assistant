# Roadmap

Este roadmap organiza el crecimiento de Vex Assistant por fases. Cada fase debe cerrarse con documentacion actualizada, changelog y validacion basica de decisiones tecnicas.

## Fase 1 - Base proyecto

- Crear estructura inicial del repositorio.
- Definir reglas de trabajo para Codex.
- Documentar arquitectura inicial.
- Crear roadmap.
- Preparar changelog profesional.
- No implementar funcionalidades en esta fase.

## Fase 2 - UI Android

- Crear proyecto Android base.
- Definir navegacion inicial.
- Implementar pantalla de conversacion.
- Crear estados visuales para entrada, respuesta, carga y error.
- Mantener la UI desacoplada del motor IA.

## Fase 3 - IA

- Definir interfaz del motor IA.
- Crear sistema inicial de prompts.
- Evaluar proveedor LLM inicial.
- Implementar flujo basico de pregunta y respuesta.
- Documentar riesgos de privacidad y costos.

## Fase 4 - Voz

- Evaluar APIs Android de speech-to-text y text-to-speech.
- Implementar entrada por voz experimental.
- Implementar salida por voz opcional.
- Definir permisos y estados de escucha.
- Documentar limitaciones de activacion continua.

## Fase 5 - Acciones Android

- Definir capa de acciones Android.
- Implementar acciones simples y seguras mediante intents.
- Agregar confirmaciones para acciones sensibles.
- Separar permisos por tipo de accion.
- Documentar restricciones del sistema operativo.

## Fase 6 - Memoria

- Definir tipos de memoria: temporal, conversacional y persistente.
- Implementar preferencias basicas.
- Evaluar almacenamiento local seguro.
- Agregar controles para ver, editar o borrar datos guardados.
- Documentar politicas de retencion.

## Fase 7 - Optimizacion

- Mejorar rendimiento de UI y respuestas.
- Revisar consumo de bateria, red y memoria.
- Agregar pruebas mas amplias.
- Mejorar manejo de errores y estados offline.
- Revisar seguridad antes de integraciones mas profundas.

## Fase 8 - Asistente predeterminado Android

- Investigar requisitos actuales de Android para asistentes predeterminados.
- Evaluar integracion con APIs oficiales disponibles.
- Implementar compatibilidad progresiva si es viable.
- Documentar limitaciones por version de Android y fabricante.
- Preparar estrategia de distribucion y permisos.

