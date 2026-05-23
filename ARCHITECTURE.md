# Arquitectura Inicial

Este documento define la arquitectura base de Vex Assistant. La arquitectura debera actualizarse cada vez que se agreguen modulos relevantes, se cambien responsabilidades o se adopten decisiones tecnicas estructurales.

## Principios

- Separacion estricta de responsabilidades.
- Modulos pequenos, legibles y reemplazables.
- Seguridad y privacidad consideradas desde el diseno.
- Integraciones externas aisladas detras de interfaces.
- Documentacion sincronizada con el codigo.
- Evitar dependencias innecesarias durante fases tempranas.

## Capas principales

### UI Android

Responsable de mostrar la experiencia visual, recibir interacciones del usuario y representar estados. No debe contener logica de IA, acceso directo a APIs externas, persistencia compleja ni reglas de negocio.

Responsabilidades previstas:

- Pantallas de conversacion.
- Entrada de texto y, en el futuro, voz.
- Renderizado de respuestas.
- Estados de carga, error y permisos.
- Configuracion visible para el usuario.

### Motor IA

Modulo encargado de coordinar prompts, modelos, contexto, herramientas y respuestas. Debe mantenerse desacoplado de la UI y de proveedores concretos de LLM.

Responsabilidades previstas:

- Construccion de prompts.
- Orquestacion de conversaciones.
- Seleccion de proveedor de IA.
- Manejo de contexto.
- Validacion basica de respuestas antes de exponerlas a otros modulos.

### Voz

Modulo futuro para entrada y salida por voz. Debe aislar reconocimiento de voz, sintesis y procesamiento de audio.

Responsabilidades previstas:

- Speech-to-text.
- Text-to-speech.
- Estados de escucha.
- Permisos de microfono.
- Posible activacion por palabra clave, si Android y la seguridad lo permiten.

### Memoria

Modulo responsable de persistir informacion util de forma segura y controlada. La memoria debe ser explicita, auditable y configurable por el usuario.

Responsabilidades previstas:

- Preferencias del usuario.
- Datos de contexto persistente.
- Historial conversacional, si se decide habilitarlo.
- Politicas de retencion y borrado.
- Separacion entre memoria temporal y memoria persistente.

### Servicios

Capa para operaciones de apoyo que no pertenecen directamente a UI o IA.

Responsabilidades previstas:

- Red y clientes HTTP.
- Almacenamiento.
- Logs.
- Manejo de permisos.
- Configuracion de entorno.
- Observabilidad basica.

### Integraciones

Modulo destinado a conectar Vex con sistemas externos o internos de Android sin acoplar el nucleo del asistente.

Responsabilidades previstas:

- Proveedores LLM.
- APIs externas.
- Calendario, contactos u otros servicios autorizados.
- Automatizaciones.
- Herramientas cloud.

### Acciones Android

Modulo futuro para ejecutar acciones dentro del telefono con permisos claros y confirmaciones cuando sea necesario.

Responsabilidades previstas:

- Intents Android.
- Acciones del sistema.
- Interaccion con apps compatibles.
- Automatizaciones locales.
- Validacion de permisos y confirmaciones del usuario.

### Seguridad

La seguridad atraviesa toda la arquitectura. Ningun modulo debe asumir acceso ilimitado a datos, permisos o acciones sensibles.

Responsabilidades previstas:

- Gestion explicita de permisos.
- Proteccion de claves y tokens.
- Minimizacion de datos.
- Confirmacion antes de acciones sensibles.
- Separacion entre datos locales y cloud.
- Registro claro de riesgos tecnicos.

## Estructura inicial del repositorio

```text
Vex/
├── docs/
├── prompts/
├── architecture/
├── app/
├── tests/
├── README.md
├── ARCHITECTURE.md
├── ROADMAP.md
├── RULES_FOR_CODEX.md
└── CHANGELOG.md
```

## Decision inicial

La primera fase solo crea estructura y documentacion. No se implementan funcionalidades todavia para evitar decisiones prematuras sobre framework, proveedor de IA, almacenamiento o permisos Android antes de definir los requisitos minimos.

