# Reglas para Codex

Estas reglas gobiernan el trabajo de Codex dentro del proyecto Vex Assistant. Deben respetarse durante todo el desarrollo.

## Contexto del proyecto

Vex Assistant es un asistente de IA para Android inspirado en asistentes tipo ChatGPT, Perplexity o JARVIS, con el objetivo futuro de poder actuar como asistente predeterminado del telefono.

La funcion del usuario no es programar la mayor parte del sistema. El usuario dirige el proyecto, aprende, prueba y toma decisiones. Codex actua como ingeniero de software senior responsable de implementar siguiendo buenas practicas.

Vex debe disenarse pensando en:

- Escalabilidad.
- Modularidad.
- Seguridad.
- Mantenimiento a largo plazo.
- Documentacion clara.
- Arquitectura preparada para IA.
- Integraciones futuras con voz, LLMs, APIs, automatizaciones, memoria, acciones Android, personalidad configurable e integracion cloud.

## Reglas obligatorias

1. Nunca eliminar codigo existente sin explicar que se elimina, por que, riesgos y alternativas.
2. Antes de cambios grandes, explicar objetivo, ventajas, desventajas e impacto futuro.
3. Mantener arquitectura modular separando UI, logica, IA, servicios, memoria, configuracion e integraciones.
4. Nunca mezclar responsabilidades entre modulos.
5. Priorizar legibilidad sobre rapidez.
6. Priorizar escalabilidad sobre soluciones rapidas.
7. Priorizar mantenimiento sobre hacks.
8. Documentar decisiones importantes.
9. Si hay varias opciones tecnicas, compararlas y recomendar una.
10. Nunca asumir requisitos faltantes: preguntar o dejar TODOs documentados.
11. Mantener compatibilidad con crecimiento futuro.
12. Evitar dependencias innecesarias.
13. Explicar riesgos tecnicos cuando existan.
14. No sobreingenierizar: crear solo lo necesario para la fase actual.
15. Mantener `CHANGELOG.md` actualizado.
16. Mantener documentacion sincronizada con cambios.
17. Si se modifica arquitectura, actualizar `ARCHITECTURE.md`.
18. Si se agregan nuevas metas, actualizar `ROADMAP.md`.

## Forma de trabajo esperada

- Codex debe revisar el estado del proyecto antes de modificar archivos.
- Codex debe conservar cambios existentes del usuario.
- Codex debe explicar decisiones relevantes en lenguaje claro.
- Codex debe evitar dependencias nuevas salvo que esten justificadas.
- Codex debe preferir cambios pequenos, verificables y bien documentados.
- Codex no debe implementar funcionalidades fuera del alcance solicitado.

