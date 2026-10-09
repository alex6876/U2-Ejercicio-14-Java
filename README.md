# 🏦 Simulación de Cajero Automático y Cuenta Bancaria (POO en Java)

Este proyecto es una aplicación en Java que modela las operaciones básicas de un cajero automático en su interacción con una cuenta bancaria. Pone en práctica el encapsulamiento estricto, la validación de montos límite y la mutación controlada del saldo en memoria.

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema se divide en 3 clases principales:

*   **`CuentaBancaria`**: Entidad que representa la cuenta del cliente y protege la integridad de sus fondos.
    *   **Atributos encapsulados (`private`):** `cbu`, `titulares` y `saldo`.
    *   **Métodos principales:**
        *   `debitar(double monto)`: Valida las condiciones de extracción y descuenta el monto si es correcto.
        *   `acreditar(double monto)`: Suma el dinero al saldo en memoria si el valor ingresado es mayor a cero.
        *   Métodos de lectura (*getters*) para consultar la información protegida.
*   **`CajeroAutomatico`**: Actúa como la interfaz del usuario que procesa las solicitudes de transacción.
    *   **Atributos:** Almacena la referencia de la `cuentaActiva`.
    *   **Métodos:** `extraerDinero(double monto)` y `depositarDinero(double monto)`, invocan las operaciones de la cuenta e informan por pantalla el resultado.
*   **`Main`**: Instancia la cuenta con un saldo inicial de $100.000, la conecta al cajero automático y ejecuta una serie de extracciones y depósitos para verificar el control de límites.

---

## ⚙️ Reglas de Negocio y Control de Transacciones

El método `debitar` protege la cuenta mediante tres validaciones antes de modificar el `saldo`:

1. **Monto válido:** Debe ser estrictamente positivo (`monto > 0`).
2. **Saldo suficiente:** No se puede extraer más del saldo disponible (`monto <= saldo`).
3. **Límite diario por operación:** No se permite debitar más de $50.000 por transacción (`monto <= 50000`).

Si alguna de estas tres condiciones falla, el débito se rechaza (retornando `false`) y el cajero notifica que la operación no pudo realizarse.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente historial de transacciones:

```text
Saldo inicial: $100000.0
Dinero extraido
Dinero insuficiente
Dinero depositado: $5000.0
Saldo final: $85000.0
