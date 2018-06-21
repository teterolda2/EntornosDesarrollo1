/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
/**
 *
 * @author alumno
 */
public class examen {
    

public class Cliente {

  public String nombre;

    /**
   * 
   * @element-type Pedidos
   */
  private Vector  myPedidos;

  public void hacepedidos() {
  }

}

enum estados {

  pendiente,

  pagado,

  procesando,

  enviado,

  entregado;

}
enum pago {

  tarjetacredito,

  efectivo,

  moneda;

}
public class Pedidos {

  private String nombrePedido;

  private String fechaPedido;

  private int costePedido;

  private pago tipopago;

  private plazosodirecto pagadoono;

  private estados estado;

    private Cliente myCliente;
    private Productos myProductos;

  public void pagar() {
  }

}
enum plazosodirecto {

  directo,

  plazos;

}


public class Productos {

  protected int precio;

  protected int cantidad;

  protected int impuestos;

  protected int existencias;

    protected Vector  myPedidos;

  public void calcularCantidad() {
  }

}

}
