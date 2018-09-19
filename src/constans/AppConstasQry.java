
package constans;

/**
 *
 * @author JairoDev
 */
public class AppConstasQry {
    
    public static String qryMaxFecha="select coalesce(MAX(id_fecha), 0)+1 id from fecha";
    public static String qryMaxProveedor="select coalesce(MAX(id_proveedor), 0)+1 id from proveedor";
    public static String qryMaxCliente="select coalesce(MAX(id_cliente), 0)+1 id from cliente";
}
