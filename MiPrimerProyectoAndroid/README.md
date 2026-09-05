# Mi primer proyecto Android

Proyecto de ejemplo que cumple con los 3 requisitos pedidos:

## 1. Soporte de 4 idiomas
- `res/values/strings.xml` → Español (por defecto)
- `res/values-en/strings.xml` → Inglés
- `res/values-fr/strings.xml` → Francés
- `res/values-de/strings.xml` → Alemán

Android elige automáticamente el `strings.xml` correcto según el idioma del
sistema del dispositivo. Para probarlo: cambia el idioma del emulador/celular
en Ajustes > Sistema > Idiomas.

## 2. Fondo con nine-patch
- `res/drawable/bg_cielo.9.png` es la imagen de fondo en formato nine-patch.
- La franja negra en el **borde superior** define las columnas que se
  pueden estirar horizontalmente (todo el cielo, evitando la columna donde
  está el marcianito).
- La franja negra en el **borde izquierdo** define las filas que se pueden
  estirar verticalmente (solo el cielo puro, por encima del robot y las
  nubes).
- Resultado: cuando el fondo se redimensiona a distintos anchos/altos de
  pantalla, el cielo se estira, pero **el marcianito Android y las nubes
  mantienen siempre su tamaño y proporción original**, sin deformarse.

Si quieres editar el nine-patch a mano, ábrelo en Android Studio con el
editor "Draw 9-patch" (clic derecho sobre el archivo → Open in Editor).

## 3. Soporte a múltiples pantallas y orientaciones
- El layout `activity_main.xml` usa `ConstraintLayout` con posiciones en
  porcentaje (`layout_constraintVertical_bias`, etc.) en vez de posiciones
  fijas en dp, por lo que se adapta solo a cualquier tamaño/orientación.
- `res/values/dimens.xml` define tamaños de texto para celulares.
- `res/values-sw600dp/dimens.xml` define tamaños de texto más grandes para
  tablets (pantallas de ancho ≥ 600dp), igual que se ve en las capturas de
  ejemplo (tablet/TV con texto más grande).
- `android:configChanges` en el manifiesto evita que la Activity se
  destruya al rotar, para que la transición entre orientaciones sea fluida.

## Cómo abrir el proyecto
1. Abre Android Studio → **Open** → selecciona la carpeta
   `MiPrimerProyectoAndroid`.
2. Deja que Android Studio sincronice Gradle (puede pedirte generar el
   wrapper de Gradle si falta `gradlew`; acepta la sugerencia o usa
   *File > Sync Project with Gradle Files*).
3. Ejecuta la app en un emulador o dispositivo ( Run 'app').
4. Para probar los idiomas, cambia el idioma del sistema del emulador.
5. Para probar tamaños de pantalla, prueba con distintos AVDs (celular,
   tablet de 7", tablet de 10", TV) en modo vertical y horizontal.

## Estructura principal
```
app/src/main/
├── AndroidManifest.xml
├── java/com/fred/miprimerproyecto/MainActivity.java
└── res/
    ├── drawable/bg_cielo.9.png      (fondo nine-patch)
    ├── drawable/bg_button_entrar.xml
    ├── layout/activity_main.xml
    ├── values/strings.xml           (Español - default)
    ├── values-en/strings.xml        (Inglés)
    ├── values-fr/strings.xml        (Francés)
    ├── values-de/strings.xml        (Alemán)
    ├── values/dimens.xml            (celulares)
    └── values-sw600dp/dimens.xml    (tablets)
```
