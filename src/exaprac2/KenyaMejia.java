package exaprac2;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: Kenya Mejia
 * Fecha: 18/04/2018
 * Copyright: Itca-Fepade
 * Versión:1.0
 * @author Kenya Mejia
 */
public class KenyaMejia {
    public static void main(String[] args) {
        boolean bandera=false;
        int op,cont=0,em=0;
        String nombre[]=new String[10000];
        double salarioHora[]=new double[10000];
        int cantHoras[]=new int[10000];
        double salario,total=0;
        double salarioF[]=new double[10000];
        int i=0;
        NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
        
        
        do
        {
            op=Integer.parseInt(JOptionPane.showInputDialog("Selccione la opcion que desea\n" +
            "1- Agregar empleado\n" + 
            "2- Calcular planilla \n" + 
            "3- Salir"));
            
            if(op==1)
            {
                nombre[i]=JOptionPane.showInputDialog("EMPLEADO" + (i+1) +"\n"+"Ingrese el nombre del empleado");
                salarioHora[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora"));
                cantHoras[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
                salarioF[i]=(salarioHora[i]*cantHoras[i])-((salarioHora[i]*cantHoras[i])*0.10);
                total+=salarioF[i];
                i++;
            } 
            if(op==2)
            {
                for(int j=0;j<i;j++)
                {
                    if(salarioF[j]>800)
                    {
                            cont++;
                    }
                                
                    JOptionPane.showMessageDialog(null,"Nombre: " + nombre[j] + "\t" + "Salario: " + nf.format(salarioF[j]) + "\n" ,"PLANILLA",1);
                }
                JOptionPane.showMessageDialog(null,"Total en concepto de planilla: " + nf.format(total) + "\n" + 
                        "Cantidad de empleados que superan los $800: " + cont,"Datos adicionales",1);
                
            }
            if(op==3)
            {
                bandera=true;
                break;
            }
        }
        while(!bandera);
            
    }
}
