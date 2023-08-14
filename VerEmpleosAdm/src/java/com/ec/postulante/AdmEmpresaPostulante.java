/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.postulante;

import com.ec.empresa.*;
import com.ec.empresaferia.*;
import com.ec.entidad.*;
import com.ec.entidad.EmpresasFeria;
import com.ec.entidad.EmpresaPostulante;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import com.ec.servicio.ServicioEmpresasFeria;
import com.ec.servicio.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
import org.zkoss.zul.ListModelList;

/**
 *
 * @author root
 */
public class AdmEmpresaPostulante {

    UserCredential credential = new UserCredential();

//    /*BUSCA VACANTES*/
//    ServicioEmpresasVacante servicioEmpresasVacante = new ServicioEmpresasVacante();
//    private List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();
//    private ListModelList<EmpresasVacante> listaDatosPostulantesModel;
//    private Set<EmpresasVacante> registrosSeleccionados = new HashSet<EmpresasVacante>();
//    private String buscar = "";

    /*BUSCA POSTULANTES*/
    ServicioEmpresasPostulante servicioEmpresasPostulante = new ServicioEmpresasPostulante();
    private List<EmpresaPostulante> listaDatos = new ArrayList<EmpresaPostulante>();
    private int buscar;

    /*BUSCA PAIS*/
//    ServicioEmpresasVacante servicioEmpresasVacantePais = new ServicioEmpresasVacante();
//    private List<EmpresasVacante> listaDatosPais = new ArrayList<EmpresasVacante>();
//    private String buscarPais = "";
//    private EmpresasVacante paisSelected;

    /*LINKED LIST*/
    public AdmEmpresaPostulante() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;
        buscar();
        //getObtenerVacantes();

        //buscarPais();
    }

    private void buscar() {

        listaDatos = servicioEmpresasPostulante.findByIdVacante(buscar);

    }

//    private void buscarPostulantes(Integer idVacante) {
//
//        listaDatos2 = servicioEmpresasVacante.findByLikeDescripcionPuestoEjemplo(idVacante);
//
//    }
//    private void buscarPais() {
//
//        listaDatosPais = servicioEmpresasVacante.findByLikePais(buscarPais);
//
//    }
//
//    public List<EmpresasVacante> getListaDatosPais() {
//        return listaDatosPais;
//    }
//
//    public void setListaDatosPais(List<EmpresasVacante> listaDatosPais) {
//        this.listaDatosPais = listaDatosPais;
//    }
//
//    public List<EmpresasVacante> getListaDatos() {
//        return listaDatos;
//    }
//
//    public void setListaDatos(List<EmpresasVacante> listaDatos) {
//        this.listaDatos = listaDatos;
//    }
//
//    @Command
//    @NotifyChange({"listaDatosPostulantesModel", "buscar"})
//    public void buscarEmpresas() {
//        buscar = buscarPais;
//        buscar();
//        getObtenerVacantes();
//    }
//    @Command
//    @NotifyChange({"listaDatos", "buscar"})
//    public void buscarEmpresas(@BindingParam("valor") Empresa valor) {
//
//        buscar();
//    }
//    @Command
//    @NotifyChange({"listaDatosPais", "buscarPais"})
//    public void buscarPais(@BindingParam("valor") Empresa valor) {
//
//        buscar();
//        
//    }
//    private void getObtenerVacantes() {
//        setListaDatosPostulantesModel(new ListModelList<EmpresasVacante>(getListaDatos()));
//        ((ListModelList<EmpresasVacante>) listaDatosPostulantesModel).setMultiple(false);
//    }
//
//    @Command
//    @NotifyChange({"listaDatos2", "buscar"})
//    public void seleccionarRegistros() {
//        registrosSeleccionados = ((ListModelList<EmpresasVacante>) getListaDatosPostulantesModel()).getSelection();
//        if (registrosSeleccionados.size() > 0) {
//            for (EmpresasVacante registrosSeleccionado : registrosSeleccionados) {
//                buscarPostulantes(registrosSeleccionado.getIdvacante());
//                break;
//            }
//        }
//    }
//    @Command
//    @NotifyChange({"listaDatos2", "buscar2"})
//    public void seleccionarPostulantes(@BindingParam("valor") EmpresasVacante valor) {
//
//        buscarPostulantes(valor.getIdvacante());
//    }
//    @Command
//    @NotifyChange({"listaDatosPais", "buscarPais"})
//    public void seleccionarRegistros() {
//        registrosSeleccionados = ((ListModelList<EmpresasVacante>) getListaDatosPostulantesModel()).getSelection();
//        if (registrosSeleccionados.size() > 0) {
//            for (EmpresasVacante registrosSeleccionado : registrosSeleccionados) {
//                buscarPostulantes(registrosSeleccionado.getIdvacante());
//                break;
//            }
//        }
//    }
//    public String getBuscar() {
//        return buscar;
//    }
//
//    public void setBuscar(String buscar) {
//        this.buscar = buscar;
//    }
//
//    public ListModelList<EmpresasVacante> getListaDatosPostulantesModel() {
//        return listaDatosPostulantesModel;
//    }
//
//    public void setListaDatosPostulantesModel(ListModelList<EmpresasVacante> listaDatosPostulantesModel) {
//        this.listaDatosPostulantesModel = listaDatosPostulantesModel;
//    }
    //@Command
