/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.empresa;

import com.ec.entidad.Empresa;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import com.ec.servicio.ServicioEmpresa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.activation.MimetypesFileTypeMap;
import javax.mail.internet.ParseException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Filedownload;
import org.zkoss.zul.Messagebox;

/**
 *
 * @author root
 */
public class AdmEmpresa {

    ServicioEmpresa servicioEmpresa = new ServicioEmpresa();
    UserCredential credential = new UserCredential();
    private List<Empresa> listaDatos = new ArrayList<Empresa>();

    private String buscar = "";

    public AdmEmpresa() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;

    }

    private void buscar() {

        listaDatos = servicioEmpresa.findEmpresaPorNombre(buscar, credential.getUsuarioSistema());
    }

    public List<Empresa> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<Empresa> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @Command
    @NotifyChange({"listaDatos", "buscar"})
    public void buscarEmpresas(@BindingParam("valor") Empresa valor) {

        buscar();
    }

    @Command
    @NotifyChange({"listaDatos", "buscar"})
    public void activarPlan(@BindingParam("valor") Empresa valor) {
        try {
            final HashMap<String, Empresa> map = new HashMap<String, Empresa>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                        "/modales/activaplan.zul", null, map);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void activaFeria(@BindingParam("valor") Empresa valor) {

        servicioEmpresa.modificar(valor);
    }

    @Command
    public void modificaRegistro(@BindingParam("valor") Empresa valor) {

        try {
            final HashMap<String, Empresa> map = new HashMap<String, Empresa>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                        "/modales/modalempresa.zul", null, map);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void crearRegistro() {

        try {

            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                        "/modales/modalempresa.zul", null, null);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void eliminarEmpresa(@BindingParam("valor") Empresa valor) {
        if (Messagebox.show("¿Desea eliminar el registros ?", "Atención", Messagebox.YES | Messagebox.NO, Messagebox.EXCLAMATION) == Messagebox.YES) {

        }
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    @Command
    public void exportListboxToExcel() throws Exception {
        try {
            File dosfile = new File(exportarExcel());
            if (dosfile.exists()) {
                FileInputStream inputStream = new FileInputStream(dosfile);
                Filedownload.save(inputStream, new MimetypesFileTypeMap().getContentType(dosfile), dosfile.getName());
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR AL DESCARGAR EL ARCHIVO" + e.getMessage());
        }
    }

    private String exportarExcel() throws FileNotFoundException, IOException, ParseException {
        String directorioReportes = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/reportes");

        Date date = new Date();
        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm");
        SimpleDateFormat sm = new SimpleDateFormat("yyy-MM-dd");
        String strDate = sm.format(date);

        String pathSalida = directorioReportes + File.separator + "ListaEmpresas.xls";
        System.out.println("Direccion del reporte  " + pathSalida);
        try {
            int j = 0;
            File archivoXLS = new File(pathSalida);
            if (archivoXLS.exists()) {
                archivoXLS.delete();
            }
            archivoXLS.createNewFile();
            FileOutputStream archivo = new FileOutputStream(archivoXLS);
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet s = wb.createSheet("Empresas");

            HSSFFont fuente = wb.createFont();
            fuente.setBoldweight((short) 700);
            HSSFCellStyle estiloCelda = wb.createCellStyle();
            estiloCelda.setWrapText(true);
            estiloCelda.setAlignment((short) 2);
            estiloCelda.setFont(fuente);

            HSSFCellStyle estiloCeldaInterna = wb.createCellStyle();
            estiloCeldaInterna.setWrapText(true);
            estiloCeldaInterna.setAlignment((short) 5);
            estiloCeldaInterna.setFont(fuente);

            HSSFCellStyle estiloCelda1 = wb.createCellStyle();
            estiloCelda1.setWrapText(true);
            estiloCelda1.setFont(fuente);

            HSSFRow r = null;

            HSSFCell c = null;
            r = s.createRow(0);

            HSSFCell chfe = r.createCell(j++);
            chfe.setCellValue(new HSSFRichTextString("Empresa"));
            chfe.setCellStyle(estiloCelda);

            HSSFCell chfe1 = r.createCell(j++);
            chfe1.setCellValue(new HSSFRichTextString("Razon Social"));
            chfe1.setCellStyle(estiloCelda);

            HSSFCell chfe11 = r.createCell(j++);
            chfe11.setCellValue(new HSSFRichTextString("Telefono 1"));
            chfe11.setCellStyle(estiloCelda);

            HSSFCell ch1 = r.createCell(j++);
            ch1.setCellValue(new HSSFRichTextString("Telefono 2"));
            ch1.setCellStyle(estiloCelda);

            HSSFCell ch2 = r.createCell(j++);
            ch2.setCellValue(new HSSFRichTextString("Nombre encargado"));
            ch2.setCellStyle(estiloCelda);

            HSSFCell ch22 = r.createCell(j++);
            ch22.setCellValue(new HSSFRichTextString("Apellido encargado"));
            ch22.setCellStyle(estiloCelda);

            HSSFCell ch23 = r.createCell(j++);
            ch23.setCellValue(new HSSFRichTextString("Email"));
            ch23.setCellStyle(estiloCelda);

            HSSFCell ch3 = r.createCell(j++);
            ch3.setCellValue(new HSSFRichTextString("Participa feria"));
            ch3.setCellStyle(estiloCelda);

            HSSFCell ch4 = r.createCell(j++);
            ch4.setCellValue(new HSSFRichTextString("Pais"));
            ch4.setCellStyle(estiloCelda);
            HSSFCell ch5 = r.createCell(j++);
            ch5.setCellValue(new HSSFRichTextString("Provincia/Zona"));
            ch5.setCellStyle(estiloCelda);

            int rownum = 1;
            int i = 0;

            for (Empresa item : listaDatos) {
                i = 0;

                r = s.createRow(rownum);

                HSSFCell cf = r.createCell(i++);
                cf.setCellValue(new HSSFRichTextString(item.getNombreEmpresa().trim()));

                HSSFCell cf1 = r.createCell(i++);
                cf1.setCellValue(new HSSFRichTextString(item.getRazonSocial().trim()));

                HSSFCell cf2 = r.createCell(i++);
                cf2.setCellValue(new HSSFRichTextString(item.getTelefonoPrimario().trim()));

                HSSFCell cf3 = r.createCell(i++);
                cf3.setCellValue(new HSSFRichTextString(item.getTelefonoSecundario().trim()));

                HSSFCell cf4 = r.createCell(i++);
                cf4.setCellValue(new HSSFRichTextString(item.getNombreEncargado().trim()));

                HSSFCell cf5 = r.createCell(i++);
                cf5.setCellValue(new HSSFRichTextString(item.getApellidoEncargado().trim()));

                HSSFCell cf6 = r.createCell(i++);
                cf6.setCellValue(new HSSFRichTextString(item.getEmailEmpresa().trim()));

                HSSFCell cf7 = r.createCell(i++);
                cf7.setCellValue(new HSSFRichTextString(item.getEmpParticipaFeria() != null ? item.getEmpParticipaFeria().toString() : "False"));

                HSSFCell cf8 = r.createCell(i++);
                cf8.setCellValue(new HSSFRichTextString(item.getPaistext().trim()));

                HSSFCell cf9 = r.createCell(i++);
                cf9.setCellValue(new HSSFRichTextString(item.getCiudad().trim()));

                rownum += 1;

            }

            for (int k = 0; k <= listaDatos.size(); k++) {
                s.autoSizeColumn(k);
            }
            wb.write(archivo);
            archivo.close();

        } catch (IOException e) {
            System.out.println("error " + e.getMessage());
        }
        return pathSalida;

    }

}
