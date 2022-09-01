package repositorios

import entidades.Ticket

class TicketRepositorio {
    val tickets = mutableListOf<Ticket>()

    fun agregar(ticket: Ticket) {
        tickets.add(ticket)
    }

    fun eliminar(ticket: Ticket) {
        tickets.remove(ticket)
    }

    fun obtenerPorId(id: Long): Ticket {
        //TODO: Completar
    }

    //TODO verificar que datos conviene usar para buscar
    fun buscar(): List<Ticket> {
        //TODO: Completar
    }
}