//    public void exportListboxToExcel() throws Exception {
//        try {
//            File dosfile = new File(exportarExcel());
//            if (dosfile.exists()) {
//                FileInputStream inputStream = new FileInputStream(dosfile);
//                Filedownload.save(inputStream, new MimetypesFileTypeMap().getContentType(dosfile), dosfile.getName());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("ERROR AL DESCARGAR EL ARCHIVO" + e.getMessage());
//        }
//    }
//
//    private String exportarExcel() throws FileNotFoundException, IOException, ParseException {
//        String directorioReportes = Executions.getCurrent().getDesktop().getWebApp().getRealPath("/reportes");
//
//        Date date = new Date();
//        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm");
//        SimpleDateFormat sm = new SimpleDateFormat("yyy-MM-dd");
//        String strDate = sm.format(date);
//
//        String pathSalida = directorioReportes + File.separator + "VacantesFeria.xls";
//        System.out.println("Direccion del reporte  " + pathSalida);
//        try {
//            int j = 0;
//            File archivoXLS = new File(pathSalida);
//            if (archivoXLS.exists()) {
//                archivoXLS.delete();
//            }
//            archivoXLS.createNewFile();
//            FileOutputStream archivo = new FileOutputStream(archivoXLS);
//            HSSFWorkbook wb = new HSSFWorkbook();
//            HSSFSheet s = wb.createSheet("VacantesFeria");
//
//            HSSFFont fuente = wb.createFont();
//            fuente.setBoldweight((short) 700);
//            HSSFCellStyle estiloCelda = wb.createCellStyle();
//            estiloCelda.setWrapText(true);
//            estiloCelda.setAlignment((short) 2);
//            estiloCelda.setFont(fuente);
//
//            HSSFCellStyle estiloCeldaInterna = wb.createCellStyle();
//            estiloCeldaInterna.setWrapText(true);
//            estiloCeldaInterna.setAlignment((short) 5);
//            estiloCeldaInterna.setFont(fuente);
//
//            HSSFCellStyle estiloCelda1 = wb.createCellStyle();
//            estiloCelda1.setWrapText(true);
//            estiloCelda1.setFont(fuente);
//
//            HSSFRow r = null;
//
//            HSSFCell c = null;
//            r = s.createRow(0);
//
//            HSSFCell chfe = r.createCell(j++);
//            chfe.setCellValue(new HSSFRichTextString("Vacante"));
//            chfe.setCellStyle(estiloCelda);
//
//            HSSFCell chfe1 = r.createCell(j++);
//            chfe1.setCellValue(new HSSFRichTextString("Pais"));
//            chfe1.setCellStyle(estiloCelda);
//
//            int rownum = 1;
//            int i = 0;
//
//            for (EmpresasVacante item : listaDatos) {
//                i = 0;
//
//                r = s.createRow(rownum);
//
//                HSSFCell cf = r.createCell(i++);
//                cf.setCellValue(new HSSFRichTextString(item.getPuesto().trim()));
//
//                HSSFCell cf1 = r.createCell(i++);
//                cf1.setCellValue(new HSSFRichTextString(item.getPais().trim()));
//
//                rownum += 1;
//
//            }
//
//            for (int k = 0; k <= listaDatos.size(); k++) {
//                s.autoSizeColumn(k);
//            }
//            wb.write(archivo);
//            archivo.close();
//
//        } catch (IOException e) {
//            System.out.println("error " + e.getMessage());
//        }
//        return pathSalida;
//
//    }
    //<editor-fold defaultstate="collapsed" desc=" ATRIBUTOS POSTULANTES"> 
    //</editor-fold > 
//    public List<EmpresasVacante> getListaDatos2() {
//        return listaDatos2;
//    }
//
//    public void setListaDatos2(List<EmpresasVacante> listaDatos2) {
//        this.listaDatos2 = listaDatos2;
//    }
//
//    public String getBuscar2() {
//        return buscar2;
//    }
//
//    public void setBuscar2(String buscar2) {
//        this.buscar2 = buscar2;
//    }
//
//    public EmpresasVacante getPaisSelected() {
//        return paisSelected;
//    }
//
//    public void setPaisSelected(EmpresasVacante paisSelected) {
//        this.paisSelected = paisSelected;
//    }
//
//    public String getBuscarPais() {
//        return buscarPais;
//    }
//
//    public void setBuscarPais(String buscarPais) {
//        this.buscarPais = buscarPais;
//    }
    public ServicioEmpresasPostulante getServicioEmpresasPostulante() {
        return servicioEmpresasPostulante;
    }

    public void setServicioEmpresasPostulante(ServicioEmpresasPostulante servicioEmpresasPostulante) {
        this.servicioEmpresasPostulante = servicioEmpresasPostulante;
    }

    public List<EmpresaPostulante> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<EmpresaPostulante> listaDatos) {
        this.listaDatos = listaDatos;
    }

}
