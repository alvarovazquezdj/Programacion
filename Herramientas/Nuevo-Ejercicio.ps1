
# ==========================================
# CREAR NUEVO EJERCICIO DE PROGRAMACION
# ==========================================

# Comprobar que estamos dentro de un boletin
if ((Get-Location).Path -notmatch 'Boletin-\d+$') {
    Write-Host "ERROR: Ejecuta este script desde una carpeta Boletin." -ForegroundColor Red
    exit
}

# Buscar el numero mas alto de ejercicio
$carpetas = Get-ChildItem -Directory -Name
$maximo = 0

foreach ($carpeta in $carpetas) {
    if ($carpeta -match '^Ejercicio-(\d+)$') {
        $numero = [int]$Matches[1]

        if ($numero -gt $maximo) {
            $maximo = $numero
        }
    }
}

# Calcular el siguiente ejercicio
$siguiente = $maximo + 1
$nuevo = "Ejercicio-" + $siguiente.ToString("00")

# Crear la carpeta
New-Item -ItemType Directory -Name $nuevo | Out-Null

# Preparar la estructura basica de Java
$contenido = @"
public class Main {

    public static void main(String[] args) {

        

    }

}
"@

# Crear Main.java
$archivo = Join-Path $nuevo "Main.java"
[System.IO.File]::WriteAllText(
    $archivo,
    $contenido,
    [System.Text.UTF8Encoding]::new($false)
)

# Mostrar resultado
Write-Host ""
Write-Host "====================================" -ForegroundColor Green
Write-Host " EJERCICIO CREADO CORRECTAMENTE" -ForegroundColor Green
Write-Host "====================================" -ForegroundColor Green
Write-Host "Carpeta: $nuevo"
Write-Host "Archivo: $archivo"
Write-Host ""