# Instrucciones para trabajar con el repositorio

### 1. Inicializar el repositorio

Para iniciar un nuevo repositorio, utiliza el siguiente comando:

```bash
git init
```

---

### 2. Agregar archivos al staging

Para agregar todos los archivos al área de preparación (staging area), usa el siguiente comando:

```bash
git add .
```

---

### 3. Verificar el estado de los archivos

Puedes verificar el estado de los archivos (modificados, añadidos, etc.) con:

```bash
git status
```

---

### 4. Realizar un commit

Realiza un commit con un mensaje que describa los cambios realizados. Es recomendable usar un mensaje claro para no olvidar el propósito del commit:

```bash
git commit -m "Descripción del cambio o subida"
```

---

### 5. Subir cambios al repositorio remoto

Sube los cambios al repositorio remoto en la rama actual utilizando:

```bash
git push origin nombre-de-la-rama
```

---

### 6. Crear una nueva rama

Para crear una nueva rama, usa el siguiente comando:

```bash
git branch nombre-de-la-rama
```

---

### 7. Ver la rama actual

Para ver en qué rama te encuentras actualmente, usa:

```bash
git branch
```

---

### 8. Cambiar entre ramas

Para cambiar a otra rama, utiliza:

```bash
git checkout nombre-de-la-rama
```

---

### 9. Crear y cambiar a una nueva rama

Para crear una nueva rama y moverte automáticamente a ella, utiliza:

```bash
git checkout -b nombre-de-la-rama
```

---

### 10. Fusionar ramas

Para fusionar una rama en la rama actual, primero asegúrate de estar en la rama a la que quieres fusionar los cambios:

```bash
git checkout nombre-de-la-rama-destino
```

Luego, fusiona la rama de origen:

```bash
git merge nombre-de-la-rama-origen
```

Si hay conflictos, resuélvelos manualmente y después sube los cambios:

```bash
git push origin nombre-de-la-rama-destino
```

---

### 11. Eliminar una rama

Para eliminar una rama, asegúrate de **no estar en la rama que deseas eliminar**. Primero, cambia a otra rama:

```bash
git checkout otra-rama
```

Luego, elimina la rama localmente:

```bash
git branch -d nombre-de-la-rama
```

Finalmente, elimina la rama del repositorio remoto:

```bash
git push origin --delete nombre-de-la-rama
```

