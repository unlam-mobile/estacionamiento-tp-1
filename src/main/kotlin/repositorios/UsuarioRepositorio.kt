package repositorios

import entidades.Usuario

class UsuarioRepositorio {
    val usuarios = mutableListOf<Usuario>()

    fun agregar(usuario: Usuario) {
        if(existe(usuario.nombre)){
            //TODO fallar
        }
        usuarios.add(usuario)
    }

    fun eliminar(usuario: Usuario) {
        usuarios.remove(usuario)
    }

    fun existe(nombreUsuario: String): Boolean {
        //TODO: Completar
    }

    fun iniciar(nombreUsuario: String, password: String): List<Usuario> {
        //TODO: Completar
    }
}