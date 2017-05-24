package proyecto;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ClaseControlador implements ActionListener {

	ClaseModelo objModelo = null;
	ClaseVista objVista = null;
	ClaseVista objVista2 = null;
	ClaseVista objVista3 = null;
	ClaseVista objVista4 = null;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo, ClaseVista objVista2, ClaseVista objVista3, ClaseVista objVista4) {
		this.objModelo = objModelo;
		this.objVista = objVista;
		this.objVista2 = objVista2;
		this.objVista3 = objVista3;
		this.objVista4 = objVista4;
		actionListener(this);
	}

	
	public void actionPerformed(ActionEvent objEvento) {


		if (objEvento.getSource() == objVista.botonNumero1) {
			objVista.setVisible(false);
			objVista2.setVisible(true);
		} else if (objEvento.getSource() == objVista.botonNumero3) {
			System.exit(0);
		} else if (objEvento.getSource() == objVista.botonNumero2) {
			JOptionPane.showMessageDialog(null, "Este es un programa hecho por los integrantes del GRUPO3© de 1DM3.\n Todo uso,copia o venta de de este programa sin licencia sera ilegal\n y podra ser llevado y juzgado ante LA LEY.");
		} else if (objEvento.getSource() == objVista2.botonNumero4) {
			objVista2.setVisible(false);
			objVista3.setVisible(true);
		} else if (objEvento.getSource() == objVista2.botonSalir1) {
			objVista2.setVisible(false);
			objVista.setVisible(true);
		} else if (objEvento.getSource() == objVista2.botonNumero5) {
			objVista2.setVisible(false);
			objVista4.setVisible(true);
		} else if (objEvento.getSource() == objVista3.botonSalir2) {
			objVista3.setVisible(false);
			objVista.setVisible(true);
		} else if (objEvento.getSource() == objVista3.botonAtras2) {
			objVista3.setVisible(false);
			objVista2.setVisible(true);
		} else if (objEvento.getSource() == objVista3.botonConvertir) {

			Object moneda1 = this.objVista3.divisas.getSelectedItem();
			String dinero = this.objVista3.cajaDeTextoNumero1.getText();
			Object moneda2 = this.objVista3.divisas2.getSelectedItem();

			try {
				objModelo.conversor(moneda1, dinero, moneda2);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "No se pueden introducir letras.");

			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Tienes que elegir una moneda.");
			}
		} else if (objEvento.getSource() == objVista4.botonSalir3) {
			objVista4.setVisible(false);
			objVista.setVisible(true);
		} else if (objEvento.getSource() == objVista4.botonAtras3) {
			objVista4.setVisible(false);
			objVista2.setVisible(true);
		} else if (objEvento.getSource() == objVista4.botonNumero7) {
			objModelo.preguntasDeHistoria();
		} else if (objEvento.getSource() == objVista4.botonNumero8) {
			objModelo.preguntasDeDeportes();
		} else if (objEvento.getSource() == objVista4.botonNumero9) {
			objModelo.preguntasDeMusicas();
		}
	}

	public void actionListener(ActionListener escuchador) {
		objVista.botonNumero1.addActionListener(escuchador);
		objVista.botonNumero2.addActionListener(escuchador);
		objVista.botonNumero3.addActionListener(escuchador);
		objVista2.botonNumero4.addActionListener(escuchador);
		objVista2.botonNumero5.addActionListener(escuchador);
		objVista2.botonNumero6.addActionListener(escuchador);
		objVista4.botonNumero7.addActionListener(escuchador);
		objVista4.botonNumero8.addActionListener(escuchador);
		objVista4.botonNumero9.addActionListener(escuchador);

		objVista2.botonSalir1.addActionListener(escuchador);
		objVista3.botonSalir2.addActionListener(escuchador);
		objVista4.botonSalir3.addActionListener(escuchador);

		objVista3.botonConvertir.addActionListener(escuchador);

		objVista3.botonAtras2.addActionListener(escuchador);
		objVista4.botonAtras3.addActionListener(escuchador);
	}
}
