package model;



public class Consultas {

	//LISTAR
	public static final String MOSTRAR_USUARIOS="SELECT * FROM usuarios";
	public static final String MOSTRAR_CUENTAS="SELECT * FROM cuentas";
	public static final String MOSTRAR_MOVIMIENTOS="SELECT * FROM movimientos WHERE idCuenta=?";

	
	//BUSQUEDA
	public static final String BUSCAR_USUARIO="SELECT * FROM usuarios WHERE idUsuario=?";
	public static final String BUSCAR_CUENTA="SELECT * FROM cuentas WHERE idCuenta=?";
	
	//BORRADO
	public static final String BORRAR_USUARIO="DELETE FROM usuarios WHERE idUsuario=?";
	public static final String BORRAR_CUENTA="DELETE FROM cuentas WHERE idCuenta=?";
	
	//INSERCION
	public static final String INSERTAR_USUARIO="INSERT INTO usuarios (nombre, apellidos, contrasenna) VALUES (?,?,?)";
	public static final String INSERTAR_CUENTA="INSERT INTO cuentas(idUsuario, saldo) VALUES (?,?)";
	
	//Editar
	public static final String EDITAR_USUARIO="UPDATE usuarios SET nombre = ?, apellidos = ?, contrasenna = ? WHERE usuarios.idUsuario = ?";
	public static final String EDITAR_CUENTA="UPDATE `cuentas` SET `saldo` = '?' WHERE `cuentas`.`idCuenta` = ? and `cuentas`.`idUsuario` = ?";
	
}
