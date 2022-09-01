package repositorios

import entidades.Cliente

class ClienteRepositorio {
    val clientes = mutableListOf<Cliente>()

    fun agregar(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun eliminar(cliente: Cliente) {
        clientes.remove(cliente)
    }

    fun obtenerPorId(id: Long): Cliente {
        //TODO: Completar
    }

    fun buscar(apellido: String, nombre: String): List<Cliente> {
        //TODO: Completar
    }
}