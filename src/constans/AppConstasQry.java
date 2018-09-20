
package constans;

/**
 *
 * @author JairoDev
 */
public class AppConstasQry {
    
    public static String qryMaxFecha="select coalesce(MAX(id_fecha), 0)+1 id from fecha";
    public static String qryMaxProveedor="select coalesce(MAX(id_proveedor), 0)+1 id from proveedor";
    public static String qryMaxCliente="select coalesce(MAX(id_cliente), 0)+1 id from cliente";
    public static String qryMaxEmpleado="select coalesce(MAX(id_empleado), 0)+1 id from empleado";
    public static String qryMaxProducto="select coalesce(MAX(id_producto), 0)+1 id from producto";
    public static String qryMaxUsuario="select coalesce(MAX(id_usuario), 0)+1 id from usuario";
}
